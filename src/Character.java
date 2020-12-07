
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robin
 */
public class Character{
    private final String name, enigma;
    private final int damages;
    private final GameObject object;

    // Constructor
    public Character(String new_name, String new_enigma, int new_damages, GameObject new_object){
        this.name = new_name;
        this.enigma = new_enigma;
        this.damages = new_damages;
        this.object = new_object;
    }
    
    // Accessors
    public String getName(){
        return this.name;
    }
    public String getEnigma(){
        return this.enigma;
    }
    public int getDamages(){
        return this.damages;
    }
    public GameObject getObject(){
        return this.object;
    }
}
