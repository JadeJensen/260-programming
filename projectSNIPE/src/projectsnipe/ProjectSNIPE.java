/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsnipe;

import byui.cit260.projectSNIPE.model.Item;
import byui.cit260.projectSNIPE.model.Player;
import byui.cit260.projectSNIPE.model.Game;
import byui.cit260.projectSNIPE.model.Character;
/**
 *
 * @author Jade
 */
public class ProjectSNIPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Player - Class Initialization
        Player playerOne = new Player();
        playerOne.setName("Fred Flintsone");
        playerOne.setBestTime(7.00);
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        // Item - Class Init
        Item itemMoney = new Item();
        itemMoney.setInventoryType("Money");
        itemMoney.setStock(1000000);
        itemMoney.setAmount(100.00);
        String itemMoneyInfo = itemMoney.toString();
        System.out.println(itemMoney);
        // Game - Class Init
        Game gameOne = new Game();
        gameOne.setNoPeople(0);
        gameOne.setTotalTime(0);
        String gameOneInfo = gameOne.toString();
        System.out.println(gameOne);
        // Character - Class Init
        Character characterOne = new Character();
        characterOne.setCoordinants(0);
        characterOne.setDescription("Description");
        characterOne.setHealth(0);
        characterOne.setName("Unnamed");
        String characterOneInfo = characterOne.toString();
        System.out.println(characterOne);
    }
    
}
