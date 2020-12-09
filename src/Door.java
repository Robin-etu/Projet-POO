/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robin
 */
public class Door{
    private Room next_room = null;
    private boolean isClosed;
    private final char location; // indicates where the door is in the room

    // Constructor
    public Door(char new_location){
        this.location = new_location;
        this.isClosed = true;
    }
    
    // Accessors
    public Room getNextRoom(){
        return this.next_room;
    }
    public char getLocation(){
        return this.location;
    }
    public boolean getIsClosed(){
        return this.isClosed;
    }
    
    // Modifiers
    public void Open(){
        this.isClosed = false;
        System.out.println("The door is opened now");
    }
    
    public void Close(){
        this.isClosed = true;
        System.out.println("The door is closed now");
    }
    
    public void setNextRoom(Room r){
        this.next_room = r;
    }
}
