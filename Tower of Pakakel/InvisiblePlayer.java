import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List ; 
/**
 * Write a description of class InvisiblePlayer here.
 * 
 * @author Ricky & Michael
 * @version 2015
 */
public class InvisiblePlayer extends Helpers
{
    Player player ;
    Controller world ; 
    List players ; 
    /**
     * Act - do whatever the InvisiblePlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          Controller world = (Controller) getWorld() ; //reference to the world
        player = world.getPlayer();//reference to the player in the world(there is only one)
        players = world.getObjects(Player.class) ; 
    }    

    /**
     * Method to check whether or not the player will hit a wall or not
     * 
     * @return true if the player cannot move infront and false if he can
     */
    public boolean isTouchingV2()

    {
          //there are certain exceptions to which the player can move through a normally impassible tile (such as door) if the play has a key
        if (player.getBronzeKeys() > 0 && this.isTouching(WoodenDoor.class) || player.getSilverKeys() > 0 && this.isTouching(IronDoor.class) || this.isTouching(StoneStairs.class))
            return false;
        else if (this.isTouching(Hole.class))//or if the player is touching a hole
            return false;
        else if (this.isTouching(TangibleTiles.class) || this.isTouching(NPC.class) || this.isTouching(HotPot.class))
            return true;
        else
            return false;
    }

    /**
     * 
     * @param   true if it is touching a hot pot and false if it isnt
     */
    public boolean isTouchingHotPot()
    {
        if (this.isTouching(HotPot.class)) 
            return true ; 
        return false ; 
    }
    
    /**
     * @param   true if it is touching a NPC and false if it isnt
     */
    public boolean talkNPC()
    {
        if (this.isTouching(NPC.class))
            return true ;
        return false ; 
    }

    /**
     * @param true if it is touching an enemy and false if it isnt
     */
    public boolean detectFight()
    {
        if (this.isTouching(Enemies.class))
        {
            return true ; 
        }
        return false ; 
    }

    /**
     * gets one enemy and returns it
     * @return  Enemies the enemy it finds in its range
     */
    public Enemies getTarget()
    {
        return (Enemies) getOneIntersectingObject(Enemies.class) ; 
    }

    /**
     * @return  NPC returns the npc that it finds
     */
    public NPC getNPC()
    {
        return (NPC) getOneIntersectingObject(NPC.class) ; 
    } 
    
    /**
     * @return  true if it is touching a button and false if it isnt
     */
    public boolean pressButton()
    {
        if (this.isTouching(ButtonTiles.class))
            return true ; 
        return false ; 
    }
    
    /**
     * @return  ButtonTiles returns a buttontile in the vicinity
     */
    public ButtonTiles getButton()
    {
        return (ButtonTiles) getOneIntersectingObject(ButtonTiles.class) ; 
    }
}
