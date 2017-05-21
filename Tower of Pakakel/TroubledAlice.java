import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List ; 
/**
 * Troubled Alice. What troubles Alice the most is not the fact that Ghost Slimes over ran her club house, it's
 * the fact that Picky Ricky likes to explore the dungeon often. That'd be fine, despite the fact that he won't
 * wear his old cloth armour because "If I never get hit, I never need armour!". Really, she'd be fine with that 
 * too. Except for the fact that she has to patch him up everytime his butt gets kicked by the Ghost Slimes. 
 * 
 * @author Michael Ma 
 * @version 1 
 */
public class TroubledAlice extends NPC
{
    private int timer1 ;
    public TroubledAlice()
    {
        super() ; 
        id = 705;
    }

    /**
     * Act - do whatever the TroubledAlice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        shareAct() ; 
        if (world.getLevel() == 3)
        {
            if (rewardsGiven)
                timer1++ ; 
            if (timer1 == 630) 
            {
                ClothArmour clothArmour = new ClothArmour() ; 
                world.addObject(clothArmour, this.getX() + 1, this.getY()) ; 
            }
        }
    }

    protected void setSpeech()
    {
        world = (Controller) getWorld() ; 
        if (world.getLevel() == 3)
        {
            multipleSpeak = true ; 
            texts[0] = "Eeeeek!" ; 
            textTimes[0] = 50 ; 
            texts[1] = "Our club house is being haunted by Ghost Slimes!!" ; 
            textTimes[1] = 130 ; 
            texts[2] = "If you could do me the favour, I might help you out!" ; 
            textTimes[2] = 150 ; 
            texts[3] = "Oh by the way... there's a secret passage into our house..." ; 
            textTimes[3] = 150 ; 
            sentences = 4 ; 
        }
        else if (world.getLevel() == 5)
        {
            texts[0] = "Hi again! Oh... you don't want hotpot with us?" ; 
            multipleSpeak = false ; 
        } 
    }

    protected void quest()
    {
        if (world.getLevel() == 3)
        {
            List slimes = world.getObjects(Slime.class) ; 
            if (slimes.isEmpty())
                questComplete = true ; 
        }
    }

    protected void giveRewards()
    {
        if (world.getLevel() == 3)
        {
            for (int i = 0; i < 6; i++)
                textTimes[i] = 110 ;
            texts[0] = "Wonderful! I'll tell you a secret!" ; 
            texts[1] = "Ricky and I have a secret passage!" ; 
            texts[2] = "That's becase we occasionally have hotpot together!" ; 
            texts[3] = "Anyways, he started calling himself Picky Ricky." ; 
            texts[4] = "Since then, he stopped wearing armour" ; 
            texts[5] = "So you can have his old armour!" ; 
            sentences = 6 ; 
            world.removeObject(getOneObjectAtOffset(1, 0, TangibleTiles.class)) ; 
            ButtonTiles buttonTile2 = new ButtonTiles(2,0) ; 
            world.addObject(buttonTile2, 6, 2) ; 
        }
        rewardsGiven = true ; 
        questComplete = false ; 
    }

    public boolean getRewardsGiven()
    {
        return rewardsGiven ; 
    }
}
