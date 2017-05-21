import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemies superclass, mainly consisted of accessors and mutators for controller to control battling
 * 
 * @author Michael Ma, Ricky Chen
 * @version 1
 */
public class Enemies extends GameObjects
{
    protected int maxHp ; 
    protected int hp ; 
    protected int atk ; 
    protected int def ; 
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public int getHp()
    {
        return hp ; 
    }
  
    public int getAtk()
    {
        return atk ; 
    }
    
    public int getDef()
    {
        return def ; 
    }
    
    public void setHp(int newHp)
    {
        hp = newHp ; 
    }
}
