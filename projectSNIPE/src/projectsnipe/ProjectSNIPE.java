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
import byui.cit260.projectSNIPE.model.Map;
import byui.cit260.projectSNIPE.model.Location;
import byui.cit260.projectSNIPE.model.Country;
import byui.cit260.projectSNIPE.model.City;
import byui.cit260.projectSNIPE.model.Scene;
import byui.cit260.projectSNIPE.model.Dossier;
import byui.cit260.projectSNIPE.model.MathPuzzles;
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
        // Math Puzzles Init
        MathPuzzles mathX = new MathPuzzles();
        mathX.setMathAnswer("Math Answer");
        System.out.println(mathX);
                // Map - Class Init
        Map theMap = new Map();
        theMap.setColumnCount(0);
        theMap.setRowCount(0);
        String theMapInfo = theMap.toString();
        System.out.println(theMap);
        // Location - Class Init
        Location locationOne = new Location();
        locationOne.setColumn(0);
        locationOne.setName("Name");
        locationOne.setRow(0);
        String locationOneInfo = locationOne.toString();
        System.out.println(locationOne);
        // Country - Class Init
        Country countryOne = new Country();
        countryOne.setName("Name");
        String countryOneInfo = countryOne.toString();
        System.out.println(countryOne);
        // City - Class Init
        City cityOne = new City();
        cityOne.setName("Name");
        cityOne.setDescription("Description");
        String cityOneInfo = cityOne.toString();
        System.out.println(cityOne);
        // Scene - Class Init
        Scene sceneOne = new Scene();
        sceneOne.setBlocked(Boolean.TRUE);
        sceneOne.setDescription("Description");
        sceneOne.setName("Name");
        String sceneOneInfo = sceneOne.toString();
        System.out.println(sceneOne);
        // Dossier - Class Init
        Dossier dosOne = new Dossier();
        dosOne.setDossierNumber(0);
        dosOne.setLocation(0);
        String dosOneInfo = dosOne.toString();
        System.out.println(dosOne);
    }

}
