import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


/**
 * Enables the player to save game data to a text file in the format: (xPos, yPos, entityId, enemyHp/NPC QuestState, NPC further quest state)
 * 
 * @author David Shan
 * @version 1
 */
public class Altar extends TangibleTiles
{
    private boolean alreadyHealed = false; 
    private String message = "";

    public Altar()
    {
        id = 999;
    }

    //     public void act()
    //     {
    //         Controller world = (Controller) getWorld();
    //         InvisiblePlayer invisPlayer = world.getInvisPlayer();
    //         File file = new File("save.txt");
    //         if (file.exists())
    //         {
    //             message = "There is already a save file present. Save your progress?";
    //         }
    //         else{
    //             message = "There is no save file present. Save your progress?";;
    //         }
    //         if(this.isTouching(InvisiblePlayer.class))
    //         {
    //             int choice = JOptionPane.showConfirmDialog(null, message, "Save your game?", JOptionPane.YES_NO_OPTION);
    //             if (choice == JOptionPane.YES_OPTION) {
    //               JOptionPane.showMessageDialog(null, "Saving File...");
    //               saveMap();
    //             }
    //         }        
    //     }
    
    /**
     * Saving map + user info Version 1
     */
    private void saveMapOG()
    {
        Controller world = (Controller) getWorld();
        File saveFile = new File("save.txt");
        if (saveFile.delete()) // delete the current save if there is one, and save a fresh one
        {
            System.out.println("Overwriting data...");
        }
        else{
            System.out.println("Saving data...");
        }
        try{
            //BufferedWriter bw = new BufferedWriter(new FileWriter("save.txt"));
            for (int y = 0; y < world.getHeight(); y++)
            {
                for (int x = 0; x < world.getWidth(); x++)
                {
                    List<GameObjects> objects = world.getObjectsAt(x, y, GameObjects.class);
                    for (GameObjects g : objects)
                    {
                        int id = g.getId();
                        String dataToSave = (x) + " " + (y) + " " +id;
                        if (id == 701) // if its the player
                        {
                            Player p = (Player) g; // cast it back into player
                            dataToSave += (" " + p.getMaxHp() + " " + p.getHp() + " " + p.getAtk() + " " + p.getDef() + " " + p.getBronzeKeys() + " " + p.getSilverKeys());
                        }
                        // next if its the enemy, basically same thing with player....
                        if ( (id/500 == 1) && (id/600 == 0) )
                        {
                            Enemies e = (Enemies) g;
                            dataToSave += (" " + e.getHp() );
                        }
                        writeToFile("save.txt", dataToSave);
                    }
                }
            }
        }
        catch(Exception e) //remember to remove later...
        {
            System.out.println("Exception: " + e);
        }
    }

    /**
     * Saving map and user info version 2.
     */
    private void saveMap2()
    {
        Controller world = (Controller) getWorld();
        File saveFile = new File("save3.txt");
        if (saveFile.delete()) // delete the current save if there is one, and save a fresh one
        {
            System.out.println("Overwriting data...");
        }
        else{
            System.out.println("Saving data...");
        }
        try{
            //BufferedWriter bw = new BufferedWriter(new FileWriter("save.txt"));
            saveUserAssets();
            for (int y = 0; y < world.getHeight(); y++)
            {
                for (int x = 0; x < world.getWidth(); x++)
                {
                    List<GameObjects> objects = world.getObjectsAt(x, y, GameObjects.class);
                    for (GameObjects g : objects)
                    {
                        int id = g.getId();
                        //if (id/800 == 1) && (id / 900)
                        if (id == 701) // if its the player
                        {
                            Player p = (Player) g; // cast it back into player
                            writeToFile("save3.txt", x + " " + y + " " + id + " " + p.getMaxHp() + " " + p.getHp() + " " + p.getAtk() + " " + p.getDef() + " " + p.getBronzeKeys() + " " + p.getSilverKeys());
                        }
                        // next if its the enemy, basically same thing with player....
                        if ( (id/500 == 1) && (id/600 == 0) )
                        {
                            Enemies e = (Enemies) g;
                            writeToFile("save3.txt",x + " " + y + " " +id + " " + e.getHp());
                        }
                        // KEYS, DOORS, POTIONS
                        if ( (id == 1001) || (id == 1002) || ( (id/400 == 1) && (id/500 == 0) ) || ( (id/800 == 1) && (id/900 == 0)  ) || ( (id/1000 == 1) && (id/1100 == 0) ) )
                        {
                            writeToFile("save3.txt", id + " " + x + " " + y);
                        }
                        
                    }
                }
            }
        }
        catch(Exception e) //remember to remove later...
        {
            System.out.println("Exception: " + e);
        }
    }

    /**
     * Saves user info (stats, inventory, equipment) and the current state of the map to a text file.
     */
    public void saveMap()
    {
        Controller world = (Controller) getWorld();
        File saveFile = new File("save.txt");
        if (saveFile.delete()) // delete the current save if there is one, and save a fresh one
        {
            System.out.println("Overwriting data...");
        }
        else{
            System.out.println("Saving data...");
        }
        try{
            saveUserAssets(); // The first four lines of the text file are dedicated to storing user info (stats, inventory, equipment)
            // After the four lines, run through the world grid using a nested loop
            // Save the position of items/enemies/NPCs/ButtonTiles, and the states of NPCs and enemies (enemy HP, NPC quest completion status)
            for (int y = 0; y < world.getHeight(); y++)
            {
                for (int x = 0; x < world.getWidth(); x++)
                {
                    List<GameObjects> objects = world.getObjectsAt(x, y, GameObjects.class); // Get all GameObjects at (x, y)
                    for (GameObjects g : objects) // Run through the list of GameObjects at (x, y)
                    {
                        int id = g.getId();
                        String dataToSave = (x) + " " + (y) + " " +id; // Save the xPos, yPos, and ID of the current GameObject
                        if (id != 0) //make sure it HAS an id, indicating that it should be saved
                        {
                            if ( (id/500 == 1) && (id/600 == 0) ) // IF ITS AN ENEMY
                            {
                                Enemies e = (Enemies) g;
                                dataToSave += (" " + e.getHp() ); // Save the enemy's HP at the time of saving
                            }
                            if ( (id/700 == 1) && (id/800 == 0) && (id != 701) ) // IF ITS AN NPC, AND NOT A PLAYER
                            {
                                NPC n = (NPC) g;
                                dataToSave += (" " + (n.questComplete()? 1 : 0) + " " + (n.rewardsGiven()? 1 : 0) ); // SAVE QUEST COMPLETION STATE
                            }
                            if (id == 605) // IF IT'S A BUTTON TILE
                            {
                                ButtonTiles b = (ButtonTiles) g;
                                dataToSave += (" " + b.getXTarget() + " " + b.getYTarget() ); // SAVE ITS TARGET WALL COORDINATES
                            }
                            writeToFile("save.txt", dataToSave); // Save the format (x, y, id, hp/state, furtherstate) in one line
                        }
                    }
                }
            }
        }
        catch(Exception e) //remember to remove later...
        {
            System.out.println("Exception: " + e);
        }
    }

    /**
     * Writes a String as one line to a target .txt file
     * 
     * @param   file    Name of the file to be written to (+.txt)
     * @param   line    The string to be written to the text file
     */
    private static void writeToFile(String file, String line) throws IOException{
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.printf("%s" + "%n",line);

        pw.close();
    }

    /**
     * (For the first 4 lines of the savefile!) Save the player's stats, the level the player saved on, their inventory, and their equipment (armour,weapons)
     */
    private void saveUserAssets()
    {
        Controller world = (Controller) getWorld();
        Player p = world.getPlayer();
        
        //1. SAVES THE PLAYER'S STATS
        //2. SAVES THE CURRENT LEVEL
        //3. SAVES THE PLAYER'S INVENTORY
        //4. SAVES THE PLAYER'S EQUIPMENT(WEAPONS,ARMOUR)
        try{ 
            writeToFile("save.txt", p.getMaxHp() + " " + p.getHp() + " " + p.getAtk() + " " + p.getDef() + " " + p.getBronzeKeys() + " " + p.getSilverKeys()); 
            writeToFile("save.txt", ""+world.getLevel());
            writeToFile("save.txt", world.items[0]+" "+world.items[1]+" "+world.items[2]+" "+world.items[3]+" "+world.items[4]+" "+world.items[5]+" "+world.items[6]+" "+ world.items[7]+" "+world.items[8]+" "+world.items[9]+" "+world.items[10]+" "+world.items[11]);
            writeToFile("save.txt", world.helmetId+" "+world.helmetStat+" "+world.chestId+" "+world.chestStat+" "+world.bootsId+" "+world.bootsStat+" "+world.weaponId+" "+world.weaponStat);
        }
        catch(IOException e)
        {
            System.out.println("Exception: " + e);
        }
        //         for (int i = 0; i < world.items.length; i++)
        //         {
        //             writeToFile("save3.txt", world.items[i]);
        //             // displaying thing turns true as well, display[i] = true
        //         }

    }
}