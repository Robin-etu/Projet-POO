
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
public class Character{
    private String name, enigma;
    private int damages;
    private GameObject object;

    public Character(String new_name, String new_enigma, int new_damages, GameObject new_object){
        this.name = new_name;
        this.enigma = new_enigma;
        this.damages = new_damages;
        this.object = new_object;
    }
    public GameObject giveObject(){
        return this.object;
    }
}
