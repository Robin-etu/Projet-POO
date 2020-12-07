
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
    private final String name, enigma, answer;
    private final int damages;
    private final GameObject object;

    // Constructor
    public Character(String new_name, String new_enigma, String new_answer, int new_damages, GameObject new_object){
        this.name = new_name;
        this.enigma = new_enigma;
        this.answer = new_answer;
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
    public String getAnswer(){
        return this.answer;
    }
    public int getDamages(){
        return this.damages;
    }
    public GameObject getObject(){
        return this.object;
    }
}
