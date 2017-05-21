import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * CorruptSamurai monster
 * 
 * @author Michael Ma, Ricky Chen
 * @version 1
 */
public class CorruptSamurai extends Enemies
{
    public CorruptSamurai(int level)
    {
        hp = level*2 + 5; 
        atk = level + 1; 
        def = level ; 
        id = 502;
    }

    /**
     * Act - do whatever the CorruptSamurai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
