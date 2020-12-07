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

    public LockDoor(Room new_next_room, char new_location) {
        super(new_next_room, new_location);
        this.isLocked = true;
    }
    
    
}
