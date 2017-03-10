/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jade
 */
public class Scene implements Serializable {

    private String name;
    private String description;
    private Boolean blocked;
    private String mapSymbol;
    
    public enum SceneType{
        usaAcademy, 
        usaLibrary,
        usaArch,
        germanyWall,
        germanyCathedral,
        germanyRiver,
        englandBigBen,
        englandWestminster,
        englandPalace,
        spainTarragona,
        spainCathedral,
        spainValencia,
        franceEiffelTower,
        franceLouvre,
        franceSidewalkCafe,
        canadaStadium,
        canadaLibrary,
        canadaCNTower,
        brazilBeach,
        brazilForest,
        brazilSaoPaolo,
        australiaOperaHouse,
        australiaJail,
        australiaBridge,
        russiaSquare,
        russiaLenin,
        russiaCathedral;
    }
    public static Scene[] createScenes(){
        Scene[] scenes = new Scene[SceneType.values().length];
        Scene usaAcademy = new Scene();
        usaAcademy.setName("USA - SNIPE Academy");
        usaAcademy.setDescription("USA - SNIPE Academy");
        usaAcademy.setBlocked(false);
        usaAcademy.setMapSymbol(" US-Ac ");
        scenes[SceneType.usaAcademy.ordinal()] = usaAcademy;
        
        Scene usaLibrary = new Scene();
        usaLibrary.setName("USA - Library of Congress");
        usaLibrary.setDescription("USA -  Library");
        usaLibrary.setBlocked(false);
        usaLibrary.setMapSymbol(" US-L ");
        scenes[SceneType.usaLibrary.ordinal()] = usaLibrary;
        
        Scene usaArch = new Scene();
        usaArch.setName("USA - Gateway Arch");
        usaArch.setDescription("USA -  Gateway");
        usaArch.setBlocked(false);
        usaArch.setMapSymbol(" US-Ar ");
        scenes[SceneType.usaArch.ordinal()] = usaArch;
        
        Scene germanyWall = new Scene();
        germanyWall.setName("Germany - Berlin Wall");
        germanyWall.setDescription("germanyWall");
        germanyWall.setBlocked(false);
        germanyWall.setMapSymbol(" GM-W ");
        scenes[SceneType.germanyWall.ordinal()] = germanyWall;
        
        Scene germanyCathedral = new Scene();
        germanyCathedral.setName("Germany - Cologne Cathedral");
        germanyCathedral.setDescription("germanyCathedral");
        germanyCathedral.setBlocked(false);
        germanyCathedral.setMapSymbol(" GM-C ");
        scenes[SceneType.germanyCathedral.ordinal()] = germanyCathedral;
        
        Scene germanyRiver = new Scene();
        germanyRiver.setName("Germany - Rhine River");
        germanyRiver.setDescription("");
        germanyRiver.setBlocked(false);
        germanyRiver.setMapSymbol(" GM-R ");
        scenes[SceneType.germanyRiver.ordinal()] = germanyRiver;
        
        Scene englandBigBen = new Scene();
        englandBigBen.setName("England - Big Ben");
        englandBigBen.setDescription("");
        englandBigBen.setBlocked(false);
        englandBigBen.setMapSymbol(" EN-B ");
        scenes[SceneType.englandBigBen.ordinal()] = englandBigBen;
        
        Scene englandWestminster = new Scene();
        englandWestminster.setName("England - Westminster Abbey");
        englandWestminster.setDescription("");
        englandWestminster.setBlocked(false);
        englandWestminster.setMapSymbol(" EN-W ");
        scenes[SceneType.englandWestminster.ordinal()] = englandWestminster;
        
        Scene englandPalace = new Scene();
        englandPalace.setName("England - Buckingham Palace");
        englandPalace.setDescription("");
        englandPalace.setBlocked(false);
        englandPalace.setMapSymbol(" EN-P ");
        scenes[SceneType.englandPalace.ordinal()] = englandPalace;
        
        Scene spainTarragona = new Scene();
        spainTarragona.setName("Spain - Tarragona");
        spainTarragona.setDescription("");
        spainTarragona.setBlocked(false);
        spainTarragona.setMapSymbol(" SP-T ");
        scenes[SceneType.spainTarragona.ordinal()] = spainTarragona;
        
        Scene spainCathedral = new Scene();
        spainCathedral.setName("Spain - Cathedral of Seville");
        spainCathedral.setDescription("");
        spainCathedral.setBlocked(false);
        spainCathedral.setMapSymbol(" SP-C ");
        scenes[SceneType.spainCathedral.ordinal()] = spainCathedral;
        
        Scene spainValencia = new Scene();
        spainValencia.setName("Spain - Valencia");
        spainValencia.setDescription("");
        spainValencia.setBlocked(false);
        spainValencia.setMapSymbol(" SP-V ");
        scenes[SceneType.spainValencia.ordinal()] = spainValencia;
        
        Scene franceEiffelTower = new Scene();
        franceEiffelTower.setName("France - Eiffel Tower");
        franceEiffelTower.setDescription("");
        franceEiffelTower.setBlocked(false);
        franceEiffelTower.setMapSymbol(" FR-E ");
        scenes[SceneType.franceEiffelTower.ordinal()] = franceEiffelTower;
        
        Scene franceLouvre = new Scene();
        franceLouvre.setName("France - The Louvre");
        franceLouvre.setDescription("");
        franceLouvre.setBlocked(false);
        franceLouvre.setMapSymbol(" FR-L ");
        scenes[SceneType.franceLouvre.ordinal()] = franceLouvre;
        
        Scene franceSidewalkCafe = new Scene();
        franceSidewalkCafe.setName("France - A Sidewalk Cafe");
        franceSidewalkCafe.setDescription("");
        franceSidewalkCafe.setBlocked(false);
        franceSidewalkCafe.setMapSymbol(" FR-S ");
        scenes[SceneType.franceSidewalkCafe.ordinal()] = franceSidewalkCafe;
        
        Scene canadaStadium = new Scene();
        canadaStadium.setName("Canada - Montreal Olympic Stadium");
        canadaStadium.setDescription("");
        canadaStadium.setBlocked(false);
        canadaStadium.setMapSymbol(" CN-S ");
        scenes[SceneType.canadaStadium.ordinal()] = canadaStadium;
        
        Scene canadaLibrary = new Scene();
        canadaLibrary.setName("Canada - Library of Parliament");
        canadaLibrary.setDescription("");
        canadaLibrary.setBlocked(false);
        canadaLibrary.setMapSymbol(" CN-L ");
        scenes[SceneType.canadaLibrary.ordinal()] = canadaLibrary;
        
        Scene canadaCNTower = new Scene();
        canadaCNTower.setName("Canada - CN Tower");
        canadaCNTower.setDescription("");
        canadaCNTower.setBlocked(false);
        canadaCNTower.setMapSymbol(" CN-T ");
        scenes[SceneType.canadaCNTower.ordinal()] = canadaCNTower;
        
        Scene brazilBeach = new Scene();
        brazilBeach.setName("Brazil - Beach (Rio de Janeiro)");
        brazilBeach.setDescription("");
        brazilBeach.setBlocked(false);
        brazilBeach.setMapSymbol(" BR-B ");
        scenes[SceneType.brazilBeach.ordinal()] = brazilBeach;
        
        Scene brazilForest = new Scene();
        brazilForest.setName("Brazil - Amazon Forest");
        brazilForest.setDescription("");
        brazilForest.setBlocked(false);
        brazilForest.setMapSymbol(" BR-F ");
        scenes[SceneType.brazilForest.ordinal()] = brazilForest;
        
        Scene brazilSaoPaolo = new Scene();
        brazilSaoPaolo.setName("Brazil - Sao Paulo");
        brazilSaoPaolo.setDescription("");
        brazilSaoPaolo.setBlocked(false);
        brazilSaoPaolo.setMapSymbol(" BR-S ");
        scenes[SceneType.brazilSaoPaolo.ordinal()] = brazilSaoPaolo;
        
        Scene australiaOperaHouse = new Scene();
        australiaOperaHouse.setName("Australia - Sydney Opera House");
        australiaOperaHouse.setDescription("");
        australiaOperaHouse.setBlocked(false);
        australiaOperaHouse.setMapSymbol(" AU-O ");
        scenes[SceneType.australiaOperaHouse.ordinal()] = australiaOperaHouse;
        
        Scene australiaJail = new Scene();
        australiaJail.setName("Australia - Old Melbourne Jail");
        australiaJail.setDescription("");
        australiaJail.setBlocked(false);
        australiaJail.setMapSymbol(" AU-J ");
        scenes[SceneType.australiaJail.ordinal()] = australiaJail;
        
        Scene australiaBridge = new Scene();
        australiaBridge.setName("Australia - Bridge");
        australiaBridge.setDescription("");
        australiaBridge.setBlocked(false);
        australiaBridge.setMapSymbol(" AU-B ");
        scenes[SceneType.australiaBridge.ordinal()] = australiaBridge;
        
        Scene russiaSquare = new Scene();
        russiaSquare.setName("Russia - St. Peter's Square");
        russiaSquare.setDescription("");
        russiaSquare.setBlocked(false);
        russiaSquare.setMapSymbol(" RU-S ");
        scenes[SceneType.russiaSquare.ordinal()] = russiaSquare;
        
        Scene russiaLenin = new Scene();
        russiaLenin.setName("Russia - Lenin's Mausoleum");
        russiaLenin.setDescription("");
        russiaLenin.setBlocked(false);
        russiaLenin.setMapSymbol(" RU-L ");
        scenes[SceneType.russiaLenin.ordinal()] = russiaLenin;
        
        Scene russiaCathedral = new Scene();
        russiaCathedral.setName("Russia - St. Basil's Cathedral");
        russiaCathedral.setDescription("");
        russiaCathedral.setBlocked(false);
        russiaCathedral.setMapSymbol(" RU-C ");
        scenes[SceneType.russiaCathedral.ordinal()] = russiaCathedral;
        return scenes;
    }
    private static void assignScenesToLocations(Map map, Scene[] scenes){
        Location [] [] locations = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.usaAcademy.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.usaLibrary.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.usaArch.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.germanyWall.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.germanyCathedral.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.germanyRiver.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.englandBigBen.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.englandWestminster.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.englandPalace.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.spainTarragona.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.spainCathedral.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.spainValencia.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.franceEiffelTower.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.franceLouvre.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.franceSidewalkCafe.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.canadaStadium.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.canadaLibrary.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.canadaCNTower.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.brazilBeach.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.brazilForest.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.brazilSaoPaolo.ordinal()]);
        locations[7][0].setScene(scenes[SceneType.australiaOperaHouse.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.australiaJail.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.australiaBridge.ordinal()]);
        locations[8][0].setScene(scenes[SceneType.russiaSquare.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.russiaLenin.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.russiaCathedral.ordinal()]);
        
    }  
    public Scene() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.blocked);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", blocked=" + blocked + '}';
    }

}
