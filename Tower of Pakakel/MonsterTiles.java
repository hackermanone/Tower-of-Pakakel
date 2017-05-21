import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Although somewhat similar to trap tiles, upon touching this tile the player will then spawn a slime to fight 
 * against.  
 * 
 * @author Justin Lam
 * @version January 2015
 */
public class MonsterTiles extends EventTiles
{
    Player player;
    Slime slime ;
   
     /**
     * Constructor for MonsterTiles.  This is only here to help identify the tile so it can be saved.  
     */ 
    public MonsterTiles()
    {
        id = 602 ; 
    }
    
    /**
     * Spawns a slime.  
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        player = world.getPlayer();
        slime = new Slime(1);
        if (this.isTouching(Player.class))
            getWorld().addObject(slime, 5, 8);
    }    
}
