import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;

/**
 * TitleScreen where user can start, continue previous game, or view info 
 * 
 * @author Ricky Chen 
 * @version 1
 */
public class TitleScreen extends Controller
{
    private TextButton textbutton;
    private TextButton textbutton3;
    private TextButton textbutton4;
    private TextButton textbutton5;
    private boolean text5 = false;
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 640, 1); 
        bgm = new GreenfootSound("Title.mp3");
        bgm.playLoop();
        prepare();
    }

    public void act()
    {

        if (Greenfoot.mouseClicked(textbutton3))
        {
            Level1 world = new Level1();
            pauseMusic();
            Greenfoot.setWorld(world);
        }
        if (Greenfoot.mouseClicked(textbutton4))
        {
            loadSaveGame();
            //Put DAAAVIIIIDS CODE HERE SWAG TO LOAD SWAG G PALLY SWAG
            //use the levels second constructor (or third i forgot) swag
            //David shan swag swag yolo 420 blaze it
        }
        if (Greenfoot.mouseClicked(textbutton5) && text5 == false)
        {
            extra();
            text5 = true;
        }else if(Greenfoot.mouseClicked(textbutton5) && text5 == true)
        {
            text5 = false;
            removeObject(textbutton);
        }

        if (textbutton3.hover(textbutton3))
        {
            textbutton3.invert();
        } else
            textbutton3.invert2();
        if (textbutton4.hover(textbutton4))
        {
            textbutton4.invert();
        }else
            textbutton4.invert2();

        if (textbutton5.hover(textbutton5))
        {
            textbutton5.invert();
        } else
            textbutton5.invert2();
    }

    public void prepare()
    {

        textbutton3 = new TextButton("   Start   ", 40);
        addObject(textbutton3, 200, 591);
        textbutton4 = new TextButton( "  Continue  ", 40);
        addObject(textbutton4, 450, 591);
        textbutton5 = new TextButton("   Info   ", 40);
        addObject(textbutton5, 700, 591);

    }

    public void extra()
    {
        textbutton = new TextButton("  Creators : Michael \n David \n Justin \n  Alvin\n Ricky\n",70);
        addObject(textbutton,480,320);
    }

       public void loadSaveGame()
    {
        // REFERENCES FOR A PLAYER, ARROW, INVISIBLEPLAYER, AND THE LOADED WORLD
        // Player and World will gradually reference new instances of Player and Controller(like a new level)
        Player p = new Player();
        Arrow arrow = new Arrow();
        InvisiblePlayer ip = new InvisiblePlayer();
        Controller world = new Level1();
        try{
            // MORE INITIALIZING, 
            Scanner s = new Scanner(new File("save.txt")); // LOAD UP SAVE.TXT
            boolean done = false; // Purposes of indicating when Scanner is done iterating through the text file
            int mHp, cHp, atk, def, bKeys, sKeys, level = 0;
            int numLines = 1; // ***THE LINE # OF THE .TXT FILE
            do{ // Run through the .txt file line by line
                // More initializing, but resets after each iteration - key to the data loading process - purposes outlined below
                Enemies currentEnemy = null; // Empty for now, but checks if the current object being loaded is a subclass of Enemies, and if yes, stores a new instance of it in this variable
                NPC currentNpc = null; // Empty for now, but checks if the current object being loaded is a NPC or not, and stores a new instance of it here if it is
                boolean isAButtonTile = false; // Checks if it is a ButtonTile or not
                int xButtonTile = 0;
                int xToPut = 0; //xCoordinate and yCoordinate of loaded object
                int yToPut = 0;
                try{
                    String[] currentLine = s.nextLine().split("\\s+"); // Gets the current line in save.txt file, splits it into a String array
                    for(int i = 0; i < currentLine.length; i++) // Run through the splitted line (ex: line was 3 4 5 - turns to {"3","4","5"})
                    {
                        int num = Integer.parseInt(currentLine[i]); // Convert the current element in currentLine to an integer
                        if (numLines == 1) // IF Line 1 of the TXT file: check the first line for the player's saved stats
                        {
                            mHp = Integer.parseInt(currentLine[0]); // Max HP of the player
                            cHp = Integer.parseInt(currentLine[1]); // HP of the player
                            atk = Integer.parseInt(currentLine[2]); // Atk# of the player 
                            def = Integer.parseInt(currentLine[3]); // Def# of the player
                            bKeys = Integer.parseInt(currentLine[4]); // BronzeKey# of the player
                            sKeys = Integer.parseInt(currentLine[5]); // SilverKey# of the player
                            p = new Player(mHp, cHp, atk, def, bKeys, sKeys); // Set P to a new instance of Player with the above loaded stats
                            // p = new Player(mHp, 0, 0, 0, 0, 0);
                        }
                        else if (numLines == 2) // Line 2: check what level the player has saved on
                        {
                            // Depending on what level, set world reference to new instance of that level
                            if (num == 1) // LEVEL 1
                            {
                                level = 1;
                                world = new Level1();
                            }
                            if (num == 2) // LEVEL 2
                            {
                                level = 2;
                                world = new Level2(p, ip, arrow, new EnemiesIcon());
                            }
                            if (num == 3) // LEVEL 3
                            {
                                level = 3;
                                world = new Level3(p, ip, arrow, new EnemiesIcon());
                            }
                            if (num == 4) // LEVEL 4
                            {
                                level = 4;
                                world = new Level4(p, ip, arrow, new EnemiesIcon());
                            }
                            if (num == 5) // LEVEL 5
                            {
                                level = 5;
                                world = new Level5(p, ip, arrow, new EnemiesIcon());
                            }
                            //Greenfoot.setWorld(world);
                            removeItemsFromWorld(world);
                        }
                        else if (numLines == 3) // Line 3: load the inventory
                        {
                        }
                        else if (numLines == 4) // Line 4: load the player's equipment
                        { // i - referencing the index# in the StringArray currentLine
                            if (i == 0) // load helmet
                                world.helmetId = num;
                            if (i == 1) // load helmet stat
                                world.helmetStat = world.helmetTemp = num;
                            if (i == 2) // load chestarmour
                                world.chestId = num;
                            if (i == 3) // load chest stat
                                world.chestStat = world.chestTemp = num;
                            if (i == 4) // load boots
                                world.bootsId = num;
                            if (i == 5) // load boots stat
                                world.bootsStat = world.bootsTemp = num;
                            if (i == 6) // load weapon
                                world.weaponId = num;
                            if (i == 7) // load weapon stat
                                world.weaponStat = world.weaponTemp = num;
                        }
                        else // Once past lines 1-4 which were reserved for player loading, load the map entities(enemies, keys, doors, npcs,
                        {
                            if (i == 0) // First element of the line is the X coordinate of where to place the object
                                xToPut = num;
                            if (i == 1) // Second element of the line is the Y coordinate
                                yToPut = num;
                            if (i == 2) // Third element! : big list of ids, loads an object based on the id provided
                            {
                                //                             if (num == 801)
                                //                             {
                                //                                 world.addObject(new BloodyWoodenFloor(), xToPut, yToPut);
                                //                             }
                                if (num == 802)
                                {
                                    world.addObject(new WoodenDoor(), xToPut, yToPut);
                                }
                                if (num == 804)
                                {
                                    world.addObject(new IronDoor(), xToPut, yToPut);
                                }
                                //                             if (num == 805)
                                //                             {
                                //                                 world.addObject(new WoodenWall(), xToPut, yToPut);
                                //                             }
                                // 
                                // EVENT TILES
                                if (num == 605)
                                {
                                    isAButtonTile = true;
                                }
                                // PLAYER AND ENEMIES
                                if (num == 701)
                                {
                                    p.setLocation(xToPut, yToPut);
                                    arrow.setLocation(xToPut, yToPut-1);
                                    ip.setLocation(xToPut, yToPut);
                                }
                                if (num == 501)
                                {
                                    currentEnemy = new RedSlime(level);
                                    world.addObject(currentEnemy, xToPut, yToPut);
                                }
                                if (num == 502)
                                {
                                    currentEnemy = new CorruptSamurai(level);
                                    world.addObject(currentEnemy, xToPut, yToPut);
                                }
                                if (num == 503)
                                {
                                    currentEnemy = new Treeant(level);
                                    world.addObject(currentEnemy, xToPut, yToPut);
                                }
                                if (num == 504) // PLANT NEEDS REBUGGING
                                {
                                    currentEnemy = new Plant(); // LEVEL
                                    world.addObject(currentEnemy, xToPut, yToPut);
                                }
                                if (num == 505)
                                {
                                    currentEnemy = new Slime(level);
                                    world.addObject(currentEnemy, xToPut, yToPut);
                                }
                                // NPCS
                                if (num == 702)
                                {
                                    currentNpc = new DojoMaster();
                                    world.addObject(currentEnemy, xToPut, yToPut);
                                }
                                if (num == 703)
                                {
                                    currentNpc = new PickyRicky();
                                    world.addObject(currentNpc, xToPut, yToPut);
                                }
                                if (num == 704)
                                {
                                    currentNpc = new WiseJeff();
                                    world.addObject(currentNpc, xToPut, yToPut);
                                }
                                if (num == 705)
                                {
                                    currentNpc = new TroubledAlice();
                                    world.addObject(currentNpc, xToPut, yToPut);
                                }
                                // KEYS
                                if (num == 1001)
                                {
                                    world.addObject(new BronzeKey(), xToPut, yToPut);
                                }
                                if (num == 1002)
                                {
                                    world.addObject(new SilverKey(), xToPut, yToPut);
                                }
                                // POTIONS
                                if (num == 401)
                                {
                                    world.addObject(new AttackPotion(), xToPut, yToPut);
                                }
                                if (num == 402)
                                {
                                    world.addObject(new DefencePotion(), xToPut, yToPut);
                                }
                                if (num == 403)
                                {
                                    world.addObject(new MaxHealthPotion(), xToPut, yToPut);
                                }
                                if (num == 404)
                                {
                                    world.addObject(new HealthPotion(), xToPut, yToPut);
                                }
                                if (num == 405)
                                {
                                    world.addObject(new AllPotion(), xToPut, yToPut);
                                }
                                if (num == 406)
                                {
                                    world.addObject(new AttackDefPotion(), xToPut, yToPut);
                                }
                                // BOOTS
                                if (num == 301)
                                {
                                    world.addObject(new LeatherBoots(), xToPut, yToPut);
                                }
                                if (num == 302)
                                {
                                    world.addObject(new IronBoots(), xToPut, yToPut);
                                }
                                // HELMETS
                                if (num == 101)
                                {
                                    world.addObject(new WoolenHat(), xToPut, yToPut);
                                }
                                if (num == 102)
                                {
                                    world.addObject(new VikingHelmet(), xToPut, yToPut);
                                }
                                // CHEST ARMOR
                                if (num == 201)
                                {
                                    world.addObject(new ClothArmour(), xToPut, yToPut);    
                                }
                                if (num == 202)
                                {
                                    world.addObject(new WoodenArmour(), xToPut, yToPut);
                                }
                                // WEAPONS
                                if (num == 1)
                                {
                                    world.addObject(new Sword(), xToPut, yToPut);
                                }
                                if (num == 2)
                                {
                                    world.addObject(new Axe(), xToPut, yToPut);
                                }
                                if (num == 3)
                                {
                                    world.addObject(new Spear(), xToPut, yToPut);
                                }
                            }
                            // Load Enemy's HP at the time of save
                            // Or load the NPC's quest completion status
                            if (i == 3)
                            {
                                if (currentEnemy!=null)
                                    currentEnemy.setHp(num);
                                if (currentNpc!=null)
                                {
                                    boolean status = (num != 0); // Conversion of Int to Boolean
                                    currentNpc.setQuestStatus(status); // Set the quest status to True or False depending on what was saved
                                }
                                if (isAButtonTile)
                                {
                                    xButtonTile = num; // If it's a button tile, save it's target X coordinate for later loading
                                }
                            }
                            // Load NPC's further quest completion status (ie: if quest completed but reward not claimed)
                            if (i == 4)
                            {
                                if (currentNpc!=null)
                                {
                                    boolean status = (num != 0);
                                    currentNpc.setRewardsGivenStatus(status);
                                }
                                if (isAButtonTile) // If the object ID indicates it is a ButtonTile, load the 
                                {
                                    if (world.getObjectsAt(xToPut, yToPut, ButtonTiles.class).size() < 1)
                                        world.addObject(new ButtonTiles(xButtonTile, num), xToPut, yToPut);
                                }
                            }                           
                        }
                    }
                }
                catch(NoSuchElementException e) // Reached the end of the txt file, will indicate it is done
                {
                    done = true;
                }
                numLines++; // Once done iterating through a line in the txt - move on to the next and iterate through that
            } while (!done);
            Greenfoot.setWorld(world); // Once done iterating through the txt file, finally 'load' the new world in
        }
        catch(Exception e) // Just in case
        {
            System.out.println("Exception: " + e);
        }
    }
}
