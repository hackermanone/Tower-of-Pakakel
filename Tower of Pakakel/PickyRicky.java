import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List; 
/**
 * Picky Ricky. A self proclaimed thief, he assists the player in defeating the great boss Pakekel. 
 * Or so he'd like to say. Actually, Ricky can barely pick the lock to his own room. 
 * 
 * @author Michael Ma 
 * @version 1
 */
public class PickyRicky extends NPC
{
    private String startText = "" ; 
    private int lengthUp2 = 100 ; 
    private List samurais ; 
    private TroubledAlice troubledAlice ; 
    public PickyRicky()
    {
        super() ;        
        id = 703;
    }

    /**
     * Act - do whatever the PickyRicky wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        shareAct() ; 
        if (world.getLevel() == 3)
        {
            troubledAlice = (TroubledAlice) getOneObjectAtOffset(-5, 0, TroubledAlice.class) ; 
            if (troubledAlice.getRewardsGiven())
            {
                questComplete = true ; 
            }
        }
    }    

    protected void setSpeech()
    {
        world = (Controller) getWorld() ; 
        if (world.getLevel() == 3)
        {
            multipleSpeak = true ; 
            sentences = 3 ; 
            texts[0] = "Hey... I can help you." ; 
            textTimes[0] = 80 ; 
            texts[1] = "But you gotta help me first...." ; 
            textTimes[1] = 80 ; 
            texts[2] = "Kill all the Corrupt Samurai, then we'll talk" ; 
            textTimes[2] = 150 ; 
        }
        else if (world.getLevel() == 5)
        {
            multipleSpeak = true ; 
            texts[0] = "Yo dude... I'll see you later..." ; 
            textTimes[0] = 110 ; 
            texts[1] = "If you can take care of Pakekel.. that is" ; 
            textTimes[1] = 120 ; 
            texts[2] = "Have some hotpot with us before you go eh?" ; 
            textTimes[2] = 120 ; 
            sentences = 3  ; 
        }
    }

    protected void quest()
    {
        if (world.getLevel() == 3)
        {
            //Check CorruptSamuras in world to see if all killed off 
            List samurais = world.getObjects(CorruptSamurai.class) ; 
            if (samurais.isEmpty())
                questComplete = true ; 
        }
    }

    protected void giveRewards()
    {
        if (world.getLevel() == 3)
        {
            if (!troubledAlice.getRewardsGiven())
            {
                multipleSpeak = false ; 
                texts[0] = "Thanks bro... go check out that wall two blocks east of me" ; 
                textTimes[0] = 150 ; 
                ButtonTiles buttonTile = new ButtonTiles(0,0) ; 
                world.addObject(buttonTile, 13, 1) ; 
            }
            else
            {
                texts[0] = "Is that my shirt dude?" ; 
                textTimes[0] = 70 ; 
                multipleSpeak = false ; 
            }
        }
        rewardsGiven = true ; 
        questComplete = false ; 
    }
}
