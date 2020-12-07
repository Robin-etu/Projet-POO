
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
public class Room{
    private final int num_floor, num_room;
    private final GameObject object;
    private final Character character;
    private final String description;
    private final List<Door> doors;

    // Constructor
    public Room(int new_num_floor, int new_num_room, GameObject new_object, Character new_character, String new_description, List<Door> new_doors){
        this.num_floor = new_num_floor;
        this.num_room = new_num_room;
        this.object = new_object;
        this.character = new_character;
        this.description = new_description;
        this.doors = new_doors;
    }
    
    // Accessors
    public int getNumFloor(){
        return this.num_floor;
    }
    public int getNumRoom(){
        return this.num_room;
    }
    public GameObject getObject(){
        return this.object;
    }
    public Character getCharacter(){
        return this.character;
    }
    public String getDescription(){
        return this.description;
    }
    public List<Door> getDoors(){
        return this.doors;
    }
}
