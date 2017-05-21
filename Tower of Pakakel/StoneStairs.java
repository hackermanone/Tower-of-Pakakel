import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoneStairs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoneStairs extends TangibleTiles
{
    private  Player player;
    private InvisiblePlayer invisPlayer;
    private Arrow arrow;
    private EnemiesIcon enemyIcon ; 

    public StoneStairs()
    {

    }

    /**
     * Act - do whatever the StoneStairs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        player = world.getPlayer();
        invisPlayer = world.getInvisPlayer();
        arrow = world.getArrow();
        enemyIcon = world.getEnemyIcon() ; 
        if(this.isTouching(Player.class) && world.getLevel() == 5)
        {
            Level6 world6 = new Level6(player,invisPlayer,arrow, enemyIcon);
            world.pauseMusic();
            Greenfoot.setWorld(world6);
        }
        //         } else if(this.isTouching(Player.class) && world.getLevel() == 2)
        //         {
        //             Level3 world3 = new Level3(player,invisPlayer,arrow, enemyIcon);
        //             Greenfoot.setWorld(world3);
        //         }
        //         else if(this.isTouching(Player.class) && world.getLevel() == 3)
        //         {
        //             Level4 world4 = new Level4(player,invisPlayer,arrow, enemyIcon);
        //             Greenfoot.setWorld(world4);
        //         }
        //         else if(this.isTouching(Player.class) && world.getLevel() == 4)
        //         {
        //             Level5 world5 = new Level5(player,invisPlayer,arrow, enemyIcon);
        //             Greenfoot.setWorld(world5);
        //         }
    }    
}
