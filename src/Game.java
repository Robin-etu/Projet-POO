
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
public class Game {
    private String description;
    private Player player;
    private List<Room> map;
    
    public Game(String new_description, Player new_player, List<Room> new_map){
        this.description = new_description;
        this.player = new_player;
        this.map = new_map;
    }
}
