import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Somewhat like displaytext except this class is only for story purposes.
 * 
 * @author Justin Lam
 * @version January 2015
 */
public class StoryTiles extends EventTiles
{
    protected DisplayText displayText ; 
    protected Controller world ; 
    protected String text ; 
    protected boolean countdown = false ; 
    protected int count ; 
    protected int count1 ; 

    /**
     * Constructor for StoryTiles class. lengthUp = 70 is approximately 1 second. 
     */
    public StoryTiles(String text1, int lengthUp)
    {
        id = 603 ; 
        text = text1 ; 
        count = lengthUp ; 
        count1 = lengthUp ; 
    }

    /**
     * Act - do whatever the StoryTiles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.  This sets how long the text will be displayed
     */
    public void act() 
    {
        world = (Controller) getWorld() ; 
        if(this.isTouching(Player.class) && !countdown) 
        {
            showText() ; 
            countdown = true ; 
        }
        if (countdown)
            count-- ; 
        if (count == 0)
        {
            world.removeObject(displayText) ; 
            countdown = false ; 
            count = count1 ; 
        }
    }    

     /**
     * This just displays the text.  
     */
    protected void showText()
    {
        displayText = new DisplayText(text) ; 
        world.addObject(displayText, 12, 0) ; 
    }
}
