/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robin
 */
public class LockDoor extends Door{
    private boolean isLocked;
    private int key;

    public LockDoor(Room new_next_room, char new_location, int new_key) {
        super(new_next_room, new_location);
        this.key = new_key;
        this.isLocked = true;
    }
    
    
}
