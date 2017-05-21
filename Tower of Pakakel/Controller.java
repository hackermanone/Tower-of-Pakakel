import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList ; 
import java.util.List ; 
/**
 * Controller acts as the main class almost all worlds and actors call upon and use in order to
 * interact with one another. 
 * 
 * @author Michael Ma, Ricky Chen, David Shan, Justin Lam, Alvin Yao 
 * @version 1.00
 */
public class Controller extends World
{
    private int[][] grid = new int[24][16];
    private boolean canMove = true;
    private boolean fight = false ; 
    private boolean targetDead = false ; 
    // Objects used for player movement and various animatons
    private NPC npc ; 
    private Enemies targetMonster ;
    private EnemiesIcon enemyIcon ; 
    private Player player ; 
    private Arrow arrow ;
    private InvisiblePlayer invisPlayer ;
    // List of objects to constantly update objects above 
    private List numDisplays ; 
    private List enemyIcons ; 
    private List invisPlayers ;
    private List objects ; 
    private List arrows ;
    // int Level used for 
    protected int level;
    protected GreenfootSound bgm ;
    //Inventory Arrays
    int[] items = new int[12];
    boolean[] slotDisplayed = new boolean[12];

    //Equipment Variables
    int helmetId;
    int chestId;
    int bootsId;
    int weaponId;

    int helmetStat;
    int chestStat;
    int bootsStat;
    int weaponStat;

    int helmetTemp;
    int chestTemp;
    int bootsTemp;
    int weaponTemp;
    /**
     * Constructor for objects of class Controller.
     * 
     */
    public Controller(int width, int height, int pixelSize)
    {    
        // Create a new world with given parameters 
        super(width, height, pixelSize); 
    }

    public void act()
    {
        //Get list of key objects to be constantly updated
        objects = getObjects(Player.class) ; 
        arrows = getObjects(Arrow.class) ;
        invisPlayers = getObjects(InvisiblePlayer.class);
        enemyIcons = getObjects(EnemiesIcon.class) ; 
        //Catch any erros that pop up after player dies and is removed from world 
        try
        {
            //Get the first spot in Lists to grab objects 
            invisPlayer = (InvisiblePlayer) invisPlayers.get(0) ;
            arrow = (Arrow) arrows.get(0) ;
            player = (Player) objects.get(0) ;
            enemyIcon = (EnemiesIcon) enemyIcons.get(0) ;
        }
        catch (IndexOutOfBoundsException e){}
        recieveCommands() ; 
    }

    /**
     * Recieve player commands to move and other interactive activites
     */
    public void recieveCommands()
    {
        //Move forward one block if pressed
        if (Greenfoot.isKeyDown("space")) 
            moveForward() ; 

        // Either set direction of arrow for player to move in or to both set and move 
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) 
        {
            arrow.setImage("ArrowLeft.png");
            player.setImage("playerLeft.png");
            player.setRotation(180) ; 
            invisPlayer.setRotation(180);
        }
        else if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            arrow.setImage("ArrowRight.png");
            player.setImage("playerStraight.png");
            player.setRotation(0) ;
            invisPlayer.setRotation(0);
        }
        else if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
        {
            arrow.setImage("ArrowUp.png");
            player.setImage("playerUp.png");
            player.setRotation(270) ; 
            invisPlayer.setRotation(270);
        }
        else if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
        {
            arrow.setImage("ArrowDown.png");
            player.setImage("playerDown.png");
            player.setRotation(90) ; 
            invisPlayer.setRotation(90);
        }
        else if(Greenfoot.isKeyDown("r"))
        {   
            for(int i = 0 ; i < 12; i++){
                System.out.print(items[i]+ " ");
            }
            System.out.println();
        }

        // If use wasd then move will be faster and automatic w/o use of space 
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("d"))
            moveForward() ;
        else if (Greenfoot.isKeyDown("w"))
            moveForward()  ;
    }

    /**
     * Class to move player forward while checking for whiles and other interactive objects 
     */
    private void moveForward()
    {
        //Moves invisplayer up one block to check if wall ahead 
        invisPlayer.move(1);
        //Prevents player movement if wall is detected
        if(invisPlayer.isTouchingV2())
            canMove = false ;

        if (invisPlayer.isTouchingHotPot())
            player.addHp(1000) ; 
        if (invisPlayer.talkNPC())
        {
            npc = invisPlayer.getNPC() ; 
            // Can't touch this = npc.setLocation(player.getX(), player.getY()) ; 
            npc.speak() ; 
        }

        //Checks if a monster is ahead with invisplayer
        if (invisPlayer.detectFight()) 
            initiateFight(invisPlayer.getTarget()) ; 

        //Checks if invisplayer pressed a button 
        if (invisPlayer.pressButton())
        {
            //Grab button invisplayer is touching if it detects one and activates 
            ButtonTiles buttonTile = invisPlayer.getButton() ; 
            if (level == 5)
                buttonTile.activateButton(false) ; 
            else
                buttonTile.activateButton(true) ; 
            removeObject(buttonTile) ; 
        }

        // If no fight detected move as usual
        if (canMove && !fight)
        {
            Greenfoot.delay(6) ; 
            player.move(1) ;
        }
        // If fight is detected and monster not in a wall fight animations will begin 
        else if (canMove && fight)
        {
            player.move(1) ;
            Greenfoot.delay(15) ; 
            player.move(-1) ; 
            invisPlayer.move(-1) ;  
            Greenfoot.delay(15) ; 
            if (!targetDead)
                enemyAttack(targetMonster, player) ; 
            fight = false ; 
        }
        else
            invisPlayer.move(-1);
        canMove = true;
    }

    private void initiateFight(Enemies enemy)
    {
        //Sets variables for fight animations
        fight = true ;
        //Change arrow picture to sword and shield icon 
        arrow.changeTo(true) ; 
        //Sets enemyIcon location to detected enemy to also give animations to enemy
        enemyIcon.setLocation(enemy.getX(), enemy.getY() - 1) ; 
        enemyIcon.changeTo(false,enemy.getDef()) ; 
        int newHp = playerAttack(player, enemy) ; 
        int currHp = player.getHp() ; 
        //Check if monster did any damage, if monster does nothing player instakills to prevent redundant fighting
        if (newHp == currHp)
        {
            targetDead = true ; 
            removeObject(enemy) ; 
        }
        else
            player.setHp(newHp) ; 
        //Check if player died
        if (currHp <= 0)
            removeObject(player) ;  
    }

    /**
     * Specify the player and the monster it is facing, and startBattle will return the player's
     * resulting hp after the engagement or -1 if the player dies 
     * @return int newPlayerHp
     */
    public int playerAttack(Player player, Enemies monster) 
    {
        //Get values needed to calculate battle outcome
        int enemyHp = monster.getHp() ;
        int enemyAtk = monster.getAtk() ; 
        int enemyDef = monster.getDef() ;
        int playerHp = player.getHp() ; 
        int playerAtk =  player.getAtk() ; 
        int playerDef = player.getDef() ; 
        int newPlayerHp ; 
        targetMonster = monster ; 
        targetDead = false ; 
        //Sets hp of actors involved
        enemyHp -=  playerAtk - enemyDef ; 
        newPlayerHp = playerHp - (enemyAtk - playerDef) ;
        monster.setHp(enemyHp) ; 
        // If enemy dies then it does not retaliate
        if (enemyHp > 0)
            return newPlayerHp ;
        else
        {
            targetDead = true ; 
            return playerHp ;
        }
    }

    /**
     * Enemy attack class used to calculate and animate the enemie's attack 
     */
    private void enemyAttack(Enemies monster, Player player) 
    {
        //Delay so player and enemy don't jumble up into a graphic mess 
        Greenfoot.delay(10) ; 
        //Sets shield icon for player
        arrow.changeTo(false) ; 
        //Sets attack icon for enemy 
        enemyIcon.changeTo(true,monster.getAtk()) ; 
        //Get monster's current values to return to 
        int returnX = monster.getX() ; 
        int returnY = monster.getY() ; 
        //Move monster ontop of player to show attack
        monster.setLocation(player.getX(), player.getY()) ; 
        Greenfoot.delay(15) ; 
        //Move monster back after slight delay 
        monster.setLocation(returnX, returnY) ; 
        Greenfoot.delay(7) ; 
    }

    /**
     * @return player object stored in this class
     */
    public Player getPlayer()
    { 
        return player ; 
    }

    /**
     * @return invisplayer object stored in this class
     */
    public InvisiblePlayer getInvisPlayer()
    {
        return invisPlayer ; 
    }

    /**
     * @return arrow object stored in this class 
     */
    public Arrow getArrow()
    {
        return arrow;
    }

    /**
     * @return enemyicon object stored in this class
     */
    public EnemiesIcon getEnemyIcon()
    {
        return enemyIcon ; 
    }

    /**
     * @return current level 
     */
    public int getLevel()
    {
        return level;
    }

    /**
     * Increased level number 
     */
    public void addLevel()
    {
        level++;
    }

    /**
     * Pauses music 
     */
    public void pauseMusic()
    {
        bgm.pause();
    }

    /**
     * Removes all objects from the world
     */
    public static void removeItemsFromWorld(World w)
    {
        w.removeObjects(w.getObjects(Potions.class));
        w.removeObjects(w.getObjects(SilverKey.class));
        w.removeObjects(w.getObjects(BronzeKey.class));
        w.removeObjects(w.getObjects(WoodenDoor.class));
        w.removeObjects(w.getObjects(IronDoor.class));
        w.removeObjects(w.getObjects(NPC.class));
        w.removeObjects(w.getObjects(Enemies.class));
    }

    /**
     * Returns the ID of the specified item stored at the index of slot
     * in the inventory
     * 
     * @param   slot    An integer 0-11 that specifies the index to be referenced in the inventory
     * @return          The item ID that is stored at specified slot. Will return 0 if slot does not fall within 0-11
     */
    public int getItemAtSlot(int slot)
    {
        if ( (slot >= 0) && (slot <= 11) )
        {
            return items[slot];
        }
        return 0;
    }

    /**
     * Takes an integer slot, and an integer ID of an item.
     * Sets the inventory space at specified slot to hold the itemID.
     * 
     * @param   slot    An integer 0-11 that specifies the index to be referenced in the inventory
     * @param   itemId  An integer that represents the ID of the item to be stored in slot
     * @return          @return true if the operation succeeded. False if it did not.
     */
    public boolean setItemAtSlot(int slot, int itemId)
    {
        if ( (slot >= 0) && (slot <= 11) )
        {
            items[slot] = itemId;
            return true;
        }
        else{
            return false;
        }
    }
}
