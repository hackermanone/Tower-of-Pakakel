import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldKey extends Actor
{
    private Player player;
    /**
     * Act - do whatever the GoldKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        player = world.getPlayer();
        
        if (this.isTouching(Player.class))
        {
            player.addGoldKeys();
            world.removeObject(this);
        }
    }    
}
