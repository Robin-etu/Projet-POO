
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robin
 */
public class Game {
    private final String description;
    private final Player player;
    private boolean end = false;
    
    // Constructor
    public Game(String new_description, Player new_player){
        this.description = new_description;
        this.player = new_player;
    }
    
    // Accessors
    public String getDescription(){
        return this.description;
    }
    public Player getPlayer(){
        return this.player;
    }
    public boolean isEnd(){
        return this.end;
    }
    
    // Methods
    public void help(){
        
    }
    public void quit(){
        System.out.println("You are giving up already ?");
        this.end = true;
    }
    
    public static void main(String[] args){
        // Game objects
        GameObject object_key_door_1_2_s = new GameObject("Key", "That's a key.", 911);
        GameObject object_key_door_1_4_s = new GameObject("Key", "That's a key", 921);
        GameObject object_key_door_2_4_s = new GameObject("Key", "That's a key", 931);
        GameObject object_2_3 = new GameObject("Cerberus' bag", "That's a bag full of food.",0);
        
        // Doors
        Door door_1_1_e = new Door('E');
        Door door_1_1_s = new Door('S');
        Door door_1_2_w = new Door('W');
        Door door_1_2_s = new LockDoor('S', 911);
        Door door_1_3_n = new Door('N');
        Door door_1_4_n = new Door('N');
        Door door_1_4_s = new LockDoor('S', 921);
        Door door_2_1_n = new Door('N');
        Door door_2_1_s = new Door('S');
        Door door_2_2_n = new Door('N');
        Door door_2_2_s = new Door('S');
        Door door_2_2_w = new Door('W');
        Door door_2_3_e = new Door('E');
        Door door_2_4_n = new Door('N');
        Door door_2_4_s = new LockDoor('S', 931);
        Door door_3_1_n = new Door('N');
        Door door_3_1_w = new Door('W');
        Door door_3_1_s = new Door('S');
        Door door_3_2_n = new Door('N');
        Door door_3_2_w = new Door('W');
        Door door_3_3_e = new Door('E');
        Door door_3_3_n = new Door('N');
        Door door_3_4_e = new Door('E');
        Door door_3_4_s = new Door('S');
        Door door_3_4_w = new Door('W');
        Door door_3_5_e = new Door('E');
        
        // Characters
        Character hydra_of_lerna = new Character("The Hydra of Lerna", "Hydra of Lerna's enigma.","Hydra's of Lerna's answer", 15, object_key_door_1_4_s);
        Character cerberus = new Character("Cerberus", "Cerberus' enigma.","Cerberus' answer", 30, object_key_door_2_4_s);
        Character hades = new Character("Hades", "Hades' enigma.", "Hades' answer", 50, null);
        
        // Rooms
        List<Door> doors_room_1_1 = new ArrayList<>();
        List<Door> doors_room_1_2 = new ArrayList<>();
        List<Door> doors_room_1_3 = new ArrayList<>();
        List<Door> doors_room_1_4 = new ArrayList<>();
        List<Door> doors_room_2_1 = new ArrayList<>();
        List<Door> doors_room_2_2 = new ArrayList<>();
        List<Door> doors_room_2_3 = new ArrayList<>();
        List<Door> doors_room_2_4 = new ArrayList<>();
        List<Door> doors_room_3_1 = new ArrayList<>();
        List<Door> doors_room_3_2 = new ArrayList<>();
        List<Door> doors_room_3_3 = new ArrayList<>();
        List<Door> doors_room_3_4 = new ArrayList<>();
        List<Door> doors_room_3_5 = new ArrayList<>();
        
        doors_room_1_1.add(door_1_1_e);
        doors_room_1_1.add(door_1_1_s);
        doors_room_1_2.add(door_1_2_w);
        doors_room_1_2.add(door_1_2_s);
        doors_room_1_3.add(door_1_3_n);
        doors_room_1_4.add(door_1_4_n);
        doors_room_1_4.add(door_1_4_s);
        doors_room_2_1.add(door_2_1_n);
        doors_room_2_1.add(door_2_1_s);
        doors_room_2_2.add(door_2_2_n);
        doors_room_2_2.add(door_2_2_w);
        doors_room_2_2.add(door_2_2_s);
        doors_room_2_3.add(door_2_3_e);
        doors_room_2_4.add(door_2_4_n);
        doors_room_2_4.add(door_2_4_s);
        doors_room_3_1.add(door_3_1_n);
        doors_room_3_1.add(door_3_1_w);
        doors_room_3_1.add(door_3_1_s);
        doors_room_3_2.add(door_3_2_n);
        doors_room_3_2.add(door_3_2_w);
        doors_room_3_3.add(door_3_3_e);
        doors_room_3_3.add(door_3_3_n);
        doors_room_3_4.add(door_3_4_e);
        doors_room_3_4.add(door_3_4_s);
        doors_room_3_4.add(door_3_4_w);
        doors_room_3_5.add(door_3_5_e);
        
        Room room_1_1 = new Room(1,1,null,null,"Room 1_1 description",doors_room_1_1);
        Room room_1_2 = new Room(1,2,null,null, "Room 1_2 description",doors_room_1_2);
        Room room_1_3 = new Room(1,3,object_key_door_1_2_s,null,"Room 1_3 description",doors_room_1_3);
        Room room_1_4 = new Room(1,4,null,hydra_of_lerna,"Room 1_4 description",doors_room_1_4);
        Room room_2_1 = new Room(2,1,null,null,"Room 2_1 description",doors_room_2_1);
        Room room_2_2 = new Room(2,2,null,null,"Room 2_2 description",doors_room_2_2);
        Room room_2_3 = new Room(2,3,object_2_3,null,"Room 2_3 description",doors_room_2_3);
        Room room_2_4 = new Room(2,4,null,cerberus,"Room 2_4 description",doors_room_2_4);
        Room room_3_1 = new Room(3,1,null,null,"Room 3_1 description",doors_room_3_1);
        Room room_3_2 = new Room(3,2,null,null,"Room 3_2 description",doors_room_3_2);
        Room room_3_3 = new Room(3,3,null,null,"Room 3_3 description",doors_room_3_3);
        Room room_3_4 = new Room(3,4,null,null,"Room 3_4 description",doors_room_3_4);
        Room room_3_5 = new Room(3,5,null,hades,"Room 3_5 description",doors_room_3_5);
        
        // set the next room for each door
        door_1_1_e.setNextRoom(room_1_2);
        door_1_1_s.setNextRoom(room_1_3);
        door_1_2_w.setNextRoom(room_1_1);
        door_1_2_s.setNextRoom(room_1_4);
        door_1_3_n.setNextRoom(room_1_1);
        door_1_4_n.setNextRoom(room_1_2);
        door_1_4_s.setNextRoom(room_2_1);
        door_2_1_n.setNextRoom(room_1_4);
        door_2_1_s.setNextRoom(room_2_2);
        door_2_2_n.setNextRoom(room_2_1);
        door_2_2_s.setNextRoom(room_2_4);
        door_2_2_w.setNextRoom(room_2_3);
        door_2_3_e.setNextRoom(room_2_2);
        door_2_4_n.setNextRoom(room_2_2);
        door_2_4_s.setNextRoom(room_3_1);
        door_3_1_n.setNextRoom(room_2_4);
        door_3_1_w.setNextRoom(room_3_4);
        door_3_1_s.setNextRoom(room_3_2);
        door_3_2_n.setNextRoom(room_3_1);
        door_3_2_w.setNextRoom(room_3_3);
        door_3_3_e.setNextRoom(room_3_2);
        door_3_3_n.setNextRoom(room_3_4);
        door_3_4_e.setNextRoom(room_3_1);
        door_3_4_s.setNextRoom(room_3_3);
        door_3_4_w.setNextRoom(room_3_5);
        door_3_5_e.setNextRoom(room_3_4);
        
        // Player
        Player p = new Player(100, room_1_1);
        
        // Game
        Game game = new Game("Welcome to The Crossing of the Underworld !",p);
        
        // Start
        Scanner sc = new Scanner(System.in);
        System.out.println(game.getDescription());
        
        while(!game.isEnd()){
            System.out.print("What now ? ");
            String tmp = sc.next();
            
            switch (tmp) {
                case "go" -> {
                    tmp = sc.next();
                    p.move(tmp.charAt(0));
                }
                case "help" -> {
                    game.help();
                }
                case "look" -> {
                    tmp = sc.next();
                    p.lookObject(tmp);
                }
                case "take" -> {
                    tmp = sc.next();
                    p.takeObject(tmp);
                }
                case "quit" -> {
                    game.quit();
                }
                case "use" -> {
                    tmp = sc.next();
                    p.use(tmp);
                }
                default -> {
                    System.out.println("There is no such command. Type help to see all the commands.");
                }
            }
        }
    }
}
