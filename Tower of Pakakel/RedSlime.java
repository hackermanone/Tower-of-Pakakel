import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Red Slime monster
 * 
 * @author Michael Ma, Ricky Chen
 * @version 1
 */
public class RedSlime extends Enemies
{
    public RedSlime(int level)
    {
        hp = level*3;
        atk = level*2; 
        def = level; 
        id = 501;
    }

    /**
     * Act - do whatever the RedSlime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
