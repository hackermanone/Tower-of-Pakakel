import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Traptiles is as the name states a tile which is a trap.  Once the player touches this they lose health 
 * and the trap is removed. 
 * 
 * @author Justin Lam
 * @version January 2015
 */
public class TrapTiles extends EventTiles
{
    Player player;

    /**
     * Constructor for TrapTiles.  This is only here to help identify the tile so it can be saved.  
     */
    public TrapTiles()
    {
        id = 604 ; 
    }

    /**
     * Traptiles is as the name states a tile which is a trap.  Once the player touches this they lose health 
     * and the trap is removed.  
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        player = world.getPlayer();
        if (this.isTouching(Player.class))
        {
            player.minusHealth(5);
            world.removeObject(this);
        }
    }    
}
