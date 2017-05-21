import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 5 of the game, the boss level
 * 
 * @author Michael Ma, Ricky Chen
 * @version 1
 */
public class Level5 extends Controller
{
    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level5()
    {    
        super(24, 16, 40); 
    }

    public Level5 (Player player,InvisiblePlayer invisPlayer,Arrow arrow, EnemiesIcon enemyIcon)
    {
        super(24,16,40);
        level = 5;
        bgm = new GreenfootSound("Level5.mp3");
        prepare();
        addObject(player,2,12);
        addObject(invisPlayer,2,12);
        addObject(arrow,2,13);
        addObject(enemyIcon,0,0) ; 
        DisplayText text = new DisplayText(player);
        addObject(text,2,0);
        
        StoneStairs stairs = new StoneStairs();
        addObject(stairs,13,1);
    }

        private void prepare()
    {
        bgm.playLoop();
        BloodyWoodenFloor bloodywoodenfloor = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor, 0, 15);
        BloodyWoodenFloor bloodywoodenfloor2 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor2, 1, 15);
        BloodyWoodenFloor bloodywoodenfloor3 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor3, 2, 15);
        BloodyWoodenFloor bloodywoodenfloor4 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor4, 3, 15);
        BloodyWoodenFloor bloodywoodenfloor5 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor5, 4, 15);
        BloodyWoodenFloor bloodywoodenfloor6 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor6, 5, 15);
        BloodyWoodenFloor bloodywoodenfloor7 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor7, 6, 15);
        BloodyWoodenFloor bloodywoodenfloor8 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor8, 7, 15);
        BloodyWoodenFloor bloodywoodenfloor9 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor9, 8, 15);
        BloodyWoodenFloor bloodywoodenfloor10 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor10, 9, 15);
        BloodyWoodenFloor bloodywoodenfloor11 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor11, 10, 15);
        BloodyWoodenFloor bloodywoodenfloor12 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor12, 11, 15);
        BloodyWoodenFloor bloodywoodenfloor13 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor13, 12, 15);
        BloodyWoodenFloor bloodywoodenfloor14 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor14, 13, 15);
        BloodyWoodenFloor bloodywoodenfloor15 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor15, 14, 15);
        BloodyWoodenFloor bloodywoodenfloor16 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor16, 15, 15);
        BloodyWoodenFloor bloodywoodenfloor17 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor17, 16, 15);
        BloodyWoodenFloor bloodywoodenfloor18 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor18, 17, 15);
        BloodyWoodenFloor bloodywoodenfloor19 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor19, 18, 15);
        BloodyWoodenFloor bloodywoodenfloor20 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor20, 19, 15);
        BloodyWoodenFloor bloodywoodenfloor21 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor21, 20, 15);
        BloodyWoodenFloor bloodywoodenfloor22 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor22, 21, 15);
        BloodyWoodenFloor bloodywoodenfloor23 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor23, 22, 15);
        BloodyWoodenFloor bloodywoodenfloor24 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor24, 23, 15);
        BloodyWoodenFloor bloodywoodenfloor25 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor25, 0, 0);
        BloodyWoodenFloor bloodywoodenfloor26 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor26, 0, 1);
        BloodyWoodenFloor bloodywoodenfloor27 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor27, 0, 2);
        BloodyWoodenFloor bloodywoodenfloor28 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor28, 0, 3);
        BloodyWoodenFloor bloodywoodenfloor29 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor29, 0, 4);
        BloodyWoodenFloor bloodywoodenfloor30 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor30, 0, 5);
        BloodyWoodenFloor bloodywoodenfloor31 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor31, 0, 6);
        BloodyWoodenFloor bloodywoodenfloor32 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor32, 0, 7);
        BloodyWoodenFloor bloodywoodenfloor33 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor33, 0, 8);
        BloodyWoodenFloor bloodywoodenfloor34 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor34, 0, 9);
        BloodyWoodenFloor bloodywoodenfloor35 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor35, 0, 10);
        BloodyWoodenFloor bloodywoodenfloor36 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor36, 0, 11);
        BloodyWoodenFloor bloodywoodenfloor37 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor37, 0, 12);
        BloodyWoodenFloor bloodywoodenfloor38 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor38, 0, 13);
        BloodyWoodenFloor bloodywoodenfloor39 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor39, 0, 14);
        BloodyWoodenFloor bloodywoodenfloor40 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor40, 1, 0);
        BloodyWoodenFloor bloodywoodenfloor41 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor41, 2, 0);
        BloodyWoodenFloor bloodywoodenfloor42 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor42, 3, 0);
        BloodyWoodenFloor bloodywoodenfloor43 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor43, 4, 0);
        BloodyWoodenFloor bloodywoodenfloor44 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor44, 5, 0);
        BloodyWoodenFloor bloodywoodenfloor45 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor45, 6, 0);
        BloodyWoodenFloor bloodywoodenfloor46 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor46, 7, 0);
        BloodyWoodenFloor bloodywoodenfloor47 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor47, 8, 0);
        BloodyWoodenFloor bloodywoodenfloor48 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor48, 9, 0);
        BloodyWoodenFloor bloodywoodenfloor49 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor49, 10, 0);
        BloodyWoodenFloor bloodywoodenfloor50 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor50, 11, 0);
        BloodyWoodenFloor bloodywoodenfloor51 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor51, 12, 0);
        BloodyWoodenFloor bloodywoodenfloor52 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor52, 13, 0);
        BloodyWoodenFloor bloodywoodenfloor53 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor53, 14, 0);
        BloodyWoodenFloor bloodywoodenfloor54 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor54, 15, 0);
        BloodyWoodenFloor bloodywoodenfloor55 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor55, 16, 0);
        BloodyWoodenFloor bloodywoodenfloor56 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor56, 17, 0);
        BloodyWoodenFloor bloodywoodenfloor57 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor57, 18, 0);
        BloodyWoodenFloor bloodywoodenfloor58 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor58, 19, 0);
        BloodyWoodenFloor bloodywoodenfloor59 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor59, 20, 0);
        BloodyWoodenFloor bloodywoodenfloor60 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor60, 21, 0);
        BloodyWoodenFloor bloodywoodenfloor61 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor61, 22, 0);
        BloodyWoodenFloor bloodywoodenfloor62 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor62, 23, 0);
        BloodyWoodenFloor bloodywoodenfloor63 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor63, 23, 1);
        BloodyWoodenFloor bloodywoodenfloor64 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor64, 23, 2);
        BloodyWoodenFloor bloodywoodenfloor65 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor65, 23, 3);
        BloodyWoodenFloor bloodywoodenfloor66 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor66, 23, 4);
        BloodyWoodenFloor bloodywoodenfloor67 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor67, 23, 5);
        BloodyWoodenFloor bloodywoodenfloor68 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor68, 23, 6);
        BloodyWoodenFloor bloodywoodenfloor69 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor69, 23, 7);
        BloodyWoodenFloor bloodywoodenfloor70 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor70, 23, 8);
        BloodyWoodenFloor bloodywoodenfloor71 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor71, 23, 9);
        BloodyWoodenFloor bloodywoodenfloor72 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor72, 23, 10);
        BloodyWoodenFloor bloodywoodenfloor73 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor73, 23, 11);
        BloodyWoodenFloor bloodywoodenfloor74 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor74, 23, 12);
        BloodyWoodenFloor bloodywoodenfloor75 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor75, 23, 13);
        BloodyWoodenFloor bloodywoodenfloor76 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor76, 23, 14);
        WoodenWall woodenwall = new WoodenWall();
        addObject(woodenwall, 1, 4);
        WoodenWall woodenwall2 = new WoodenWall();
        addObject(woodenwall2, 2, 4);
        WoodenWall woodenwall3 = new WoodenWall();
        addObject(woodenwall3, 4, 4);
        WoodenWall woodenwall4 = new WoodenWall();
        addObject(woodenwall4, 5, 4);
        WoodenWall woodenwall5 = new WoodenWall();
        addObject(woodenwall5, 6, 4);
        WoodenWall woodenwall6 = new WoodenWall();
        addObject(woodenwall6, 6, 3);
        WoodenWall woodenwall7 = new WoodenWall();
        addObject(woodenwall7, 6, 1);
        WoodenWall woodenwall8 = new WoodenWall();
        addObject(woodenwall8, 6, 2);
        WoodenWall woodenwall9 = new WoodenWall();
        addObject(woodenwall9, 6, 5);
        WoodenWall woodenwall10 = new WoodenWall();
        addObject(woodenwall10, 6, 6);
        WoodenWall woodenwall11 = new WoodenWall();
        addObject(woodenwall11, 6, 7);
        WoodenWall woodenwall12 = new WoodenWall();
        addObject(woodenwall12, 4, 6);
        WoodenWall woodenwall13 = new WoodenWall();
        addObject(woodenwall13, 3, 6);
        WoodenWall woodenwall14 = new WoodenWall();
        addObject(woodenwall14, 2, 6);
        WoodenWall woodenwall15 = new WoodenWall();
        addObject(woodenwall15, 2, 7);
        WoodenWall woodenwall16 = new WoodenWall();
        addObject(woodenwall16, 2, 8);
        WoodenWall woodenwall17 = new WoodenWall();
        addObject(woodenwall17, 3, 8);
        WoodenWall woodenwall18 = new WoodenWall();
        addObject(woodenwall18, 2, 9);
        woodenwall17.setLocation(3, 9);
        woodenwall11.setLocation(3, 8);
        woodenwall17.setLocation(4, 8);
        woodenwall18.setLocation(5, 8);
        WoodenWall woodenwall19 = new WoodenWall();
        addObject(woodenwall19, 6, 8);
        WoodenWall woodenwall20 = new WoodenWall();
        addObject(woodenwall20, 6, 7);
        WoodenWall woodenwall21 = new WoodenWall();
        addObject(woodenwall21, 7, 8);
        WoodenWall woodenwall22 = new WoodenWall();
        addObject(woodenwall22, 8, 8);
        WoodenWall woodenwall23 = new WoodenWall();
        addObject(woodenwall23, 9, 8);
        WoodenWall woodenwall24 = new WoodenWall();
        addObject(woodenwall24, 10, 8);
        WoodenWall woodenwall25 = new WoodenWall();
        addObject(woodenwall25, 11, 8);
        WoodenWall woodenwall26 = new WoodenWall();
        addObject(woodenwall26, 13, 8);
        WoodenWall woodenwall27 = new WoodenWall();
        addObject(woodenwall27, 14, 8);
        WoodenWall woodenwall28 = new WoodenWall();
        addObject(woodenwall28, 15, 8);
        WoodenWall woodenwall29 = new WoodenWall();
        addObject(woodenwall29, 16, 8);
        WoodenWall woodenwall30 = new WoodenWall();
        addObject(woodenwall30, 16, 7);
        WoodenWall woodenwall31 = new WoodenWall();
        addObject(woodenwall31, 16, 6);
        WoodenWall woodenwall32 = new WoodenWall();
        addObject(woodenwall32, 17, 8);
        WoodenWall woodenwall33 = new WoodenWall();
        addObject(woodenwall33, 18, 8);
        WoodenWall woodenwall34 = new WoodenWall();
        addObject(woodenwall34, 19, 8);
        WoodenWall woodenwall35 = new WoodenWall();
        addObject(woodenwall35, 20, 8);
        woodenwall30.setLocation(17, 7);
        woodenwall31.setLocation(17, 6);
        WoodenWall woodenwall36 = new WoodenWall();
        addObject(woodenwall36, 21, 8);
        WoodenWall woodenwall37 = new WoodenWall();
        addObject(woodenwall37, 21, 7);
        WoodenWall woodenwall38 = new WoodenWall();
        addObject(woodenwall38, 21, 6);
        WoodenWall woodenwall39 = new WoodenWall();
        addObject(woodenwall39, 20, 6);
        WoodenWall woodenwall40 = new WoodenWall();
        addObject(woodenwall40, 19, 6);
        WoodenWall woodenwall41 = new WoodenWall();
        addObject(woodenwall41, 17, 5);
        WoodenWall woodenwall42 = new WoodenWall();
        addObject(woodenwall42, 17, 1);
        WoodenWall woodenwall43 = new WoodenWall();
        addObject(woodenwall43, 17, 2);
        WoodenWall woodenwall44 = new WoodenWall();
        addObject(woodenwall44, 17, 3);
        WoodenWall woodenwall45 = new WoodenWall();
        addObject(woodenwall45, 17, 4);
        WoodenWall woodenwall46 = new WoodenWall();
        addObject(woodenwall46, 18, 4);
        WoodenWall woodenwall47 = new WoodenWall();
        addObject(woodenwall47, 19, 4);
        WoodenWall woodenwall48 = new WoodenWall();
        addObject(woodenwall48, 22, 4);
        WoodenWall woodenwall49 = new WoodenWall();
        addObject(woodenwall49, 21, 4);
        IronDoor irondoor = new IronDoor();
        addObject(irondoor, 1, 8);
        IronDoor irondoor2 = new IronDoor();
        addObject(irondoor2, 22, 8);
        WoodenWall woodenwall50 = new WoodenWall();
        addObject(woodenwall50, 22, 10);
        WoodenWall woodenwall51 = new WoodenWall();
        addObject(woodenwall51, 21, 10);
        WoodenWall woodenwall52 = new WoodenWall();
        addObject(woodenwall52, 20, 10);
        WoodenWall woodenwall53 = new WoodenWall();
        addObject(woodenwall53, 19, 10);
        WoodenWall woodenwall54 = new WoodenWall();
        addObject(woodenwall54, 18, 10);
        WoodenWall woodenwall55 = new WoodenWall();
        addObject(woodenwall55, 17, 10);
        WoodenWall woodenwall56 = new WoodenWall();
        addObject(woodenwall56, 16, 11);
        woodenwall56.setLocation(16, 10);
        WoodenWall woodenwall57 = new WoodenWall();
        addObject(woodenwall57, 16, 12);
        WoodenWall woodenwall58 = new WoodenWall();
        addObject(woodenwall58, 17, 12);
        WoodenWall woodenwall59 = new WoodenWall();
        addObject(woodenwall59, 18, 12);
        WoodenWall woodenwall60 = new WoodenWall();
        addObject(woodenwall60, 19, 12);
        WoodenWall woodenwall61 = new WoodenWall();
        addObject(woodenwall61, 16, 14);
        WoodenWall woodenwall62 = new WoodenWall();
        addObject(woodenwall62, 17, 14);
        WoodenWall woodenwall63 = new WoodenWall();
        addObject(woodenwall63, 18, 14);
        WoodenWall woodenwall64 = new WoodenWall();
        addObject(woodenwall64, 19, 14);
        WoodenWall woodenwall65 = new WoodenWall();
        addObject(woodenwall65, 20, 14);
        WoodenWall woodenwall66 = new WoodenWall();
        addObject(woodenwall66, 21, 14);
        WoodenWall woodenwall67 = new WoodenWall();
        addObject(woodenwall67, 22, 14);
        WoodenWall woodenwall68 = new WoodenWall();
        addObject(woodenwall68, 22, 11);
        WoodenWall woodenwall69 = new WoodenWall();
        addObject(woodenwall69, 22, 12);
        WoodenWall woodenwall70 = new WoodenWall();
        addObject(woodenwall70, 22, 13);
        woodenwall60.setLocation(18, 11);
        woodenwall59.setLocation(18, 13);
        woodenwall57.setLocation(16, 11);
        WoodenWall woodenwall71 = new WoodenWall();
        addObject(woodenwall71, 16, 13);
        woodenwall25.setLocation(10, 10);
        woodenwall24.setLocation(11, 8);
        woodenwall23.setLocation(10, 8);
        woodenwall22.setLocation(9, 8);
        woodenwall21.setLocation(8, 8);
        woodenwall19.setLocation(7, 8);
        woodenwall20.setLocation(7, 7);
        woodenwall10.setLocation(7, 6);
        woodenwall9.setLocation(7, 5);
        woodenwall5.setLocation(7, 4);
        woodenwall6.setLocation(7, 3);
        woodenwall8.setLocation(7, 2);
        woodenwall7.setLocation(7, 1);
        woodenwall4.setLocation(6, 4);
        woodenwall3.setLocation(5, 4);
        woodenwall2.setLocation(3, 4);
        woodenwall.setLocation(2, 4);
        woodenwall12.setLocation(5, 6);
        woodenwall18.setLocation(6, 8);
        woodenwall17.setLocation(5, 8);
        woodenwall11.setLocation(4, 8);
        woodenwall16.setLocation(3, 8);
        woodenwall15.setLocation(3, 7);
        woodenwall13.setLocation(4, 6);
        woodenwall14.setLocation(3, 6);
        woodenwall25.setLocation(1, 5);
        WoodenWall woodenwall72 = new WoodenWall();
        addObject(woodenwall72, 1, 1);
        WoodenWall woodenwall73 = new WoodenWall();
        addObject(woodenwall73, 1, 2);
        WoodenWall woodenwall74 = new WoodenWall();
        addObject(woodenwall74, 1, 3);
        WoodenWall woodenwall75 = new WoodenWall();
        addObject(woodenwall75, 1, 4);
        WoodenWall woodenwall76 = new WoodenWall();
        addObject(woodenwall76, 1, 6);
        WoodenWall woodenwall77 = new WoodenWall();
        addObject(woodenwall77, 1, 7);
        WoodenWall woodenwall78 = new WoodenWall();
        addObject(woodenwall78, 1, 9);
        WoodenWall woodenwall79 = new WoodenWall();
        addObject(woodenwall79, 1, 10);
        WoodenWall woodenwall80 = new WoodenWall();
        addObject(woodenwall80, 1, 11);
        WoodenWall woodenwall81 = new WoodenWall();
        addObject(woodenwall81, 1, 12);
        WoodenWall woodenwall82 = new WoodenWall();
        addObject(woodenwall82, 1, 14);
        WoodenWall woodenwall83 = new WoodenWall();
        addObject(woodenwall83, 1, 13);
        irondoor.setLocation(2, 8);
        WoodenWall woodenwall84 = new WoodenWall();
        addObject(woodenwall84, 1, 8);
        WoodenWall woodenwall85 = new WoodenWall();
        addObject(woodenwall85, 15, 10);
        WoodenWall woodenwall86 = new WoodenWall();
        addObject(woodenwall86, 15, 14);
        woodenwall71.setLocation(15, 13);
        woodenwall58.setLocation(16, 12);
        woodenwall59.setLocation(17, 13);
        woodenwall60.setLocation(17, 11);
        woodenwall57.setLocation(15, 11);
        WoodenWall woodenwall87 = new WoodenWall();
        addObject(woodenwall87, 2, 10);
        WoodenWall woodenwall88 = new WoodenWall();
        addObject(woodenwall88, 11, 10);
        WoodenWall woodenwall89 = new WoodenWall();
        addObject(woodenwall89, 10, 10);
        WoodenWall woodenwall90 = new WoodenWall();
        addObject(woodenwall90, 9, 10);
        WoodenWall woodenwall91 = new WoodenWall();
        addObject(woodenwall91, 8, 10);
        WoodenWall woodenwall92 = new WoodenWall();
        addObject(woodenwall92, 7, 10);
        WoodenWall woodenwall93 = new WoodenWall();
        addObject(woodenwall93, 6, 10);
        WoodenWall woodenwall94 = new WoodenWall();
        addObject(woodenwall94, 5, 10);
        WoodenWall woodenwall95 = new WoodenWall();
        addObject(woodenwall95, 4, 10);
        WoodenWall woodenwall96 = new WoodenWall();
        addObject(woodenwall96, 3, 10);
        WoodenWall woodenwall97 = new WoodenWall();
        addObject(woodenwall97, 2, 14);
        WoodenWall woodenwall98 = new WoodenWall();
        addObject(woodenwall98, 3, 14);
        WoodenWall woodenwall99 = new WoodenWall();
        addObject(woodenwall99, 4, 14);
        WoodenWall woodenwall100 = new WoodenWall();
        addObject(woodenwall100, 5, 14);
        WoodenWall woodenwall101 = new WoodenWall();
        addObject(woodenwall101, 6, 14);
        WoodenWall woodenwall102 = new WoodenWall();
        addObject(woodenwall102, 7, 14);
        WoodenWall woodenwall103 = new WoodenWall();
        addObject(woodenwall103, 8, 14);
        WoodenWall woodenwall104 = new WoodenWall();
        addObject(woodenwall104, 9, 14);
        WoodenWall woodenwall105 = new WoodenWall();
        addObject(woodenwall105, 10, 14);
        WoodenWall woodenwall106 = new WoodenWall();
        addObject(woodenwall106, 11, 14);
        WoodenWall woodenwall107 = new WoodenWall();
        addObject(woodenwall107, 12, 14);
        WoodenWall woodenwall108 = new WoodenWall();
        addObject(woodenwall108, 13, 14);
        WoodenWall woodenwall109 = new WoodenWall();
        addObject(woodenwall109, 14, 14);
        WoodenWall woodenwall110 = new WoodenWall();
        addObject(woodenwall110, 14, 10);
        WoodenWall woodenwall111 = new WoodenWall();
        addObject(woodenwall111, 13, 10);
        woodenwall58.setLocation(16, 10);
        woodenwall58.setLocation(16, 11);
        WoodenWall woodenwall112 = new WoodenWall();
        addObject(woodenwall112, 16, 13);
        WoodenWall woodenwall115 = new WoodenWall();
        addObject(woodenwall115, 9, 11);
        WoodenWall woodenwall116 = new WoodenWall();
        addObject(woodenwall116, 9, 13);
        WoodenWall woodenwall117 = new WoodenWall();
        addObject(woodenwall117, 7, 11);
        WoodenWall woodenwall118 = new WoodenWall();
        addObject(woodenwall118, 7, 13);
        WoodenWall woodenwall119 = new WoodenWall();
        addObject(woodenwall119, 5, 11);
        WoodenWall woodenwall120 = new WoodenWall();
        addObject(woodenwall120, 5, 13);
        WoodenWall woodenwall121 = new WoodenWall();
        addObject(woodenwall121, 3, 11);
        WoodenWall woodenwall122 = new WoodenWall();
        addObject(woodenwall122, 3, 13);
        woodenwall121.setLocation(4, 11);
        woodenwall122.setLocation(4, 13);
        woodenwall119.setLocation(6, 11);
        woodenwall120.setLocation(6, 13);
        woodenwall117.setLocation(8, 11);
        woodenwall118.setLocation(8, 13);
        woodenwall115.setLocation(10, 11);
        woodenwall116.setLocation(10, 13);
        Slime slime = new Slime(1);
        addObject(slime, 5, 11);
        RedSlime redslime = new RedSlime(1);
        addObject(redslime, 5, 13);
        CorruptSamurai corruptsamurai = new CorruptSamurai(1);
        addObject(corruptsamurai, 7, 11);
        Treeant treeant = new Treeant(1);
        addObject(treeant, 7, 13);
        Plant plant = new Plant();
        addObject(plant, 9, 11) ; 
        Golem golem = new Golem(level);
        addObject(golem, 10, 14);
        golem.setLocation(10, 14);
        golem.setLocation(10, 14);
        removeObject(golem);
        Plant plant2 = new Plant();
        addObject(plant2, 9, 13);
        TroubledAlice troubledalice = new TroubledAlice();
        addObject(troubledalice, 14, 13);
        HotPot hotpot = new HotPot() ; 
        addObject(hotpot, 13, 13) ; 
        PickyRicky pickyricky = new PickyRicky();
        addObject(pickyricky, 12, 13);
        DojoMaster dojomaster = new DojoMaster();
        addObject(dojomaster, 20, 2);
        DojoMaster dojomaster2 = new DojoMaster();
        addObject(dojomaster2, 4, 2);
        WiseJeff wisejeff = new WiseJeff();
        addObject(wisejeff, 12, 8);
        MaxHealthPotion maxhealthpotion = new MaxHealthPotion();
        addObject(maxhealthpotion, 21, 11);
        MaxHealthPotion maxhealthpotion2 = new MaxHealthPotion();
        addObject(maxhealthpotion2, 21, 11);
        MaxHealthPotion maxhealthpotion3 = new MaxHealthPotion();
        addObject(maxhealthpotion3, 21, 12);
        MaxHealthPotion maxhealthpotion4 = new MaxHealthPotion();
        addObject(maxhealthpotion4, 20, 11);
        MaxHealthPotion maxhealthpotion5 = new MaxHealthPotion();
        addObject(maxhealthpotion5, 20, 12);
        MaxHealthPotion maxhealthpotion6 = new MaxHealthPotion();
        addObject(maxhealthpotion6, 20, 13);
        maxhealthpotion2.setLocation(21, 13);
        Pakekel pakekel = new Pakekel(level);
        addObject(pakekel, 12, 3);
        SilverKey silverkey = new SilverKey() ; 
        addObject(silverkey, 12, 9) ; 
        ButtonTiles buttontile = new ButtonTiles(12, 8) ; 
        addObject(buttontile, 12, 7) ; 
    }
}