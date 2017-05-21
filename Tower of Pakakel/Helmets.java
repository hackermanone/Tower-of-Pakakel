import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helmets extends Objects
{
    protected int add;

    protected Controller control;
    protected Player player;
    /**
     * Act - do whatever the Potions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
        updatePlayer();
        if (isTouching(Player.class))
        {
            pickup();
        }
    }       

    public void pickup(){
        System.out.println("Pickup");
        if(control.helmetId < id){
            System.out.println("Equip");
            control.helmetId = id;
            player.decDef(control.helmetTemp);
            control.helmetStat = add;
            control.helmetTemp = add;
            player.addDef(add);
        }

        getWorld().removeObject(this);  
    }  

    public void updatePlayer(){
        control = (Controller) getWorld();
        player = control.getPlayer();
    }
}