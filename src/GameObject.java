/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robin
 */
public class GameObject{
    private final String name, description;
    private final int key;

    // Constructor
    public GameObject(String new_name, String new_description, int new_key){
        this.name = new_name;
        this.description = new_description;
        this.key = new_key;
    }
    
    // Accessors
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public int getKey(){
        return this.key;
    }
    
    
}
