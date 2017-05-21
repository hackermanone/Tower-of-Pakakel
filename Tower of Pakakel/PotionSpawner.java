import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Adds a random potion to the map 
 * 
 * @author Alvin Yao
 * @version 1
 */
public class PotionSpawner extends Potions
{
    private Potions potionToSpawn;

    public PotionSpawner()
    {
    }

    public void act()
    {
        spawnItem();
        getWorld().removeObject(this);
    }

    public void spawnItem()
    {
        Random r = new Random();
        
        switch(r.nextInt(4))
        {
            case 0: potionToSpawn = new AttackPotion() ;
            break;
            case 1: potionToSpawn = new DefencePotion();
            break;       
            case 2: potionToSpawn = new MaxHealthPotion();
            break;
            case 3: potionToSpawn = new HealthPotion();
            break;
        }

        getWorld().addObject((Actor)potionToSpawn, getX(), getY());
    }
}
