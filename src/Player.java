
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
    //private final String name;
    private List<GameObject> inventory = null;
    private int healthPoints;
    private Room location;
    
    // Constructor
    public Player(/*String new_name,List<GameObject> new_inventory, */int new_healthPoints, Room new_location){
        //this.name = new_name;
        //this.inventory = new_inventory;
        this.healthPoints = new_healthPoints;
        this.location = new_location;
    }
    
    // Accessors
    /*public String getName(){
        return this.name;
    }*/
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
    
    // Methods
    public void move(char direction){
        if (direction != 'N' || direction != 'S' || direction != 'E' || direction != 'W'){
            System.out.println("The direction entered is incorrect.\nPlease enter a direction between North (N), South (S), East (E) and West (W).");
        }
        else {
            Room r = this.location;
            List<Door> ld = r.getDoors();
            boolean found = false;
            
            for (Door d : ld){
                if( d.getLocation() == direction){
                    d.Open();
                    if (!d.getIsClosed()){
                        this.location = d.getNextRoom();
                        System.out.println(this.location.getDescription());
                    }
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println("There is no door in this direction.");
        }
    }
    
    public void lookObject(String object){
        List<GameObject> lo = this.inventory;
        boolean found = false;
        for (GameObject o : lo){
            if(o.getName().equals(object)){
                found = true;
                System.out.println(o.getDescription());
            }
        }
        if (!found){
            System.out.println("This item is not present in your inventory");
        }
    }
    
    public void takeObject(String object){
        GameObject obj = this.location.getObject();
        
        if (obj.getName().equals(object)){
            this.inventory.add(obj);
        }
        else{
            System.out.println("There is no such object in the room.");
        }
    }
    
    public void use(String object){
        List<GameObject> lo = this.inventory;
        boolean found = false;
        for (GameObject o : lo){
            if(o.getName().equals(object)){
                int k = o.getKey();
                Room r = this.location;
                List<Door> ld = r.getDoors();
                ld.stream().filter(d -> (d instanceof LockDoor)).forEachOrdered(d -> {
                    ((LockDoor)d).Unlock(k);
                });
                found = true;
            }
        }
        if (!found){
            System.out.println("This item is not present in your inventory");
        }
        
    }
    
    public void talk(){
        Character c = this.location.getCharacter();
        
        if (c != null){
        System.out.println(c.getEnigma());
        }
        else {
            System.out.println("There is no one to talk to in this room.");
        }
    }
    
    public void answer(String answer){
        Character c = this.location.getCharacter();
        String correctAnswer = this.location.getCharacter().getAnswer();
        
        if (answer.equals(correctAnswer)){
            System.out.println("CORRECT ANSWER !");
        }
        else{
            this.setHP(this.getHP() - c.getDamages());
            System.out.println("INCORRECT ANSWER !");
            
            if (this.getHP() <= 0){
                System.out.println("GAME OVER !\nYou have no health points left.");
            }
            else{
                System.out.println("You lost "+c.getDamages()+" health points. You have "+this.getHP()+" heatlth points left.");
            }
        }
    }
}
