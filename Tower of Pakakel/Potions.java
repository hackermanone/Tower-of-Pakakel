import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Super class for all potions, can tell what potions are picked up and adds stats to player accordingly
 * 
 * @author Alvin Yao
 * @version 1
 */
public class Potions extends Objects
{
    Controller world;
    Player player;

    protected int id;
    protected int increment;
    /**
     * Act - do whatever the Potions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
        updatePlayer();
        if (isTouching(Player.class))
        {
            drinkPotion();
            world.removeObject(this);
        }
    }       

    /**
     * Updates the status of the player
     */
    public void updatePlayer()
    {
        world = (Controller) getWorld();
        player = world.getPlayer();
    }

    /**
     * Checks the ID of the potion picked up and then runs the method accordingly based on the type of item picked up.
     */
    protected void drinkPotion()
    {   
        if(id == 401){ //attack potion
            player.addAtk(1);
        }
        if(id == 402){ //def potion
            player.addDef(1);
        }
        if(id == 403){ //max hp potion adds and heals
            player.addMaxHp(5);
            player.addHp(5);
        }
        if(id == 404){ //heal potion
            player.addHp(5);
        }
        if(id == 405){ //all potion
            player.addAtk(1);
            player.addDef(1);
            player.addMaxHp(5);
            player.addHp(5);
        }
        if(id == 406){ //atk and def potion
            player.addAtk(1);
            player.addDef(1);
        }
    }
}
