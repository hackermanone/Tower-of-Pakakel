import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Scanner;
/**
 * Write a description of class TextButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextButton extends Helpers
{
    private NPC npc ; 
    private boolean stickOn ; 
    GreenfootImage background;
    GreenfootImage myImage;
    MouseInfo mouse ;
    int mx;
    int my;
    String myText;
    int myFont;

    public TextButton(String text,int font)
    {
        myText = text;
        myFont = font;
        prep(text,font);
    }

    public TextButton(String text,int font, Actor actor)
    {
        npc = (NPC) actor ; 
        myText = text;
        myFont = font;
        prep(text,font);
    }

    /**
     * Act - do whatever the TextButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    

    public void prep(String text,int font)
    {
        //places a text button on top of a npc(which is their text dialog)
        if (stickOn)
        {
            this.setLocation(npc.getX(), npc.getY()) ; 
            stickOn = false ; 
        }
        myImage = new GreenfootImage(text,font,Color.WHITE,Color.BLACK);//creates new text iamge
        background = new GreenfootImage(myImage.getWidth() + 10 ,myImage.getHeight() + 10 );//creates a background for the textimage

        background.drawImage(myImage,5,5);//draws the textimage on top of the background image to merge the images together

        setImage(background);//set the text buttons image to the new one
    }

    public boolean hover(TextButton button)
    {
        mouse = Greenfoot.getMouseInfo();//gets the mouse object
        int x = button.getX();//checks where the mouse's X co-ordinate is current loacted at
        int y = button.getY();//checks for the Y co-ordinate as well

        if(mouse!=null){//if the mouse is there then it will set the X and Y values where the x and y values of the mosue it
            mx = mouse.getX();
            my = mouse.getY();
        }

        if (mx > (x - 50) && mx < (x + 50))//if the mouse is within 50 pixels of the textbuttons X 
        {
            if (my > (y - 50) && my < (y + 50))//and if the mouse is within 50 pixels of this textbuttons Y 
            {
                return true;//then it will return true
            }
        } else
            return false;//and if it isnt hovering over this butotn at all, then it will just return false
        return false;    

    }

    public void invert()
    {
      //creates temporary images so that will be replaced, the changes are the background colors that inverts the colors
        GreenfootImage tempMyImage = new GreenfootImage(myText,myFont,Color.BLACK,Color.WHITE);
        GreenfootImage tempBackground = new GreenfootImage(myImage.getWidth() + 10 ,myImage.getHeight() + 10 );//creates a background behind the text that will act as the boarder of the text

        tempBackground.drawImage(tempMyImage,5,5);//draws the textimage on top of the background for the new image

        this.setImage(tempBackground);//sets the button as this new image
    }

    public void invert2()
    {
         //creates temporary iamges that wil be replaced, the changes overall are the background colors that will return back to normal
        GreenfootImage tempMyImage1 = new GreenfootImage(myText,myFont,Color.WHITE,Color.BLACK);
        GreenfootImage tempBackground1 = new GreenfootImage(myImage.getWidth() + 10 ,myImage.getHeight() + 10 );//creates a background behind the text that will act as the boarder of the text

        tempBackground1.drawImage(tempMyImage1,5,5);//draws the textimage on top of the background for the new image

        this.setImage(tempBackground1);//sets the button as this new image
    }
}
