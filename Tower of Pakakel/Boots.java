import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boots extends Objects
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
        if(control.bootsId < id){
            System.out.println("Equip");
            control.bootsId = id;
            player.decDef(control.bootsTemp);
            control.bootsStat = add;
            control.bootsTemp = add;
            player.addDef(add);
        }

        getWorld().removeObject(this);  
    }  
    
        public void updatePlayer(){
        control = (Controller) getWorld();
        player = control.getPlayer();
    }
}