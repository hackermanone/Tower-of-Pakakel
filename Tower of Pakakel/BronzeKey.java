import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BronzeKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BronzeKey extends Objects
{
    
    public BronzeKey()
    {
        id = 1001 ; 
    }
    
    /**
     * Act - do whatever the BronzeKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {        
        Controller world = (Controller) getWorld();
        if(this.isTouching(Player.class))
        {
            world.getPlayer().addBronzeKeys();
            world.removeObject(this);
        }
        
        
    }    
}
