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
    private Room next_room;
    private boolean isClosed;
    private char location; // indicates where the door is in the room

    public Door(Room new_next_room, char new_location){
        this.next_room = new_next_room;
        this.location = new_location;
        this.isClosed = true;
    }
    
    public void Open(){
        this.isClosed = false;
    }
    
    public void Close(){
        this.isClosed = true;
    }
}
