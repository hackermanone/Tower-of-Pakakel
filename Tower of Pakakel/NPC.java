import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List ; 
/**
 * NPC superclass, all NPC can specify shareAct() in their own act method if they are a quest giving npc. Otherwise, they can just not and do their own thing. 
 * NPC's give quests and rewards, and talk differently depending on the course of the game
 * 
 * @author Michael Ma 
 * @version 1
 */
public class NPC extends Friendlies
{
    //DisplayText object to show speach bubbles
    protected DisplayText displayText ; 
    //Refference to world and other objects
    protected Controller world ; 
    protected Player player ; 
    //String array used for multiple speech and regular speech, 
    protected String[] texts = new String[10] ; 
    //Integers used for speakMultiple
    protected int currentText = -1 ;
    protected int sentences ; 
    //Array of times before a speech bubble dissapears that can be modified for longer sentences 
    protected int textTimes[] = new int[10] ; 
    //Integers used to generally change text and close bubbles after specified periods of time, timeTo = 70 is approximately 1 second  
    protected int timer = 0 ; 
    protected int timeTo = 0 ; 
    //Used to initiate displayText at NPC creation, above decides whether textbubbles appear above the NPC or below 
    protected boolean initiate = true ; 
    protected boolean above = true ; 
    //Booleans used for speakMultiple
    protected boolean startSpeak = false ; 
    protected boolean multipleSpeak = false ; 
    //Boolean to indicate whether player completed NPC's quest/ recieved their reward
    protected boolean questComplete = false ; 
    protected boolean rewardsGiven = false ; 

    /**
     * Contstructor for an NPC - timeTo and text should be initiated within NPC inheriting classes
     */
    public NPC ()
    {
        //Set defualt times for text closing
        for (int i = 0; i < 10; i++)
        {
            textTimes[i] = 110 ; 
        }
        initiate = true ; 
    }

    /**
     * Act - do whatever the NPC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        shareAct() ; 
    }    

    /**
     * Secondary act method that all regular NPC classes can use
     */
    protected void shareAct()
    {
        world = (Controller) getWorld() ; 
        // Sets variables and adds objects once at beginning of run 
        if (initiate)
        {
            setSpeech() ; 
            timeTo = textTimes[0] ; 
            world = (Controller) getWorld() ; 
            displayText = new DisplayText() ;
            //Boolean above decides whether text appears below or above actor 
            if (above)
                world.addObject(displayText, this.getX(), this.getY() - 1) ; 
            else 
                world.addObject(displayText, this.getX(), this.getY() + 1) ; 
            initiate = false ; 
        }

        // Timer to allow the speed of text change to be altered according to specefic text 
        if (timer >= timeTo)
        {
            // If only one line of text, text should close after timer ends
            if (!multipleSpeak)
                closeSpeach() ; 
            // Else multiple lines then text will move on to next line 
            else if (startSpeak) 
            {
                currentText += 1 ; 
                timeTo = textTimes[currentText]  ; 
                //Resets text variables after all sentences are said 
                if (currentText != sentences)
                    speakMultiple() ; 
                else 
                {
                    currentText = -1 ;
                    startSpeak = false ; 
                    closeSpeach() ; 
                }
            }
        }
        else 
            timer++ ; 
    }

    /**
     * Checks for quest completion when talked to, else state single intro line assigned 
     */
    public void speak()
    {
        //If rewards are not already given then give quest 
        if (!rewardsGiven)
            quest() ; 
        //Check quest status 
        if (questComplete && !rewardsGiven)
            giveRewards() ; 
        //State single line if only 1 line, else set startSpeak boolean to begin multiple lines 
        if (!multipleSpeak)
        {
            timer = 0 ; 
            if (questComplete)
                giveRewards() ; 
            displayText.changeText(texts[0]) ; 
        }
        else if (multipleSpeak)
            startSpeak = true ; 
    }

    /**
     * Multiple lines of speech for multiple text bubbles in one interaction 
     */
    protected void speakMultiple()
    {
        timer = 0 ; 
        if (currentText == 0)
            displayText.changeText(texts[0]) ; 
        else if (currentText == 1)
            displayText.changeText(texts[1]) ; 
        else if (currentText == 2)
            displayText.changeText(texts[2]) ; 
        else if (currentText == 3)
            displayText.changeText(texts[3]) ; 
        else if (currentText == 4)
            displayText.changeText(texts[4]) ; 
        else if (currentText == 5)
            displayText.changeText(texts[5]) ; 
        else if (currentText == 6)
            displayText.changeText(texts[6]) ; 
        else if (currentText == 7)
            displayText.changeText(texts[7]) ; 
        else if (currentText == 8)
            displayText.changeText(texts[8]) ;
        else if (currentText == 9)
            displayText.changeText(texts[9]) ;
        else if (currentText == 10)
            displayText.changeText(texts[10]) ;
    }

    /**
     * Sets the speech for this NPC 
     */
    protected void setSpeech() 
    {
    }

    /**
     * Sets speech text object used by NPC to invisible 
     */
    protected void closeSpeach()
    {
        displayText.setImage("Invisible.png") ; 
    }

    /**
     * Defines the quest this NPC givse and checks for completion 
     */
    protected void quest()
    {
    }

    /**
     * Gives rewards after quest boolean shows completion, then sets variables so quest cannot be redone
     */
    protected void giveRewards()
    {
    }

    /**
     * Returns boolean initiate for saving 
     */
    public boolean getInitiate()
    {
        return initiate;
    }

    /**
     * Sets initiate for loading
     */
    public void setInitiate(boolean option)
    {
        initiate = option;
    }

    /**
     * Get questComplete boolean for saving
     */
    public boolean questComplete()
    {
        return questComplete;
    }

    /**
     * Get rewardsGiven booloean for saving 
     */
    public boolean rewardsGiven()
    {
        return rewardsGiven;
    }

    /**
     * Set quest completion status for loading
     */
    public void setQuestStatus(boolean status)
    {    
        this.questComplete = status;
    }

    /**
     * Set reward giving status for loading 
     */
    public void setRewardsGivenStatus(boolean status)
    {
        this.rewardsGiven = status;
    }
}
