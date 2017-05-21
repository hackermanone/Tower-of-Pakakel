import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 6 of game 
 * 
 * @author Justin Lam
 * @version January 2015
 */
public class Level6 extends Controller
{
    public Level6 ()
    {
        super(24,16,40);
        bgm = new GreenfootSound("End.wav");
        prepare();
    }

    /**
     * Constructor for objects of class Level6.
     * 
     */
    public Level6(Player player,InvisiblePlayer invisPlayer,Arrow arrow, EnemiesIcon enemyIcon)
    {    
        super(24,16,40);
        level = 6;
        bgm = new GreenfootSound("End.wav");
        prepare();
        addObject(player,20,8);
        addObject(invisPlayer,20,8);
        addObject(arrow,20,9);
        addObject(enemyIcon,0,0) ; 
        DisplayText text = new DisplayText(player);
        addObject(text,2,0);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        bgm.playLoop();
        UnbreakableStoneWall unbreakablestonewall = new UnbreakableStoneWall();
        addObject(unbreakablestonewall, 1, 5);
        unbreakablestonewall.setLocation(0, 5);
        unbreakablestonewall.setLocation(0, 4);
        UnbreakableStoneWall unbreakablestonewall2 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall2, 1, 4);
        UnbreakableStoneWall unbreakablestonewall3 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall3, 2, 4);
        UnbreakableStoneWall unbreakablestonewall4 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall4, 3, 4);
        UnbreakableStoneWall unbreakablestonewall5 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall5, 4, 4);
        UnbreakableStoneWall unbreakablestonewall6 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall6, 5, 4);
        UnbreakableStoneWall unbreakablestonewall7 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall7, 6, 4);
        UnbreakableStoneWall unbreakablestonewall8 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall8, 7, 4);
        UnbreakableStoneWall unbreakablestonewall9 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall9, 8, 4);
        UnbreakableStoneWall unbreakablestonewall10 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall10, 9, 4);
        UnbreakableStoneWall unbreakablestonewall11 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall11, 10, 4);
        UnbreakableStoneWall unbreakablestonewall12 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall12, 11, 4);
        UnbreakableStoneWall unbreakablestonewall13 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall13, 12, 4);
        UnbreakableStoneWall unbreakablestonewall14 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall14, 13, 4);
        UnbreakableStoneWall unbreakablestonewall15 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall15, 14, 4);
        UnbreakableStoneWall unbreakablestonewall16 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall16, 15, 4);
        UnbreakableStoneWall unbreakablestonewall17 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall17, 16, 4);
        UnbreakableStoneWall unbreakablestonewall18 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall18, 17, 4);
        UnbreakableStoneWall unbreakablestonewall19 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall19, 18, 4);
        UnbreakableStoneWall unbreakablestonewall20 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall20, 19, 4);
        UnbreakableStoneWall unbreakablestonewall21 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall21, 20, 4);
        UnbreakableStoneWall unbreakablestonewall22 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall22, 20, 4);
        UnbreakableStoneWall unbreakablestonewall23 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall23, 21, 4);
        UnbreakableStoneWall unbreakablestonewall24 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall24, 22, 4);
        UnbreakableStoneWall unbreakablestonewall25 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall25, 23, 4);
        UnbreakableStoneWall unbreakablestonewall26 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall26, 0, 11);
        UnbreakableStoneWall unbreakablestonewall27 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall27, 1, 11);
        UnbreakableStoneWall unbreakablestonewall28 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall28, 2, 11);
        UnbreakableStoneWall unbreakablestonewall29 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall29, 3, 11);
        UnbreakableStoneWall unbreakablestonewall30 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall30, 3, 11);
        UnbreakableStoneWall unbreakablestonewall31 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall31, 4, 11);
        UnbreakableStoneWall unbreakablestonewall32 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall32, 5, 11);
        UnbreakableStoneWall unbreakablestonewall33 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall33, 6, 11);
        UnbreakableStoneWall unbreakablestonewall34 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall34, 7, 11);
        UnbreakableStoneWall unbreakablestonewall35 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall35, 8, 11);
        UnbreakableStoneWall unbreakablestonewall36 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall36, 9, 11);
        UnbreakableStoneWall unbreakablestonewall37 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall37, 10, 11);
        UnbreakableStoneWall unbreakablestonewall38 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall38, 11, 11);
        UnbreakableStoneWall unbreakablestonewall39 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall39, 12, 11);
        UnbreakableStoneWall unbreakablestonewall40 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall40, 13, 11);
        UnbreakableStoneWall unbreakablestonewall41 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall41, 14, 11);
        UnbreakableStoneWall unbreakablestonewall42 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall42, 15, 11);
        UnbreakableStoneWall unbreakablestonewall43 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall43, 16, 11);
        UnbreakableStoneWall unbreakablestonewall44 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall44, 17, 11);
        UnbreakableStoneWall unbreakablestonewall45 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall45, 18, 11);
        UnbreakableStoneWall unbreakablestonewall46 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall46, 19, 11);
        UnbreakableStoneWall unbreakablestonewall47 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall47, 20, 11);
        UnbreakableStoneWall unbreakablestonewall48 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall48, 22, 11);
        UnbreakableStoneWall unbreakablestonewall49 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall49, 21, 11);
        UnbreakableStoneWall unbreakablestonewall50 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall50, 23, 11);
        UnbreakableStoneWall unbreakablestonewall51 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall51, 22, 5);
        UnbreakableStoneWall unbreakablestonewall52 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall52, 22, 6);
        UnbreakableStoneWall unbreakablestonewall53 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall53, 22, 7);
        UnbreakableStoneWall unbreakablestonewall54 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall54, 22, 8);
        UnbreakableStoneWall unbreakablestonewall55 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall55, 22, 9);
        UnbreakableStoneWall unbreakablestonewall56 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall56, 22, 10);
        Hole hole = new Hole();
        addObject(hole, 0, 8);

        Pakekel pak1 = new Pakekel();
        Pakekel pak2 = new Pakekel();
        Pakekel pak3 = new Pakekel();
        Pakekel pak4 = new Pakekel();
        Pakekel pak5 = new Pakekel();

        Pakekel pakekel = new Pakekel();
        addObject(pakekel, 16, 9);
        Pakekel pakekel2 = new Pakekel();
        addObject(pakekel2, 13, 6);
        Pakekel pakekel3 = new Pakekel();
        addObject(pakekel3, 11, 9);
        Pakekel pakekel4 = new Pakekel();
        addObject(pakekel4, 9, 6);
        Pakekel pakekel5 = new Pakekel();
        addObject(pakekel5, 7, 9);
        Pakekel pakekel6 = new Pakekel();
        addObject(pakekel6, 5, 6);
        Pakekel pakekel7 = new Pakekel();
        addObject(pakekel7, 3, 9);
        Pakekel pakekel8 = new Pakekel();
        addObject(pakekel8, 2, 14);
        Pakekel pakekel9 = new Pakekel();
        addObject(pakekel9, 6, 14);
        Pakekel pakekel10 = new Pakekel();
        addObject(pakekel10, 10, 14);
        Golem golem = new Golem(1);
        addObject(golem, 13, 13);
        Golem golem2 = new Golem(1);
        addObject(golem2, 13, 15);
        Treeant treeant = new Treeant(1);
        addObject(treeant, 16, 13);
        Plant plant = new Plant();
        addObject(plant, 16, 15);
        RedSlime redslime = new RedSlime(1);
        addObject(redslime, 19, 13);
        Slime slime = new Slime(1);
        addObject(slime, 22, 14);
        Pakekel pakekel11 = new Pakekel();
        addObject(pakekel11, 21, 2);
        Treeant treeant2 = new Treeant(1);
        addObject(treeant2, 14, 1);
        Golem golem3 = new Golem(1);
        addObject(golem3, 3, 2);
        Treeant treeant3 = new Treeant(1);
        addObject(treeant3, 9, 3);
        CorruptSamurai corruptsamurai = new CorruptSamurai(1);
        addObject(corruptsamurai, 11, 2);
        CorruptSamurai corruptsamurai2 = new CorruptSamurai(1);
        addObject(corruptsamurai2, 6, 1);
        RedSlime redslime2 = new RedSlime(1);
        addObject(redslime2, 16, 3);
        DisplayText info = new DisplayText("GG");
        addObject(info,18,15);
    }
}
