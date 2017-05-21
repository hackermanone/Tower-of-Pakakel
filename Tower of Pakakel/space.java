import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spaceOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends Inventory
{
    private int arraySlot = 0;
    private int itemId;
    private int temp;
    private boolean displayingItem;

    Controller world;
    Player player;

    /**
     * Act - do whatever the spaceOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updatePlayer();
        if(displayingItem == false){
            getItem();
        }
        clickItem();
        if(Greenfoot.isKeyDown("enter")){
            this.setImage("emptySlot.png");
        }
    }    

    public void getItem(){        
        Controller control = (Controller) getWorld();
        for(int i = 0; i < 12; i++){
            if(control.slotDisplayed[i] == false && control.items[i] != 0){
                itemId = control.items[i];
                control.slotDisplayed[i] = true;
                temp = i;
                //System.out.println("Item Found for Inventory");
                getItemImage();
                displayingItem = true;
                break;
            }
        }
    }

    public void getItemImage(){
        if(itemId == 401){
            this.setImage("ATKPotInventory.png");
        }
        if(itemId == 402){
            this.setImage("DefPotInventory.png");
        }
        if(itemId == 403){
            this.setImage("MaxHPInventory.png");
        }
        if(itemId == 404){
            this.setImage("HPPotInventory.png");
        }
        if(itemId == 405){
            this.setImage("AllPotInventory.png");
        }
        if(itemId == 406){
            this.setImage("AtkDefInventory.png");
        }
        //Can add more potions using this.
        if(itemId == 0){
            this.setImage("emptySlot.png");
        }
    }

    private void clickItem(){
        Controller control = (Controller) getWorld();
        if(Greenfoot.mouseClicked(this)){
            displayingItem = false;
            useItem();

            itemId = 0;
            getItemImage();
            control.items[temp] = 0;
            control.slotDisplayed[temp] = false;
            //System.out.println("Clicked");
        }
    }

    private void useItem(){
        //AttackPotion 401
        //DefencePotion 402
        //MaxHealthPotion 403
        //HealthPotion 404
        //AllPotion 405
        //AttackDefPotion 406

        if(itemId == 401){
            player.addAtk(1);          
        }
        if(itemId == 402){
            player.addDef(1);
        }
        if(itemId == 403){
            player.addMaxHp(5);
        }
        if(itemId == 404){
            player.addHp(5);
        }
        if(itemId == 405){
            player.addHp(5);
            player.addMaxHp(5);
            player.addAtk(1);
            player.addDef(1);
        }
        if(itemId == 406){
            player.addAtk(1);
            player.addDef(1);
        }
    }

    public void updatePlayer(){
        world = (Controller) getWorld();
        player = world.getPlayer();
    }
}
