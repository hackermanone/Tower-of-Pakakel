import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List ; 
/**
 * Dojo Master. A barely literate, estatic, kind and strong man. Also, he despises red slimes. 
 * 
 * @author Michael Ma 
 * @version 1
 */
public class DojoMaster extends NPC
{
    public DojoMaster()
    {
        super() ; 
        above = false  ; 
        id = 702;
    }

    /**
     * Act - do whatever the DojoMaster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        shareAct() ; 
    }    

    protected void setSpeech()
    {
        for (int i = 0 ; i < 10; i++)
            textTimes[i] = 60 ; 
        if (world.getLevel() == 2)
        {
            multipleSpeak = true ; 
            texts[0] = "HOI! HOO! HAH!" ;
            texts[1] = "WHO AM I?" ; 
            texts[2] = "DOJO MASTER!" ; 
            texts[3] = "I TRAIN YOU!" ; 
            texts[4] = "BEAT UP RED SLIMES!" ; 
            texts[5] = "THEN YOU READY!" ; 
            texts[6] = "FOR DOJO MASTER!" ; 
            sentences = 7 ; 
        }
        else if (world.getLevel() == 4)
        {
            multipleSpeak = true ; 
            texts[0] = "YOU AGAIN!" ; 
            texts[1] = "YOU STRONG!" ; 
            texts[2] = "BUT WEAK!" ; 
            texts[3] = "KILL TREEANT!" ; 
            texts[4] = "THEN I TRAIN U!" ; 
            sentences = 5 ; 
        }
        else if (world.getLevel() == 5)
        {
            multipleSpeak = true ; 
            texts[0] = "IT HERO!" ; 
            texts[1] = "I TRAIN YOU LAST TIME!" ; 
            texts[2] = "SO YOU BEAT UP!" ; 
            texts[3] = "PAKEKEL GOOD!" ;
            sentences = 4 ; 
            questComplete = true ;
        }
    }

    protected void quest()
    {
        if (world.getLevel() == 2)
        {
            //Get world list of red slimes 
            List redSlimes = world.getObjects(RedSlime.class) ; 
            //Check if all red slimes are killed 
            if (redSlimes.isEmpty())
                questComplete = true ; 
        }
        if (world.getLevel() == 4) 
        {
            List treeants = world.getObjectsAt(4, 3, Treeant.class);
            if (treeants.isEmpty())
                questComplete = true ; 
        }
    }

    protected void giveRewards()
    {
        if (world.getLevel() == 2 )
        {
            multipleSpeak = false ; 
            texts[0] = "GOOD! NOW YOU STRONG!" ; 
            player = world.getPlayer() ; 
            player.addAtk(2) ; 
        }
        else if (world.getLevel() == 4)
        {
            multipleSpeak = false ; 
            texts[0] = "REPEAT: HOI!HOO!HAH!" ; 
            player = world.getPlayer() ; 
            player.addAtk(2) ; 
        }
        else if (world.getLevel() == 5)
        {
            multipleSpeak = false ; 
            texts[0] = "GO STRONG MAN!" ; 
            player = world.getPlayer() ; 
            player.addAtk(2) ; 
            player.addAtk(2) ; 
        }
        rewardsGiven = true ; 
        questComplete = false ; 
    }
}
