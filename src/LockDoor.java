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
    private final int key;

    // Constructor
    public LockDoor(Room new_next_room, char new_location, int new_key) {
        super(new_next_room, new_location);
        this.key = new_key;
        this.isLocked = true;
    }
    
    // Accessors
    public boolean getIsLocked(){
        return this.isLocked;
    }
    public int getKey(){
        return this.key;
    }
    
    // Modifiers
    public void Unlock(int key){
        if (this.key == key)
            this.isLocked = false;
    }
    @Override
    public void Open(){
        if (!this.getIsLocked())
            super.Open();
    }
}
