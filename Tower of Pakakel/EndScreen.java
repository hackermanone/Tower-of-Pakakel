import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * End screen for when game is complete 
 * 
 * @author Justin Lam
 * @version 1
 */
public class EndScreen extends Controller
{

    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {
        super(24,16,40); 
    }
    
    /**
     * Constructor for objects of class Level6.
     * 
     */
    public EndScreen(Player player,InvisiblePlayer invisPlayer,Arrow arrow, EnemiesIcon enemyIcon)
    {    
        super(24,16,40);
        level = 7;
        bgm = new GreenfootSound("Level3.mp3");
        addObject(player,20,8);
        addObject(invisPlayer,20,8);
        addObject(arrow,20,9);
        addObject(enemyIcon,0,0) ; 
    }

}
