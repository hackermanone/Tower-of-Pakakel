import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hole here.
 * 
 * @author Justin Lam 
 * @version January 2015
 */
public class Hole extends TangibleTiles
{
    private  Player player;
    private InvisiblePlayer invisPlayer;
    private Arrow arrow;
    private EnemiesIcon enemyIcon ; 
    
    /**
     * Constructor for IronDoor.  This is only here to help identify the tile so it can be saved.  
     */
    public Hole()
    {
        id = 803;
    }

    /**
     * Act - do whatever the Hole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        player = world.getPlayer();
        invisPlayer = world.getInvisPlayer();
        arrow = world.getArrow();
        enemyIcon = world.getEnemyIcon() ; 
        if(this.isTouching(Player.class) && world.getLevel() == 1)
        {
            Level2 world2 = new Level2(player,invisPlayer,arrow, enemyIcon);
            world.pauseMusic();
            Greenfoot.setWorld(world2);
        } else if(this.isTouching(Player.class) && world.getLevel() == 2)
        {
            Level3 world3 = new Level3(player,invisPlayer,arrow, enemyIcon);
            world.pauseMusic();
            Greenfoot.setWorld(world3);
        }
        else if(this.isTouching(Player.class) && world.getLevel() == 3)
        {
            Level4 world4 = new Level4(player,invisPlayer,arrow, enemyIcon);
            world.pauseMusic();
            Greenfoot.setWorld(world4);
        }
        else if(this.isTouching(Player.class) && world.getLevel() == 4)
        {
            Level5 world5 = new Level5(player,invisPlayer,arrow, enemyIcon);
            world.pauseMusic();
            Greenfoot.setWorld(world5);
        }
        else if(this.isTouching(Player.class) && world.getLevel() == 6)
        {
            Outside world7 = new Outside(player,invisPlayer,arrow, enemyIcon);
            world.pauseMusic();
            Greenfoot.setWorld(world7);
        }
    }    
}