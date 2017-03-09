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
    private static Scene[] createScenes(){
        Scene[] scenes = new Scene[SceneType.values().length];
        Scene usaAcademy = new Scene();
        usaAcademy.setDescription("USA - SNIPE Academy");
        usaAcademy.setBlocked(false);
        usaAcademy.setMapSymbol(" US-Ac ");
        scenes[SceneType.usaAcademy.ordinal()] = usaAcademy;
        
        Scene usaLibrary = new Scene();
        usaLibrary.setDescription("USA -  Library");
        usaLibrary.setBlocked(false);
        usaLibrary.setMapSymbol(" US-L ");
        scenes[SceneType.usaLibrary.ordinal()] = usaLibrary;
        
        Scene usaArch = new Scene();
        usaArch.setDescription("USA -  usaArch");
        usaArch.setBlocked(false);
        usaArch.setMapSymbol(" USA - L ");
        scenes[SceneType.usaArch.ordinal()] = usaArch;
        
        Scene germanyWall = new Scene();
        germanyWall.setDescription("germanyWall");
        germanyWall.setBlocked(false);
        germanyWall.setMapSymbol(" USA - L ");
        scenes[SceneType.germanyWall.ordinal()] = germanyWall;
        
        Scene germanyCathedral = new Scene();
        germanyCathedral.setDescription("germanyCathedral");
        germanyCathedral.setBlocked(false);
        germanyCathedral.setMapSymbol(" USA - L ");
        scenes[SceneType.germanyCathedral.ordinal()] = germanyCathedral;
        
        Scene germanyRiver = new Scene();
        germanyRiver.setDescription("USA -  Library");
        germanyRiver.setBlocked(false);
        germanyRiver.setMapSymbol(" USA - L ");
        scenes[SceneType.germanyRiver.ordinal()] = germanyRiver;
        
        Scene englandBigBen = new Scene();
        englandBigBen.setDescription("USA -  Library");
        englandBigBen.setBlocked(false);
        englandBigBen.setMapSymbol(" USA - L ");
        scenes[SceneType.englandBigBen.ordinal()] = englandBigBen;
        
        Scene englandWestminster = new Scene();
        englandWestminster.setDescription("USA -  Library");
        englandWestminster.setBlocked(false);
        englandWestminster.setMapSymbol(" USA - L ");
        scenes[SceneType.englandWestminster.ordinal()] = englandWestminster;
        
        Scene englandPalace = new Scene();
        englandPalace.setDescription("USA -  Library");
        englandPalace.setBlocked(false);
        englandPalace.setMapSymbol(" USA - L ");
        scenes[SceneType.englandPalace.ordinal()] = englandPalace;
        
        Scene spainTarragona = new Scene();
        spainTarragona.setDescription("USA -  Library");
        spainTarragona.setBlocked(false);
        spainTarragona.setMapSymbol(" USA - L ");
        scenes[SceneType.spainTarragona.ordinal()] = spainTarragona;
        
        Scene spainCathedral = new Scene();
        spainCathedral.setDescription("USA -  Library");
        spainCathedral.setBlocked(false);
        spainCathedral.setMapSymbol(" USA - L ");
        scenes[SceneType.spainCathedral.ordinal()] = spainCathedral;
        
        Scene spainValencia = new Scene();
        spainValencia.setDescription("USA -  Library");
        spainValencia.setBlocked(false);
        spainValencia.setMapSymbol(" USA - L ");
        scenes[SceneType.spainValencia.ordinal()] = spainValencia;
        
        Scene franceEiffelTower = new Scene();
        franceEiffelTower.setDescription("USA -  Library");
        franceEiffelTower.setBlocked(false);
        franceEiffelTower.setMapSymbol(" USA - L ");
        scenes[SceneType.franceEiffelTower.ordinal()] = franceEiffelTower;
        
        Scene franceLouvre = new Scene();
        franceLouvre.setDescription("USA -  Library");
        franceLouvre.setBlocked(false);
        franceLouvre.setMapSymbol(" USA - L ");
        scenes[SceneType.franceLouvre.ordinal()] = franceLouvre;
        
        Scene franceSidewalkCafe = new Scene();
        franceSidewalkCafe.setDescription("USA -  Library");
        franceSidewalkCafe.setBlocked(false);
        franceSidewalkCafe.setMapSymbol(" USA - L ");
        scenes[SceneType.franceSidewalkCafe.ordinal()] = franceSidewalkCafe;
        
        Scene canadaStadium = new Scene();
        canadaStadium.setDescription("USA -  Library");
        canadaStadium.setBlocked(false);
        canadaStadium.setMapSymbol(" USA - L ");
        scenes[SceneType.canadaStadium.ordinal()] = canadaStadium;
        
        Scene canadaLibrary = new Scene();
        canadaLibrary.setDescription("USA -  Library");
        canadaLibrary.setBlocked(false);
        canadaLibrary.setMapSymbol(" USA - L ");
        scenes[SceneType.canadaLibrary.ordinal()] = canadaLibrary;
        
        Scene canadaCNTower = new Scene();
        canadaCNTower.setDescription("USA -  Library");
        canadaCNTower.setBlocked(false);
        canadaCNTower.setMapSymbol(" USA - L ");
        scenes[SceneType.canadaCNTower.ordinal()] = canadaCNTower;
        
        Scene brazilBeach = new Scene();
        brazilBeach.setDescription("USA -  Library");
        brazilBeach.setBlocked(false);
        brazilBeach.setMapSymbol(" USA - L ");
        scenes[SceneType.brazilBeach.ordinal()] = brazilBeach;
        
        Scene brazilForest = new Scene();
        brazilForest.setDescription("USA -  Library");
        brazilForest.setBlocked(false);
        brazilForest.setMapSymbol(" USA - L ");
        scenes[SceneType.brazilForest.ordinal()] = brazilForest;
        
        Scene brazilSaoPaolo = new Scene();
        brazilSaoPaolo.setDescription("USA -  Library");
        brazilSaoPaolo.setBlocked(false);
        brazilSaoPaolo.setMapSymbol(" USA - L ");
        scenes[SceneType.brazilSaoPaolo.ordinal()] = brazilSaoPaolo;
        
        Scene australiaOperaHouse = new Scene();
        australiaOperaHouse.setDescription("USA -  Library");
        australiaOperaHouse.setBlocked(false);
        australiaOperaHouse.setMapSymbol(" USA - L ");
        scenes[SceneType.australiaOperaHouse.ordinal()] = australiaOperaHouse;
        
        Scene australiaJail = new Scene();
        australiaJail.setDescription("USA -  Library");
        australiaJail.setBlocked(false);
        australiaJail.setMapSymbol(" USA - L ");
        scenes[SceneType.australiaJail.ordinal()] = australiaJail;
        
        Scene australiaBridge = new Scene();
        australiaBridge.setDescription("USA -  Library");
        australiaBridge.setBlocked(false);
        australiaBridge.setMapSymbol(" USA - L ");
        scenes[SceneType.australiaBridge.ordinal()] = australiaBridge;
        
        Scene russiaSquare = new Scene();
        russiaSquare.setDescription("USA -  Library");
        russiaSquare.setBlocked(false);
        russiaSquare.setMapSymbol(" USA - L ");
        scenes[SceneType.russiaSquare.ordinal()] = russiaSquare;
        
        Scene russiaLenin = new Scene();
        russiaLenin.setDescription("USA -  Library");
        russiaLenin.setBlocked(false);
        russiaLenin.setMapSymbol(" USA - L ");
        scenes[SceneType.russiaLenin.ordinal()] = russiaLenin;
        
        Scene russiaCathedral = new Scene();
        russiaCathedral.setDescription("USA -  Library");
        russiaCathedral.setBlocked(false);
        russiaCathedral.setMapSymbol(" USA - L ");
        scenes[SceneType.russiaCathedral.ordinal()] = russiaCathedral;
        return scenes;
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
