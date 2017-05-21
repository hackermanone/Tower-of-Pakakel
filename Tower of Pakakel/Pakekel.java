import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pakekel, the might boss monster of Level 5 
 * @author Michael Ma, Ricky Chen
 * @version 1
 */
public class Pakekel extends Enemies
{
    public Pakekel(int level)
    {
        hp = level * 40; 
        atk = level + 5 ; 
        def = level + 2; 
        id = 503;
    }

    public Pakekel()
    {
        hp = 1;
        atk =0;
        def = 0;
        id = 503;
    }

}
