
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robin
 */
public class Player {
    private final String name;
    private List<GameObject> inventory;
    private int healthPoints;
    private Room location;
    
    // Constructor
    public Player(String new_name,List<GameObject> new_inventory, int new_healthPoints, Room new_location){
        this.name = new_name;
        this.inventory = new_inventory;
        this.healthPoints = new_healthPoints;
        this.location = new_location;
    }
    
    // Accessors
    public String getName(){
        return this.name;
    }
    public List<GameObject> getInventory(){
        return this.inventory;
    }
    public int getHP(){
        return this.healthPoints;
    }
    public Room getLocation(){
        return this.location;
    }
    
    // Modifiers
    public void setHP(int hp){
        this.healthPoints = hp;
    }
    
    public void direction(){
        
    }
    
    public void lookObject(){
        
    }
    
    public void use(){
        
    }
    
    public void talk(){
        
    }
}
