import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Treeant monster
 * 
 * @author Michael Ma, Ricky Chen
 * @version 1
 */
public class Treeant extends Enemies
{

    public Treeant(int level)
    {
        hp = level * 4; 
        atk = level + 1 ; 
        def = level ; 
        id = 503;
    }

    /**
     * Act - do whatever the Treeant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
