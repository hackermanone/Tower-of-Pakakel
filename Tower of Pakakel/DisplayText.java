import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class DisplayText here.
 * 
 * @author Ricky & Michael
 * @version (a version number or a date)
 */
public class DisplayText extends Helpers
{
    private boolean stats = false;
    private boolean dynamicValue = true ;  
    private Player player;
    private String objectText;
    private GreenfootImage img = new GreenfootImage("QuestionTile.png");
    private int atk;
    private int def;
    private int hp;

    public DisplayText()
    {
    }

    /**
     * Creates a display text showing the players stats
     * @param   player1 checks that specific players stats and displays them
     */
    public DisplayText(Player player1)
    {
        stats = true;
        player = player1;
        atk = player.getAtk();
        def = player.getDef();
        hp = player.getHp();
        stats = true;
        changeTextColour("Hp : " + hp + " Atk : " + atk + " Def : "  + def ,0,0,0);
    }

    /** 
     * Create a new display text with the given text and places it with a colored background
     * 
     * @param text the text to be used in the DisplayText
     */
    public DisplayText(String text)
    {
        changeTextColour(text,243,63,0);
        objectText = text;
    }

    /**
     * Act - do whatever the DisplayText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        player = world.getPlayer();
        if(stats)
        {
            update();
        }
    }    

    
    public void changeText(int text)
    {
        String stringText = Integer.toString(text) ; 
        changeTextColour(stringText,243,63,0);
        // objectText = text;
    }
    
    
    public void changeText(String text)
    {
        changeTextColour(text,243,63,0);
        objectText = text;
    }

    

    /** 
     * Changes the text with the given string and 3 integers that determine the colour of the background
     * 
     * @param   text    The text to be used in the displayText
     * @param colour1 the first colour that determines the overall background
     * @param colour2 the second colour that determines the overall background
     * @param colour3 the third colour that determines the overall background
     */
    public void changeTextColour(String text,int colour1, int colour2, int colour3)
    {
        String stringText = text;
        Color textColour = new Color(colour1, colour2, colour3);
        GreenfootImage textImage = new GreenfootImage(text,24,textColour,Color.WHITE);
        this.setImage(textImage);
        dynamicValue = false ; 
    }

    public void objectText(String text)
    {
        String stringText = text;
        GreenfootImage textImage = new GreenfootImage(stringText,20,Color.WHITE, Color.BLACK);
    }

    /**
     * Updates the players stats to be used for displaying
     */
    public void update()
    {
        atk = player.getAtk();
        def = player.getDef();
        hp = player.getHp();
        changeTextColour("Hp : " + hp + " Atk : " + atk + " Def : "  + def ,0,0,0);
    }

}
