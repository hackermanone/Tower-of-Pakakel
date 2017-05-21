import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 2 of the game
 * 
 * @author Michael Ma, Ricky Chen
 * @version 1 
 */
public class Level2 extends Controller
{
    private Player player;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        super(24, 16, 40); 
        prepare();
    }

    public Level2(Player player,InvisiblePlayer invisPlayer,Arrow arrow, EnemiesIcon enemyIcon)
    {
        super(24,16,40);
        bgm = new GreenfootSound("Level2.mp3");
        prepare();
        level = 2;
        addObject(player,2,13);
        addObject(invisPlayer,2,13);
        addObject(arrow,2,14);
        addObject(enemyIcon,0,0) ; 
        DisplayText text = new DisplayText(player);
        addObject(text,2,0);
    }

    private void prepare()
    {
        bgm.playLoop();
        Hole hole = new Hole();
        addObject(hole, 10, 8);
        BloodyWoodenFloor bloodywoodenfloor = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor, 23, 15);
        BloodyWoodenFloor bloodywoodenfloor2 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor2, 22, 15);
        BloodyWoodenFloor bloodywoodenfloor3 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor3, 21, 15);
        BloodyWoodenFloor bloodywoodenfloor4 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor4, 20, 15);
        BloodyWoodenFloor bloodywoodenfloor5 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor5, 19, 15);
        BloodyWoodenFloor bloodywoodenfloor6 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor6, 18, 15);
        BloodyWoodenFloor bloodywoodenfloor7 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor7, 17, 15);
        BloodyWoodenFloor bloodywoodenfloor8 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor8, 16, 15);
        BloodyWoodenFloor bloodywoodenfloor9 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor9, 15, 15);
        BloodyWoodenFloor bloodywoodenfloor10 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor10, 14, 15);
        BloodyWoodenFloor bloodywoodenfloor11 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor11, 14, 15);
        BloodyWoodenFloor bloodywoodenfloor12 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor12, 13, 15);
        bloodywoodenfloor11.setLocation(12, 15);
        BloodyWoodenFloor bloodywoodenfloor13 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor13, 11, 15);
        BloodyWoodenFloor bloodywoodenfloor14 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor14, 10, 15);
        BloodyWoodenFloor bloodywoodenfloor15 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor15, 9, 15);
        BloodyWoodenFloor bloodywoodenfloor16 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor16, 8, 15);
        BloodyWoodenFloor bloodywoodenfloor17 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor17, 7, 15);
        BloodyWoodenFloor bloodywoodenfloor18 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor18, 5, 15);
        BloodyWoodenFloor bloodywoodenfloor19 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor19, 6, 15);
        BloodyWoodenFloor bloodywoodenfloor20 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor20, 4, 15);
        BloodyWoodenFloor bloodywoodenfloor21 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor21, 3, 15);
        BloodyWoodenFloor bloodywoodenfloor22 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor22, 2, 15);
        BloodyWoodenFloor bloodywoodenfloor23 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor23, 1, 15);
        BloodyWoodenFloor bloodywoodenfloor24 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor24, 1, 15);
        BloodyWoodenFloor bloodywoodenfloor25 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor25, 0, 15);
        bloodywoodenfloor24.setLocation(0, 14);
        BloodyWoodenFloor bloodywoodenfloor26 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor26, 23, 14);
        BloodyWoodenFloor bloodywoodenfloor27 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor27, 23, 13);
        BloodyWoodenFloor bloodywoodenfloor28 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor28, 23, 11);
        BloodyWoodenFloor bloodywoodenfloor29 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor29, 23, 12);
        BloodyWoodenFloor bloodywoodenfloor30 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor30, 23, 9);
        BloodyWoodenFloor bloodywoodenfloor31 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor31, 23, 10);
        BloodyWoodenFloor bloodywoodenfloor32 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor32, 23, 8);
        BloodyWoodenFloor bloodywoodenfloor33 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor33, 23, 7);
        BloodyWoodenFloor bloodywoodenfloor34 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor34, 23, 5);
        BloodyWoodenFloor bloodywoodenfloor35 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor35, 23, 6);
        BloodyWoodenFloor bloodywoodenfloor36 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor36, 23, 3);
        BloodyWoodenFloor bloodywoodenfloor37 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor37, 23, 4);
        BloodyWoodenFloor bloodywoodenfloor38 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor38, 23, 2);
        BloodyWoodenFloor bloodywoodenfloor39 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor39, 23, 1);
        BloodyWoodenFloor bloodywoodenfloor40 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor40, 23, 0);
        BloodyWoodenFloor bloodywoodenfloor41 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor41, 22, 0);
        BloodyWoodenFloor bloodywoodenfloor42 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor42, 20, 0);
        BloodyWoodenFloor bloodywoodenfloor43 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor43, 21, 0);
        BloodyWoodenFloor bloodywoodenfloor44 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor44, 18, 0);
        BloodyWoodenFloor bloodywoodenfloor45 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor45, 19, 0);
        BloodyWoodenFloor bloodywoodenfloor46 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor46, 16, 0);
        BloodyWoodenFloor bloodywoodenfloor47 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor47, 17, 0);
        BloodyWoodenFloor bloodywoodenfloor48 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor48, 15, 0);
        BloodyWoodenFloor bloodywoodenfloor49 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor49, 14, 0);
        BloodyWoodenFloor bloodywoodenfloor50 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor50, 12, 0);
        BloodyWoodenFloor bloodywoodenfloor51 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor51, 13, 0);
        BloodyWoodenFloor bloodywoodenfloor52 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor52, 11, 0);
        BloodyWoodenFloor bloodywoodenfloor53 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor53, 10, 0);
        BloodyWoodenFloor bloodywoodenfloor54 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor54, 8, 0);
        BloodyWoodenFloor bloodywoodenfloor55 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor55, 9, 0);
        BloodyWoodenFloor bloodywoodenfloor56 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor56, 7, 0);
        BloodyWoodenFloor bloodywoodenfloor57 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor57, 6, 0);
        BloodyWoodenFloor bloodywoodenfloor58 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor58, 4, 0);
        BloodyWoodenFloor bloodywoodenfloor59 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor59, 5, 0);
        BloodyWoodenFloor bloodywoodenfloor60 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor60, 1, 0);
        BloodyWoodenFloor bloodywoodenfloor61 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor61, 3, 0);
        BloodyWoodenFloor bloodywoodenfloor62 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor62, 2, 0);
        BloodyWoodenFloor bloodywoodenfloor63 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor63, 0, 0);
        BloodyWoodenFloor bloodywoodenfloor64 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor64, 0, 1);
        BloodyWoodenFloor bloodywoodenfloor65 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor65, 0, 4);
        BloodyWoodenFloor bloodywoodenfloor66 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor66, 0, 2);
        BloodyWoodenFloor bloodywoodenfloor67 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor67, 0, 3);
        BloodyWoodenFloor bloodywoodenfloor68 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor68, 0, 6);
        BloodyWoodenFloor bloodywoodenfloor69 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor69, 0, 5);
        BloodyWoodenFloor bloodywoodenfloor70 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor70, 0, 7);
        BloodyWoodenFloor bloodywoodenfloor71 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor71, 0, 9);
        BloodyWoodenFloor bloodywoodenfloor72 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor72, 0, 10);
        BloodyWoodenFloor bloodywoodenfloor73 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor73, 0, 8);
        BloodyWoodenFloor bloodywoodenfloor74 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor74, 0, 11);
        BloodyWoodenFloor bloodywoodenfloor75 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor75, 0, 12);
        BloodyWoodenFloor bloodywoodenfloor76 = new BloodyWoodenFloor();
        addObject(bloodywoodenfloor76, 0, 13);
        // Required
        WoodenWall woodenwall = new WoodenWall();
        addObject(woodenwall, 3, 14);
        WoodenWall woodenwall2 = new WoodenWall();
        addObject(woodenwall2, 3, 13);
        WoodenWall woodenwall3 = new WoodenWall();
        addObject(woodenwall3, 3, 12);
        WoodenWall woodenwall4 = new WoodenWall();
        addObject(woodenwall4, 3, 11);
        WoodenWall woodenwall5 = new WoodenWall();
        addObject(woodenwall5, 3, 10);
        WoodenWall woodenwall6 = new WoodenWall();
        addObject(woodenwall6, 5, 10);
        WoodenWall woodenwall8 = new WoodenWall();
        addObject(woodenwall8, 7, 10);
        WoodenWall woodenwall9 = new WoodenWall();
        addObject(woodenwall9, 8, 10);
        WoodenWall woodenwall10 = new WoodenWall();
        addObject(woodenwall10, 9, 10);
        WoodenWall woodenwall11 = new WoodenWall();
        addObject(woodenwall11, 10, 10);
        WoodenWall woodenwall12 = new WoodenWall();
        addObject(woodenwall12, 10, 11);
        WoodenWall woodenwall13 = new WoodenWall();
        addObject(woodenwall13, 10, 13);
        WoodenWall woodenwall14 = new WoodenWall();
        addObject(woodenwall14, 10, 14);
        WoodenWall woodenwall15 = new WoodenWall();
        addObject(woodenwall15, 11, 10);
        WoodenWall woodenwall16 = new WoodenWall();
        addObject(woodenwall16, 12, 10);
        WoodenWall woodenwall17 = new WoodenWall();
        addObject(woodenwall17, 13, 10);
        WoodenWall woodenwall18 = new WoodenWall();
        addObject(woodenwall18, 14, 10);
        WoodenWall woodenwall19 = new WoodenWall();
        addObject(woodenwall19, 14, 11);
        WoodenWall woodenwall20 = new WoodenWall();
        addObject(woodenwall20, 14, 12);
        WoodenWall woodenwall21 = new WoodenWall();
        addObject(woodenwall21, 14, 13);
        WoodenWall woodenwall22 = new WoodenWall();
        addObject(woodenwall22, 14, 14);
        WoodenWall woodenwall23 = new WoodenWall();
        addObject(woodenwall23, 15, 10);
        WoodenWall woodenwall24 = new WoodenWall();
        addObject(woodenwall24, 17, 10);
        WoodenWall woodenwall25 = new WoodenWall();
        addObject(woodenwall25, 18, 10);
        WoodenWall woodenwall26 = new WoodenWall();
        addObject(woodenwall26, 16, 10);
        WoodenWall woodenwall27 = new WoodenWall();
        addObject(woodenwall27, 20, 10);
        WoodenWall woodenwall28 = new WoodenWall();
        addObject(woodenwall28, 21, 10);
        WoodenWall woodenwall29 = new WoodenWall();
        addObject(woodenwall29, 22, 10);
        WoodenWall woodenwall30 = new WoodenWall();
        addObject(woodenwall30, 20, 1);
        WoodenWall woodenwall31 = new WoodenWall();
        addObject(woodenwall31, 20, 2);
        WoodenWall woodenwall32 = new WoodenWall();
        addObject(woodenwall32, 20, 3);
        WoodenWall woodenwall33 = new WoodenWall();
        addObject(woodenwall33, 20, 4);
        WoodenWall woodenwall34 = new WoodenWall();
        addObject(woodenwall34, 20, 5);
        WoodenWall woodenwall35 = new WoodenWall();
        addObject(woodenwall35, 20, 6);
        WoodenWall woodenwall36 = new WoodenWall();
        addObject(woodenwall36, 20, 7);
        WoodenWall woodenwall37 = new WoodenWall();
        addObject(woodenwall37, 19, 7);
        WoodenWall woodenwall38 = new WoodenWall();
        addObject(woodenwall38, 17, 7);
        WoodenWall woodenwall39 = new WoodenWall();
        addObject(woodenwall39, 19, 7);
        woodenwall39.setLocation(18, 7);
        WoodenWall woodenwall40 = new WoodenWall();
        addObject(woodenwall40, 16, 7);
        WoodenWall woodenwall41 = new WoodenWall();
        addObject(woodenwall41, 15, 7);
        WoodenWall woodenwall42 = new WoodenWall();
        addObject(woodenwall42, 13, 7);
        WoodenWall woodenwall43 = new WoodenWall();
        addObject(woodenwall43, 14, 7);
        WoodenWall woodenwall44 = new WoodenWall();
        addObject(woodenwall44, 12, 7);
        WoodenWall woodenwall45 = new WoodenWall();
        addObject(woodenwall45, 10, 7);
        WoodenWall woodenwall46 = new WoodenWall();
        addObject(woodenwall46, 11, 7);
        WoodenWall woodenwall47 = new WoodenWall();
        addObject(woodenwall47, 9, 7);
        WoodenWall woodenwall48 = new WoodenWall();
        addObject(woodenwall48, 8, 7);
        WoodenWall woodenwall49 = new WoodenWall();
        addObject(woodenwall49, 7, 7);
        WoodenWall woodenwall50 = new WoodenWall();
        addObject(woodenwall50, 6, 7);
        WoodenWall woodenwall51 = new WoodenWall();
        addObject(woodenwall51, 5, 7);
        WoodenWall woodenwall52 = new WoodenWall();
        addObject(woodenwall52, 4, 7);
        WoodenWall woodenwall53 = new WoodenWall();
        addObject(woodenwall53, 3, 7);
        WoodenWall woodenwall54 = new WoodenWall();
        addObject(woodenwall54, 2, 7);
        WoodenWall woodenwall55 = new WoodenWall();
        addObject(woodenwall55, 2, 6);
        WoodenWall woodenwall56 = new WoodenWall();
        addObject(woodenwall56, 2, 5);
        WoodenWall woodenwall57 = new WoodenWall();
        addObject(woodenwall57, 2, 4);
        WoodenWall woodenwall58 = new WoodenWall();
        addObject(woodenwall58, 2, 1);
        WoodenWall woodenwall59 = new WoodenWall();
        addObject(woodenwall59, 2, 2);
        WoodenWall woodenwall60 = new WoodenWall();
        addObject(woodenwall60, 8, 4);
        WoodenWall woodenwall61 = new WoodenWall();
        addObject(woodenwall61, 8, 1);
        WoodenWall woodenwall62 = new WoodenWall();
        addObject(woodenwall62, 8, 2);
        WoodenWall woodenwall63 = new WoodenWall();
        addObject(woodenwall63, 8, 3);
        WoodenWall woodenwall64 = new WoodenWall();
        addObject(woodenwall64, 9, 5);
        woodenwall64.setLocation(8, 5);
        WoodenWall woodenwall66 = new WoodenWall();
        addObject(woodenwall66, 11, 5);
        WoodenWall woodenwall68 = new WoodenWall();
        addObject(woodenwall68, 9, 2);
        WoodenWall woodenwall69 = new WoodenWall();
        addObject(woodenwall69, 10, 2);
        WoodenWall woodenwall70 = new WoodenWall();
        addObject(woodenwall70, 12, 5);
        WoodenWall woodenwall71 = new WoodenWall();
        addObject(woodenwall71, 14, 6);
        WoodenWall woodenwall72 = new WoodenWall();
        addObject(woodenwall72, 14, 5);
        WoodenWall woodenwall73 = new WoodenWall();
        addObject(woodenwall73, 14, 4);
        WoodenWall woodenwall74 = new WoodenWall();
        addObject(woodenwall74, 12, 4);
        WoodenWall woodenwall75 = new WoodenWall();
        addObject(woodenwall75, 12, 3);
        WoodenWall woodenwall76 = new WoodenWall();
        addObject(woodenwall76, 11, 3);
        woodenwall69.setLocation(10, 1);
        woodenwall68.setLocation(9, 1);
        woodenwall73.setLocation(13, 3);
        WoodenWall woodenwall78 = new WoodenWall();
        addObject(woodenwall78, 14, 3);
        WoodenWall woodenwall79 = new WoodenWall();
        addObject(woodenwall79, 15, 3);
        WoodenWall woodenwall80 = new WoodenWall();
        addObject(woodenwall80, 16, 3);
        WoodenWall woodenwall81 = new WoodenWall();
        addObject(woodenwall81, 17, 3);
        WoodenWall woodenwall82 = new WoodenWall();
        addObject(woodenwall82, 18, 3);
        WoodenWall woodenwall83 = new WoodenWall();
        addObject(woodenwall83, 19, 3);
        WoodenWall woodenwall84 = new WoodenWall();
        addObject(woodenwall84, 11, 1);
        WoodenWall woodenwall85 = new WoodenWall();
        addObject(woodenwall85, 13, 1);
        WoodenWall woodenwall86 = new WoodenWall();
        addObject(woodenwall86, 12, 1);
        WoodenWall woodenwall87 = new WoodenWall();
        addObject(woodenwall87, 14, 1);
        WoodenWall woodenwall88 = new WoodenWall();
        addObject(woodenwall88, 15, 1);
        WoodenWall woodenwall89 = new WoodenWall();
        addObject(woodenwall89, 16, 1);
        WoodenWall woodenwall90 = new WoodenWall();
        addObject(woodenwall90, 17, 1);
        WoodenWall woodenwall91 = new WoodenWall();
        addObject(woodenwall91, 18, 1);
        WoodenWall woodenwall92 = new WoodenWall();
        addObject(woodenwall92, 19, 1);
        WoodenWall woodenwall93 = new WoodenWall();
        addObject(woodenwall93, 19, 2);
        woodenwall83.setLocation(18, 4);
        woodenwall93.setLocation(19, 5);
        woodenwall83.setLocation(18, 5);
        woodenwall82.setLocation(17, 5);
        WoodenWall woodenwall94 = new WoodenWall();
        addObject(woodenwall94, 17, 4);
        woodenwall83.setLocation(17, 6);
        woodenwall93.setLocation(11, 4);
        WoodenWall woodenwall97 = new WoodenWall();
        addObject(woodenwall97, 5, 4);
        WoodenWall woodenwall98 = new WoodenWall();
        addObject(woodenwall98, 5, 5);
        WoodenWall woodenwall99 = new WoodenWall();
        addObject(woodenwall99, 6, 5);
        WoodenWall woodenwall100 = new WoodenWall();
        addObject(woodenwall100, 6, 6);
        woodenwall98.setLocation(6, 4);
        woodenwall97.setLocation(6, 3);
        WoodenWall woodenwall101 = new WoodenWall();
        addObject(woodenwall101, 4, 2);
        WoodenWall woodenwall103 = new WoodenWall();
        addObject(woodenwall103, 6, 2);
        removeObject(woodenwall66);
        removeObject(woodenwall74);
        woodenwall70.setLocation(11, 5);
        WoodenWall woodenwall104 = new WoodenWall();
        addObject(woodenwall104, 4, 3);
        woodenwall5.setLocation(4, 11);
        woodenwall4.setLocation(4, 12);
        woodenwall3.setLocation(4, 13);
        woodenwall2.setLocation(4, 14);
        woodenwall.setLocation(4, 10);
        woodenwall72.setLocation(13, 5);
        woodenwall71.setLocation(13, 6);
        WoodenWall woodenwall105 = new WoodenWall();
        addObject(woodenwall105, 4, 4);
        WoodenDoor woodendoor = new WoodenDoor();
        addObject(woodendoor, 5, 2);
        WoodenDoor woodendoor2 = new WoodenDoor();
        addObject(woodendoor2, 13, 4);
        WoodenDoor woodendoor3 = new WoodenDoor();
        addObject(woodendoor3, 10, 12);
        IronDoor irondoor = new IronDoor() ; 
        addObject(irondoor, 19, 10);
        woodenwall24.setLocation(22, 11);
        WoodenWall woodenwall102 = new WoodenWall();
        addObject(woodenwall102, 22, 14);
        WoodenWall woodenwall106 = new WoodenWall();
        addObject(woodenwall106, 18, 14);
        WoodenWall woodenwall107 = new WoodenWall();
        addObject(woodenwall107, 19, 14);
        WoodenWall woodenwall108 = new WoodenWall();
        addObject(woodenwall108, 21, 14);
        WoodenWall woodenwall109 = new WoodenWall();
        addObject(woodenwall109, 20, 14);
        WoodenWall woodenwall110 = new WoodenWall();
        addObject(woodenwall110, 13, 14);
        WoodenWall woodenwall111 = new WoodenWall();
        addObject(woodenwall111, 12, 14);
        WoodenWall woodenwall112 = new WoodenWall();
        addObject(woodenwall112, 11, 14);
        hole.setLocation(22, 1);
        WoodenWall woodenwall113 = new WoodenWall();
        addObject(woodenwall113, 17, 10);
        WoodenWall woodenwall114 = new WoodenWall();
        addObject(woodenwall114, 17, 14);
        WoodenWall woodenwall115 = new WoodenWall();
        addObject(woodenwall115, 16, 14);
        WoodenWall woodenwall116 = new WoodenWall();
        addObject(woodenwall116, 15, 14);
        WoodenDoor woodendoor4 = new WoodenDoor();
        addObject(woodendoor4, 6, 10);
        WoodenDoor woodendoor5 = new WoodenDoor();
        addObject(woodendoor5, 1, 7);
        SilverKey silverkey = new SilverKey();
        addObject(silverkey, 12, 12);
        SilverKey silverkey2 = new SilverKey();
        addObject(silverkey2, 15, 5);
        CorruptSamurai corruptsamurai = new CorruptSamurai(2);
        addObject(corruptsamurai, 18, 5);
        CorruptSamurai corruptsamurai2 = new CorruptSamurai(2);
        addObject(corruptsamurai2, 19, 6);
        ButtonTiles buttontiles = new ButtonTiles(-1, 0);
        addObject(buttontiles, 18, 6);
        PotionSpawner potionspawner = new PotionSpawner();
        addObject(potionspawner, 12, 11);
        PotionSpawner potionspawner2 = new PotionSpawner();
        addObject(potionspawner2, 12, 13);
        PotionSpawner potionspawner3 = new PotionSpawner();
        addObject(potionspawner3, 15, 4);
        PotionSpawner potionspawner4 = new PotionSpawner();
        addObject(potionspawner4, 15, 6);
        PotionSpawner potionspawner5 = new PotionSpawner();
        addObject(potionspawner5, 4, 6);
        RedSlime redslime = new RedSlime(2);
        addObject(redslime, 3, 4);
        RedSlime redslime2 = new RedSlime(2);
        addObject(redslime2, 11, 2);
        RedSlime redslime3 = new RedSlime(2);
        addObject(redslime3, 18, 2);
        potionspawner5.setLocation(3, 6);
        PotionSpawner potionspawner6 = new PotionSpawner();
        addObject(potionspawner6, 5, 6);
        CorruptSamurai corruptsamurai3 = new CorruptSamurai(2);
        addObject(corruptsamurai3, 9, 12);
        CorruptSamurai corruptsamurai4 = new CorruptSamurai(2);
        addObject(corruptsamurai4, 6, 11);
        ButtonTiles buttontiles2 = new ButtonTiles(0, 0);
        addObject(buttontiles2, 7, 10);
        removeObject(buttontiles2);
        corruptsamurai4.setLocation(6, 12);
        woodendoor4.setLocation(6, 11);
        woodenwall.setLocation(5, 11);
        woodenwall.setLocation(4, 10);
        WoodenWall woodenwall117 = new WoodenWall();
        addObject(woodenwall117, 8, 11);
        woodendoor4.setLocation(7, 11);
        WoodenWall woodenwall118 = new WoodenWall();
        addObject(woodenwall118, 6, 11);
        corruptsamurai4.setLocation(7, 12);
        ButtonTiles buttontiles3 = new ButtonTiles(0, 0);
        addObject(buttontiles3, 8, 11);
        CorruptSamurai corruptsamurai5 = new CorruptSamurai(2);
        addObject(corruptsamurai5, 3, 5);
        corruptsamurai5.setLocation(4, 5);
        potionspawner5.setLocation(4, 6);
        woodenwall53.setLocation(3, 7);
        ButtonTiles buttontiles4 = new ButtonTiles(0, 0);
        addObject(buttontiles4, 2, 5);
        WoodenWall woodenwall119 = new WoodenWall();
        addObject(woodenwall119, 3, 6);
        DojoMaster dojomaster = new DojoMaster();
        addObject(dojomaster, 18, 12);
        WoodenWall woodenwall7 = new WoodenWall() ; 
        addObject(woodenwall7, 6, 10) ; 
        ButtonTiles buttontiles5 = new ButtonTiles(0, 0);
        addObject(buttontiles5, 7, 10);
        buttontiles5.setLocation(7, 10);
        BronzeKey bronzekey = new BronzeKey() ; 
        BronzeKey bronzekey2 = new BronzeKey() ; 
        BronzeKey bronzekey3 = new BronzeKey() ; 
        addObject(bronzekey, 3, 11) ; 
        addObject(bronzekey2, 1, 11) ; 
        addObject(bronzekey3, 2, 12) ; 
	}
}