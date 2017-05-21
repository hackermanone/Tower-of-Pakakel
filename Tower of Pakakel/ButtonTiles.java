import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is here to basically add the hidden door tile to the world but is not actually the hidden door.
 * As the name states its used to activate the hidden door. Basically if this tile gets pressed 
 * (is touched by player) a hidden door appears.  
 * 
 * @author Justin Lam 
 * @version January 2015
 */
public class ButtonTiles extends EventTiles
{
    Player player;
    HiddenDoorTiles hiddenDoor = new HiddenDoorTiles(); 
    Controller world = (Controller) getWorld();
    TangibleTiles fakeWall;
    int x; 
    int y;  
    /**
     * Constructor for ButtonTiles.  This is only here to help identify the tile so it can be saved.  
     */
    public ButtonTiles()
    {
        id = 605 ; 
    }

    /**
     * Create a new button tile, specify the coordinates of the hidden door relative to the button
     * Specify -y is north of the button, +y south, +x is east, and -x is west
     * @param int x, int y 
     */
    public ButtonTiles(int x2, int y2)
    {
        x = x2; 
        y = y2; 
    }

    /**
     * Act - do whatever the HiddenDoorTiles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    

    /**
     * Basically the act method.  When this is pressed it uses this code. 
     */
    public void activateButton(boolean remove)
    {
        if (remove)
        {
            world = (Controller) getWorld();
            fakeWall = (TangibleTiles) getOneObjectAtOffset(x, y, TangibleTiles.class); 
            world.removeObject(fakeWall); 
            world.addObject(hiddenDoor, this.getX() + x, this.getY() + y);
        }
        else if (!remove)
        {
            world = (Controller) getWorld();
            WoodenWall woodenwall = new WoodenWall() ; 
            world.addObject(woodenwall, x, y) ;
        }
    }

    /**
     * Returns the x value 
     */
    public int getXTarget()
    {
        return x;
    }

    /**
     * Returns the y value
     */
    public int getYTarget()
    {
        return y;
    }
}
