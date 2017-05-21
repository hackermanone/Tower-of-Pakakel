import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoldenChest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenChest extends Actor
{
    Player player;
    Spear spear = new Spear();
    AllPotion potion = new AllPotion();

    /**
     * Act - do whatever the GoldenChest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Controller world = (Controller) getWorld();
        player = world.getPlayer();

        if(this.isTouching(Player.class) && player.getGoldKeys() > 0){
            world.addObject(spear,getX(),getY()+ 1);
            world.addObject(potion,getX(),getY()+ 2);
            player.minusGoldKeys();
            world.removeObject(this);
        }
    }    
}
