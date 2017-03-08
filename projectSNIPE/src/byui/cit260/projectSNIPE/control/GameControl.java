/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

import byui.cit260.projectSNIPE.model.Game;
import byui.cit260.projectSNIPE.model.Item;
import byui.cit260.projectSNIPE.model.Map;
import byui.cit260.projectSNIPE.model.Player;
import projectsnipe.ProjectSNIPE;

/**
 *
 * @author rubengonzalezflores
 */
public class GameControl {
    public static Player createPlayer(String name){
        if (name == null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        ProjectSNIPE.setPlayer(player);
        return player;
    }
    public static void createNewGame(Player player){
        Game game = new Game(); 
        ProjectSNIPE.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Item[] item = GameControl.createInventoryList();
        game.setItem(item);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.movePlayerToStartingLocation(map);
    }
    public static Item[] createInventoryList(){
        System.out.println("called createInventoryList in GameControl");
        return null;
    }
}
