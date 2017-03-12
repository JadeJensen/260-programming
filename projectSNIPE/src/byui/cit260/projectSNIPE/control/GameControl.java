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
import byui.cit260.projectSNIPE.model.Scene;
import projectsnipe.ProjectSNIPE;

/**
 *
 * @author rubengonzalezflores
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        ProjectSNIPE.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        ProjectSNIPE.setCurrentGame(game);

        game.setPlayer(player);

        Item[] item = GameControl.createInventoryList();
        game.setItem(item);

        Map map = MapControl.createMap();
        game.setMap(map);

        MapControl.movePlayerToStartingLocation(map);
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("assignScenesToLocations called");
    }

    public enum eItem {
        key,
        gun,
        backpack,
        phone,
        silencer,
        money,
        outfit,
        pillow;
    }

    public static Item[] createInventoryList() {
        Item[] item = new Item[8];

        Item key = new Item();
        key.setInventoryType("Key");
        key.setStock(0);
        key.setAmount(0);
        item[eItem.key.ordinal()] = key;

        Item gun = new Item();
        gun.setInventoryType("Gun");
        gun.setStock(0);
        gun.setAmount(0);
        item[eItem.gun.ordinal()] = gun;

        Item backpack = new Item();
        backpack.setInventoryType("Backpack");
        backpack.setStock(0);
        backpack.setAmount(0);
        item[eItem.backpack.ordinal()] = backpack;

        Item phone = new Item();
        phone.setInventoryType("Phone");
        phone.setStock(0);
        phone.setAmount(0);
        item[eItem.phone.ordinal()] = phone;

        Item silencer = new Item();
        silencer.setInventoryType("Silencer");
        silencer.setStock(0);
        silencer.setAmount(0);
        item[eItem.silencer.ordinal()] = silencer;

        Item money = new Item();
        money.setInventoryType("Money");
        money.setStock(0);
        money.setAmount(0);
        item[eItem.money.ordinal()] = money;

        Item outfit = new Item();
        outfit.setInventoryType("Outfit");
        outfit.setStock(0);
        outfit.setAmount(0);
        item[eItem.outfit.ordinal()] = outfit;

        Item pillow = new Item();
        pillow.setInventoryType("Pillow");
        pillow.setStock(0);
        pillow.setAmount(0);
        item[eItem.pillow.ordinal()] = pillow;

        return item;
    }
}
