import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player class. He doesn't do much though, full of accessors and mutators for controller to control and 
 * enable battling
 * 
 * @author Ricky
 * @version 1
 */
public class Player extends Friendlies
{
    private int maxHp = 50 ; 
    private int currHp = 50 ; 
    private int atk = 4 ; 
    private int def = 1 ; 
    private int result ; 
    private int bronzeKeys = 0;
    private int silverKeys = 0;
    private int goldKeys = 0;

    public Player()
    {
        id = 701 ; 
    }

    /**
     * Creates a new player with the given maxHp, currentHp, attack, defense, and the amount of keys that
     * the player currently has on him(Silver or bronze)
     * 
     * @param   maxHp the max amount of HP the player can have
     * @param   currHp  the amount of HP the player currently has
     * @param   atk the amount of attack damage the player has
     * @param   def the amount of defense the player can block  
     * @param   bronzeKeys  the amount of bronze keys the player has
     * @param   silverKeys the amount of silver keys the player has
     *
     */
    public Player(int maxHp, int currHp, int atk, int def, int bronzeKeys, int silverKeys)
    {
        //sets the values for all the variables
        this();
        this.maxHp = maxHp;
        this.currHp = currHp;
        this.def = def;
        this.bronzeKeys = bronzeKeys;
        this.silverKeys = silverKeys;
    }

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int newhp ; 
    }    

    /**
     * @returns the maxHp the player can have
     */
    public int getMaxHp()
    {
        return maxHp ; 
    }

    /**
     * @returns the Hp the player currently has
     */
    public int getHp()
    {
        return currHp ; 
    }

    /**
     * @returns the attack the player can deal
     */
    public int getAtk()
    {
        return atk ; 
    }

    /**
     * @returns the defense the player has
     */
    public int getDef()
    {
        return def ; 
    }

    /**
     * @returns the amount of bronze keys the player current holds
     */
    public int getBronzeKeys()
    {
        return bronzeKeys;
    }

    /**
     * @returns the amount of silver keys the player current holds
     */
    public int getSilverKeys()
    {
        return silverKeys;
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~           MUTATORS         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\
    /**
     * sets the current hp to the sum of the amount specifed and the current hp
     * 
     * @param   increment the amount of hp to be added
     */
    public void addHp(int increment)
    {
        currHp += increment ; 
        if (currHp > maxHp)
            currHp = maxHp ; 
    }

    /**
     * sets the maxHp to the sum of the amount specifed and the current max hp
     * 
     * @param   increment the amount of maxHp to be added
     */
    public void addMaxHp(int increment)
    {
        maxHp += increment ; 
    }

    /**
     * sets the hp to the value specifed
     * 
     * @param   value   the value of the new hp
     */
    public void setHp(int value)
    {
        currHp = value ; 
    }

    /**
     * adds the attack value of the player by the specifed amount
     * 
     * @param   increment the amount of maxHp to be added
     */
    public void addAtk(int increment)
    {
        atk += increment;
    }

    /**
     * adds the defense of the player by the specifed amount
     * 
     * @param   increment the amount of maxHp to be added
     */
    public void addDef(int increment)
    {
        def += increment;
    }

    /**
     * adds the amount of bronzeKeys the player currnetly has by one
     */
    public void addBronzeKeys()
    {
        bronzeKeys ++;
    }

    /**
     * adds the amount of silver keys the player currnetly has by one
     */
    public void addSilverKeys()
    {
        silverKeys ++;
    }
    
    /**
     * adds the amount of maxHp to the player by the specified amount
     * 
     * @param   increment the amount of max hp to be added
     */
    public void addMaxHP(int increment){
        maxHp += increment;
    }

    /**
     * subtracts the amount of bronzeKeys the player currnetly has by one
     */
    public void minusBronzeKeys()
    {
        bronzeKeys--;
    }

    /**
     * subtracts the amount of silver keys the player currnetly has by one
     */
    public void minusSilverKeys()
    {
        silverKeys--;
    }

    /**
     * subtracts the amount of hp the player currnetly has by the the specified amount
     * 
     * @param   increment the amount of hp to be subtracted
     */
    public void minusHealth(int increment)
    {
        currHp -= increment;
    }

    /**
     * subtracts the amount of maxHp the player currnetly has by the the specified amount
     * 
     * @param   increment the amount of maxhp to be subtracted
     */
    public void decMaxHP(int increment){
        maxHp -= increment;
    }

    /**
     * subtracts the amount of def the player currnetly has by the the specified amount
     * 
     * @param   increment the amount of def to be subtracted
     */
    public void decDef(int increment){
        def -= increment;
    }

    /**
     * subtracts the amount of attack the player currnetly has by the the specified amount
     * 
     * @param   increment the amount of attack to be subtracted
     */
    public void decAtk(int increment){
        atk -= increment;
    }        
    
    public void minusGoldKeys()
    {
        goldKeys --;
    }
    
    public int getGoldKeys()
    {
        return goldKeys;
    }
    
    public void addGoldKeys()
    {
        goldKeys ++;
    }
}
