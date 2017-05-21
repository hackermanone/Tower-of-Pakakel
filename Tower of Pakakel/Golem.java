import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Golem, the mini boss of level 3 
 * 
 * @author Michael Ma, Ricky Chen
 * @version 1
 */
public class Golem extends Enemies
{
    GoldenChest chest = new GoldenChest();
    GoldKey key = new GoldKey();
    public Golem(int level)
    {
        hp = level*5;
        atk = 10; 
        def = 5; 
        id = 501;
    }
}
