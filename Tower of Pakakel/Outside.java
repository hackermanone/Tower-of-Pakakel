import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Outside design for after boss fight 
 * 
 * @author Justin Lam
 * @version January 2015
 */
public class Outside extends Controller
{

    /**
     * Constructor for objects of class Outside.
     * 
     */
    public Outside()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(24,16,40); 

        prepare();
    }

    /**
     * Constructor for objects of class Level6.
     * 
     */
    public Outside(Player player,InvisiblePlayer invisPlayer,Arrow arrow, EnemiesIcon enemyIcon)
    {    
        super(24,16,40);
        level = 7;
        bgm = new GreenfootSound("End.wav");
        prepare();
        addObject(player,20,8);
        addObject(invisPlayer,20,8);
        addObject(arrow,20,9);
        addObject(enemyIcon,0,0) ; 
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        UnbreakableStoneWall unbreakablestonewall = new UnbreakableStoneWall();
        addObject(unbreakablestonewall, 19, 6);
        UnbreakableStoneWall unbreakablestonewall2 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall2, 20, 6);
        UnbreakableStoneWall unbreakablestonewall3 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall3, 21, 5);
        UnbreakableStoneWall unbreakablestonewall4 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall4, 22, 4);
        UnbreakableStoneWall unbreakablestonewall5 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall5, 19, 10);
        UnbreakableStoneWall unbreakablestonewall6 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall6, 20, 10);
        UnbreakableStoneWall unbreakablestonewall7 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall7, 21, 11);
        UnbreakableStoneWall unbreakablestonewall8 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall8, 22, 12);
        UnbreakableStoneWall unbreakablestonewall9 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall9, 18, 6);
        UnbreakableStoneWall unbreakablestonewall10 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall10, 17, 6);
        UnbreakableStoneWall unbreakablestonewall11 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall11, 16, 6);
        UnbreakableStoneWall unbreakablestonewall12 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall12, 15, 6);
        UnbreakableStoneWall unbreakablestonewall13 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall13, 14, 6);
        UnbreakableStoneWall unbreakablestonewall14 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall14, 13, 6);
        UnbreakableStoneWall unbreakablestonewall15 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall15, 12, 6);
        UnbreakableStoneWall unbreakablestonewall16 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall16, 11, 6);
        UnbreakableStoneWall unbreakablestonewall17 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall17, 10, 6);
        UnbreakableStoneWall unbreakablestonewall18 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall18, 8, 6);
        UnbreakableStoneWall unbreakablestonewall19 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall19, 9, 6);
        UnbreakableStoneWall unbreakablestonewall20 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall20, 7, 6);
        UnbreakableStoneWall unbreakablestonewall21 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall21, 6, 6);
        UnbreakableStoneWall unbreakablestonewall22 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall22, 4, 6);
        UnbreakableStoneWall unbreakablestonewall23 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall23, 5, 6);
        UnbreakableStoneWall unbreakablestonewall24 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall24, 3, 6);
        UnbreakableStoneWall unbreakablestonewall25 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall25, 0, 4);
        UnbreakableStoneWall unbreakablestonewall26 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall26, 1, 5);
        UnbreakableStoneWall unbreakablestonewall27 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall27, 2, 6);
        UnbreakableStoneWall unbreakablestonewall28 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall28, 18, 10);
        UnbreakableStoneWall unbreakablestonewall29 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall29, 2, 10);
        UnbreakableStoneWall unbreakablestonewall30 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall30, 1, 11);
        UnbreakableStoneWall unbreakablestonewall31 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall31, 0, 12);
        UnbreakableStoneWall unbreakablestonewall32 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall32, 3, 10);
        UnbreakableStoneWall unbreakablestonewall33 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall33, 4, 10);
        UnbreakableStoneWall unbreakablestonewall34 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall34, 5, 10);
        UnbreakableStoneWall unbreakablestonewall35 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall35, 6, 10);
        UnbreakableStoneWall unbreakablestonewall36 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall36, 7, 10);
        UnbreakableStoneWall unbreakablestonewall37 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall37, 8, 10);
        UnbreakableStoneWall unbreakablestonewall38 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall38, 9, 10);
        UnbreakableStoneWall unbreakablestonewall39 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall39, 10, 10);
        UnbreakableStoneWall unbreakablestonewall40 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall40, 11, 10);
        UnbreakableStoneWall unbreakablestonewall41 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall41, 12, 10);
        UnbreakableStoneWall unbreakablestonewall42 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall42, 13, 10);
        UnbreakableStoneWall unbreakablestonewall43 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall43, 14, 10);
        UnbreakableStoneWall unbreakablestonewall44 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall44, 14, 10);
        UnbreakableStoneWall unbreakablestonewall45 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall45, 15, 10);
        UnbreakableStoneWall unbreakablestonewall46 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall46, 16, 10);
        UnbreakableStoneWall unbreakablestonewall48 = new UnbreakableStoneWall();
        addObject(unbreakablestonewall48, 17, 10);

        StoneFloor stonefloor = new StoneFloor();
        addObject(stonefloor, 0, 5);
        StoneFloor stonefloor2 = new StoneFloor();
        addObject(stonefloor2, 1, 6);
        StoneFloor stonefloor3 = new StoneFloor();
        addObject(stonefloor3, 1, 7);
        StoneFloor stonefloor4 = new StoneFloor();
        addObject(stonefloor4, 0, 7);
        StoneFloor stonefloor5 = new StoneFloor();
        addObject(stonefloor5, 0, 10);
        StoneFloor stonefloor6 = new StoneFloor();
        addObject(stonefloor6, 1, 10);
        StoneFloor stonefloor7 = new StoneFloor();
        addObject(stonefloor7, 0, 11);
        StoneFloor stonefloor8 = new StoneFloor();
        addObject(stonefloor8, 2, 9);
        StoneFloor stonefloor9 = new StoneFloor();
        addObject(stonefloor9, 3, 8);
        StoneFloor stonefloor10 = new StoneFloor();
        addObject(stonefloor10, 4, 7);
        StoneFloor stonefloor11 = new StoneFloor();
        addObject(stonefloor11, 4, 8);
        StoneFloor stonefloor12 = new StoneFloor();
        addObject(stonefloor12, 4, 9);
        StoneFloor stonefloor13 = new StoneFloor();
        addObject(stonefloor13, 5, 9);
        StoneFloor stonefloor14 = new StoneFloor();
        addObject(stonefloor14, 5, 8);
        StoneFloor stonefloor15 = new StoneFloor();
        addObject(stonefloor15, 6, 7);
        StoneFloor stonefloor16 = new StoneFloor();
        addObject(stonefloor16, 7, 7);
        StoneFloor stonefloor17 = new StoneFloor();
        addObject(stonefloor17, 8, 7);
        StoneFloor stonefloor18 = new StoneFloor();
        addObject(stonefloor18, 7, 8);
        StoneFloor stonefloor19 = new StoneFloor();
        addObject(stonefloor19, 7, 9);
        StoneFloor stonefloor20 = new StoneFloor();
        addObject(stonefloor20, 8, 8);
        StoneFloor stonefloor21 = new StoneFloor();
        addObject(stonefloor21, 9, 8);
        StoneFloor stonefloor22 = new StoneFloor();
        addObject(stonefloor22, 10, 7);
        StoneFloor stonefloor23 = new StoneFloor();
        addObject(stonefloor23, 10, 8);
        StoneFloor stonefloor24 = new StoneFloor();
        addObject(stonefloor24, 11, 7);
        StoneFloor stonefloor25 = new StoneFloor();
        addObject(stonefloor25, 11, 8);
        StoneFloor stonefloor26 = new StoneFloor();
        addObject(stonefloor26, 11, 9);
        StoneFloor stonefloor27 = new StoneFloor();
        addObject(stonefloor27, 12, 7);
        StoneFloor stonefloor28 = new StoneFloor();
        addObject(stonefloor28, 12, 8);
        StoneFloor stonefloor29 = new StoneFloor();
        addObject(stonefloor29, 12, 9);
        StoneFloor stonefloor30 = new StoneFloor();
        addObject(stonefloor30, 13, 9);
        StoneFloor stonefloor31 = new StoneFloor();
        addObject(stonefloor31, 13, 8);
        StoneFloor stonefloor32 = new StoneFloor();
        addObject(stonefloor32, 13, 7);
        StoneFloor stonefloor33 = new StoneFloor();
        addObject(stonefloor33, 14, 7);
        StoneFloor stonefloor34 = new StoneFloor();
        addObject(stonefloor34, 14, 8);
        StoneFloor stonefloor35 = new StoneFloor();
        addObject(stonefloor35, 14, 9);
        StoneFloor stonefloor36 = new StoneFloor();
        addObject(stonefloor36, 15, 9);
        StoneFloor stonefloor37 = new StoneFloor();
        addObject(stonefloor37, 15, 8);
        StoneFloor stonefloor38 = new StoneFloor();
        addObject(stonefloor38, 15, 7);
        StoneFloor stonefloor39 = new StoneFloor();
        addObject(stonefloor39, 16, 7);
        StoneFloor stonefloor40 = new StoneFloor();
        addObject(stonefloor40, 16, 8);
        StoneFloor stonefloor41 = new StoneFloor();
        addObject(stonefloor41, 16, 9);
        StoneFloor stonefloor42 = new StoneFloor();
        addObject(stonefloor42, 17, 9);
        StoneFloor stonefloor43 = new StoneFloor();
        addObject(stonefloor43, 17, 8);
        StoneFloor stonefloor44 = new StoneFloor();
        addObject(stonefloor44, 17, 7);
        StoneFloor stonefloor45 = new StoneFloor();
        addObject(stonefloor45, 18, 7);
        StoneFloor stonefloor46 = new StoneFloor();
        addObject(stonefloor46, 18, 7);
        StoneFloor stonefloor47 = new StoneFloor();
        addObject(stonefloor47, 18, 8);
        StoneFloor stonefloor48 = new StoneFloor();
        addObject(stonefloor48, 18, 9);
        StoneFloor stonefloor49 = new StoneFloor();
        addObject(stonefloor49, 19, 7);
        StoneFloor stonefloor50 = new StoneFloor();
        addObject(stonefloor50, 19, 8);
        StoneFloor stonefloor51 = new StoneFloor();
        addObject(stonefloor51, 19, 9);
        StoneFloor stonefloor52 = new StoneFloor();
        addObject(stonefloor52, 20, 7);
        StoneFloor stonefloor53 = new StoneFloor();
        addObject(stonefloor53, 20, 8);
        StoneFloor stonefloor54 = new StoneFloor();
        addObject(stonefloor54, 20, 9);
        StoneFloor stonefloor55 = new StoneFloor();
        addObject(stonefloor55, 21, 6);
        StoneFloor stonefloor56 = new StoneFloor();
        addObject(stonefloor56, 21, 7);
        StoneFloor stonefloor57 = new StoneFloor();
        addObject(stonefloor57, 21, 8);
        StoneFloor stonefloor58 = new StoneFloor();
        addObject(stonefloor58, 21, 9);
        StoneFloor stonefloor59 = new StoneFloor();
        addObject(stonefloor59, 21, 10);
        StoneWall stonewall = new StoneWall();
        addObject(stonewall, 22, 5);
        StoneWall stonewall2 = new StoneWall();
        addObject(stonewall2, 22, 6);
        StoneWall stonewall3 = new StoneWall();
        addObject(stonewall3, 22, 7);
        StoneWall stonewall4 = new StoneWall();
        addObject(stonewall4, 22, 8);
        StoneWall stonewall5 = new StoneWall();
        addObject(stonewall5, 22, 9);
        StoneWall stonewall6 = new StoneWall();
        addObject(stonewall6, 22, 10);
        StoneWall stonewall7 = new StoneWall();
        addObject(stonewall7, 22, 11);
      
        EndScreenTile endscreentile = new EndScreenTile();
        addObject(endscreentile, 0, 8);
    }
}
