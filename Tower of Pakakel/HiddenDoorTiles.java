import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this door does not exist until the button is pressed.  This door will replace a wall tile so that what
 * was once tangible becomes intangible. 
 * 
 * @author Justin Lam
 * @version January 2015
 */
public class HiddenDoorTiles extends EventTiles
{
    Player player;
    InvisiblePlayer invisPlayer;
    
    /**
     * Constructor for HiddenDoorTiles.  This is only here to help identify the tile so it can be saved.  
     */
    public HiddenDoorTiles()
    {
        id = 601 ; 
    }
    
    /**
     * Act - do whatever the HiddenDoorTiels wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment. Basically just removes the object after it has
     * been touched by invisiblePlayer. 
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        player = world.getPlayer();
        invisPlayer = world.getInvisPlayer();
        if(this.isTouching(InvisiblePlayer.class))
        {
            world.removeObject(this);
        }
    }    
}
