import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Helpers
{
    private Player player;
    private List objects;
    private int counter ; 
    private boolean revert ; 
    public Arrow()
    {
    }

    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //sticks on top of the player at all times
        int x;//to become the players x
        int y;//to become the players y
        Controller world = (Controller) getWorld();//reference to the world
        objects = world.getObjects(Player.class) ; //gets all the player objects in the world to be put in a list
        player = (Player) objects.get(0) ; //makes a new player that becomes a reference to the player in the world
        x = player.getX();//sets the x co-ordinate of the player
        y = player.getY();//sets the y co-ordinate of the player
        this.setLocation(x, y - 1);//places the arrow on top of the player at all times
        // revert used for battle animations, closes the sword & shield icon after a couple seconds 
        if (revert)
            revertImage() ; 
        if (player.getHp() <= 0 )//removes the arrow if the player dies as well
        {
            world.removeObject(this);
        }
    }    

    /**
     * Used by controller to change image to sword or shield icon during battle
     * True representing sword, and false representing shield
     */
    public void changeTo (boolean atkOrDef)
    {
        revert = true ; 
        if (atkOrDef)//changes the arrow to fighting or defending icons for animation purposes only(not a major part in game)
            this.setImage("Sword Icon.png") ; 
        else 
            this.setImage("Shield Icon.png") ; 
    }

    /**
     * Used to change arrow image to an invisible picture 
     */
    private void revertImage()
    {
        counter++ ; 
        if (counter == 70) 
        {
            this.setImage("Invisible.png") ; 
            counter = 0 ; 
            revert = false ; 
        }
    }
}
