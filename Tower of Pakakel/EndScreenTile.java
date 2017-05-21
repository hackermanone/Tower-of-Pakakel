import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreenTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreenTile extends TangibleTiles
{
    private  Player player;
    private InvisiblePlayer invisPlayer;
    private Arrow arrow;
    private EnemiesIcon enemyIcon ; 
    public EndScreenTile()
    {
        id = 804;
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
        if(this.isTouching(Player.class) && world.getLevel() == 7)
        {
            EndScreen world8 = new EndScreen(player,invisPlayer,arrow, enemyIcon);
            world.pauseMusic();
            Greenfoot.setWorld(world8);
        }
    }
}
