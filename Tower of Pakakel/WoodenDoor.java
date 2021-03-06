import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WoodenDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WoodenDoor extends TangibleTiles
{
    Player player;
    InvisiblePlayer invisPlayer;
    
    public WoodenDoor()
    {
        id = 802 ; 
    }
    
    /**
     * Act - do whatever the WoodenDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        player = world.getPlayer();
        invisPlayer = world.getInvisPlayer();
        if(this.isTouching(InvisiblePlayer.class) && player.getBronzeKeys() > 0)
        {
            world.removeObject(this);
            player.minusBronzeKeys();
        }
    }    
}
