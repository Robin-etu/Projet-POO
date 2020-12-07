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
        if (this.key == key){
            this.isLocked = false;
            switch (this.getLocation()) {
                case 'N' -> {
                    System.out.println("The door to the North of the room is now unlocked");
                }
                case 'S' -> {
                    System.out.println("The door to the South of the room is now unlock");
                }
                case 'E' -> {
                    System.out.println("The door to the East of the room is now unlocked");
                }
                case 'W' -> {
                    System.out.println("The door to the West of the room is now unlocked");
                }
            }
        }
        else{
            switch (this.getLocation()) {
                case 'N' -> {
                    System.out.println("This is the wrong key.\nThe door to the North of the room is still locked.");
                }
                case 'S' -> {
                    System.out.println("This is the wrong key.\nThe door to the South of the room is still locked.");
                }
                case 'E' -> {
                    System.out.println("This is the wrong key.\nThe door to the East of the room is still locked.");
                }
                case 'W' -> {
                    System.out.println("This is the wrong key.\nThe door to the West of the room is still locked.");
                }
            }
        }
    }
    @Override
    public void Open(){
        if (!this.getIsLocked())
            super.Open();
        else
            System.out.println("The door is locked, it can't be opened.");
    }
}
