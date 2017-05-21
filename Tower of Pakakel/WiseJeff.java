import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Wise Jeff. Really, the beaker he's holding is little more than green dye. Besides, his glasses aren't even real.
 * 
 * @author Michael Ma 
 * @version 1
 */
public class WiseJeff extends NPC
{
    public WiseJeff()
    {
        super() ; 
        id = 704;
    }

    /**
     * Act - do whatever the WiseJeff wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        shareAct() ; 
    }   

    protected void setSpeech()
    {
        if (world.getLevel() == 3)
        {
            multipleSpeak = true ; 
            texts[0] = "Where do you think you're going, skinny arms?" ; 
            texts[1] = "See that thing behind me? That's a golem." ; 
            texts[2] = "It has x attack and x defense. You can't even chip it!" ; 
            textTimes[2] = 200 ; 
            texts[3] = "Come back when you have AT LEAST 5 attack and 3 defense." ; 
            textTimes[3] = 200 ; 
            sentences = 4 ; 
        }
        else if (world.getLevel() == 5)
        {
            multipleSpeak = true ; 
            texts[0] = "Hey champion!" ; 
            textTimes[0] = 60 ; 
            texts[1] = "This guy behind me is Pakekel!" ; 
            texts[2] = "He has insane amounts of hp, high defence, and okay attack." ; 
            textTimes[2] = 160 ; 
            texts[3] = "I reccomend you challenge him after you've trained all you can!" ; 
            textTimes[3] = 160 ; 
            texts[4] = "The dojo on the left and right will improve your skills!" ; 
            textTimes[4] = 200 ; 
            texts[5] = "Come back after training!" ; 
            textTimes[5] = 100 ; 
            texts[6] = "Oh one more thing!" ; 
            textTimes[6] = 60 ; 
            texts[7] = "Be sure to have hotpot with Alice and Ricky!" ; 
            textTimes[7] = 110 ; 
            texts[8] = "It will fully replenish your HP!" ; 
            textTimes[8] = 80 ; 
            sentences = 9 ; 
       }
    }

    protected void quest()
    {
        //Quest changes depending on world 
        if (world.getLevel() == 3)
        {
            player = world.getPlayer() ; 
            if (player.getAtk() >= 5 && player.getDef() >= 3)
                questComplete = true ; 
        }
        else if (world.getLevel() == 5)
        {
            player = world.getPlayer() ; 
            if (player.getSilverKeys() == 0)
                questComplete = true ; 
        }
    }

    protected void giveRewards()
    {
        if (world.getLevel() == 3)
        {
            multipleSpeak = false ; 
            texts[0] = "I see..... Good luck" ; 
            textTimes[0] = 80 ; 
        }
        else if (world.getLevel() == 5)
        {
            multipleSpeak = false; 
            texts[0] = "Go on. We believe in you!" ; 
            textTimes[0] = 90 ; 
        }
        // Sets location of this actor and the text above it
        this.setLocation(this.getX() - 1, this.getY()) ; 
        above = false ; 
        displayText.setLocation(this.getX(), this.getY() - 1) ; 
        //Remove anything this actor touches 
        if (this.isTouching(TangibleTiles.class)) 
            world.removeObject(getOneIntersectingObject(TangibleTiles.class)) ; 
        rewardsGiven = true ; 
        questComplete = false ; 
    }

}
