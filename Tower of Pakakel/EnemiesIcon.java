import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemiesIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemiesIcon extends Helpers
{
    private boolean revert ; 
    private int counter ; 
    private DisplayText displayText ; 
    private Controller world ;
    public EnemiesIcon()
    {
        
    }
    
    /**
     * Act - do whatever the EnemiesIcon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (revert)
            revertImage() ; 
    }    

    /**
     * Used by controller to change image to sword or shield icon during battle
     * True representing sword, and false representing shield
     */
    public void changeTo (boolean atkOrDef, int value)
    {
        displayText = new DisplayText() ; 
        world = (Controller) getWorld() ; 
        if (atkOrDef)
            this.setImage("Sword Icon.png") ;  
        else 
            this.setImage("Shield Icon.png") ; 
        
        revert = true ;
    }
    
    private void revertImage()
    {
        counter++ ; 
        if (counter == 70) 
        {
            displayText.setImage("Invisible.png");
            this.setImage("Invisible.png") ; 
            counter = 0 ; 
            revert = false ; 
        }
    }
}
