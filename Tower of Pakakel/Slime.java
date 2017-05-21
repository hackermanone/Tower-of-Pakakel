import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Slime monster
 * 
 * @author Michael Ma, Ricky Chen
 * @version 1
 */
public class Slime extends Enemies
{
    public Slime(int level)
    {
        hp = level + 5 ; 
        atk = level ; 
        def = level - 2; 
        id = 505;
    }
    
    /**
     * Act - do whatever the Slime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}
