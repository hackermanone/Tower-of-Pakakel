import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SilverKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SilverKey extends Objects
{
    
    public SilverKey()
    {
        id = 1002 ; 
    }
    
    /**
     * Act - do whatever the SilverKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        if(this.isTouching(Player.class))
        {
            world.getPlayer().addSilverKeys();
            world.removeObject(this);
        }
        
    }    
}
