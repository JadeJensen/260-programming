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

    public enum SceneType {
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

    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        Scene usaAcademy = new Scene();
        usaAcademy.setName("USA - SNIPE Academy");
        usaAcademy.setDescription("This is the Academy for which you are training for.");
        usaAcademy.setBlocked(false);
        usaAcademy.setMapSymbol(" US-Ac ");
        scenes[SceneType.usaAcademy.ordinal()] = usaAcademy;

        Scene usaLibrary = new Scene();
        usaLibrary.setName("USA - Library of Congress");
        usaLibrary.setDescription("You can do reseach here.");
        usaLibrary.setBlocked(false);
        usaLibrary.setMapSymbol(" US-L ");
        scenes[SceneType.usaLibrary.ordinal()] = usaLibrary;

        Scene usaArch = new Scene();
        usaArch.setName("USA - Gateway Arch");
        usaArch.setDescription("You may find that things at the Arch are more deadly than they appear.");
        usaArch.setBlocked(false);
        usaArch.setMapSymbol(" US-Ar ");
        scenes[SceneType.usaArch.ordinal()] = usaArch;

        Scene germanyWall = new Scene();
        germanyWall.setName("Germany - Berlin Wall");
        germanyWall.setDescription("The Berlin Wall: Russia's greatest accomplishment in Germany.");
        germanyWall.setBlocked(false);
        germanyWall.setMapSymbol(" GM-W ");
        scenes[SceneType.germanyWall.ordinal()] = germanyWall;

        Scene germanyCathedral = new Scene();
        germanyCathedral.setName("Germany - Cologne Cathedral");
        germanyCathedral.setDescription("The Cologne Cathedral is one of the tallest in Europe.");
        germanyCathedral.setBlocked(false);
        germanyCathedral.setMapSymbol(" GM-C ");
        scenes[SceneType.germanyCathedral.ordinal()] = germanyCathedral;

        Scene germanyRiver = new Scene();
        germanyRiver.setName("Germany - Rhine River");
        germanyRiver.setDescription("The Rhine River, a river with vinyards running with wine, and sometime blood.");
        germanyRiver.setBlocked(false);
        germanyRiver.setMapSymbol(" GM-R ");
        scenes[SceneType.germanyRiver.ordinal()] = germanyRiver;

        Scene englandBigBen = new Scene();
        englandBigBen.setName("England - Big Ben");
        englandBigBen.setDescription("Big Ben used to be the tallest clock in the world.  It may be the first a murder has ever happened in too.");
        englandBigBen.setBlocked(false);
        englandBigBen.setMapSymbol(" EN-B ");
        scenes[SceneType.englandBigBen.ordinal()] = englandBigBen;

        Scene englandWestminster = new Scene();
        englandWestminster.setName("England - Westminster Abbey");
        englandWestminster.setDescription("Westminster Abbey is to the Church of England as the Vatican is to Catholics.  Both have unsolved mysteries.");
        englandWestminster.setBlocked(false);
        englandWestminster.setMapSymbol(" EN-W ");
        scenes[SceneType.englandWestminster.ordinal()] = englandWestminster;

        Scene englandPalace = new Scene();
        englandPalace.setName("England - Buckingham Palace");
        englandPalace.setDescription("The Queen's personal residence.  Tread carefully here.  Spies are everywhere.");
        englandPalace.setBlocked(false);
        englandPalace.setMapSymbol(" EN-P ");
        scenes[SceneType.englandPalace.ordinal()] = englandPalace;

        Scene spainTarragona = new Scene();
        spainTarragona.setName("Spain - Tarragona");
        spainTarragona.setDescription("Once a Roman colony, they performed sacrafices to Jupiter.  They may still do so today.");
        spainTarragona.setBlocked(false);
        spainTarragona.setMapSymbol(" SP-T ");
        scenes[SceneType.spainTarragona.ordinal()] = spainTarragona;

        Scene spainCathedral = new Scene();
        spainCathedral.setName("Spain - Cathedral of Seville");
        spainCathedral.setDescription("The largest Gothic cathedral in the world.  Be careful, or Dante's Inferno might catch up with you.");
        spainCathedral.setBlocked(false);
        spainCathedral.setMapSymbol(" SP-C ");
        scenes[SceneType.spainCathedral.ordinal()] = spainCathedral;

        Scene spainValencia = new Scene();
        spainValencia.setName("Spain - Valencia");
        spainValencia.setDescription("A popular tourist city next to the Mediterranean Sea.");
        spainValencia.setBlocked(false);
        spainValencia.setMapSymbol(" SP-V ");
        scenes[SceneType.spainValencia.ordinal()] = spainValencia;

        Scene franceEiffelTower = new Scene();
        franceEiffelTower.setName("France - Eiffel Tower");
        franceEiffelTower.setDescription("Everyone knows the Eiffel Tower.  Some people would kill to see it.");
        franceEiffelTower.setBlocked(false);
        franceEiffelTower.setMapSymbol(" FR-E ");
        scenes[SceneType.franceEiffelTower.ordinal()] = franceEiffelTower;

        Scene franceLouvre = new Scene();
        franceLouvre.setName("France - The Louvre");
        franceLouvre.setDescription("The Louvre holds many priceless arts and artifacts.  People have killed to get their hands on this stuff.");
        franceLouvre.setBlocked(false);
        franceLouvre.setMapSymbol(" FR-L ");
        scenes[SceneType.franceLouvre.ordinal()] = franceLouvre;

        Scene franceSidewalkCafe = new Scene();
        franceSidewalkCafe.setName("France - A Sidewalk Cafe");
        franceSidewalkCafe.setDescription("Be careful, the coffee may be poisoned.");
        franceSidewalkCafe.setBlocked(false);
        franceSidewalkCafe.setMapSymbol(" FR-S ");
        scenes[SceneType.franceSidewalkCafe.ordinal()] = franceSidewalkCafe;

        Scene canadaStadium = new Scene();
        canadaStadium.setName("Canada - Montreal Olympic Stadium");
        canadaStadium.setDescription("No shady deals have been made to make sure Canada gets gold metals here.");
        canadaStadium.setBlocked(false);
        canadaStadium.setMapSymbol(" CN-S ");
        scenes[SceneType.canadaStadium.ordinal()] = canadaStadium;

        Scene canadaLibrary = new Scene();
        canadaLibrary.setName("Canada - Library of Parliament");
        canadaLibrary.setDescription("Another library containing things the US Congressional Library won't hold.  Or so we think.");
        canadaLibrary.setBlocked(false);
        canadaLibrary.setMapSymbol(" CN-L ");
        scenes[SceneType.canadaLibrary.ordinal()] = canadaLibrary;

        Scene canadaCNTower = new Scene();
        canadaCNTower.setName("Canada - CN Tower");
        canadaCNTower.setDescription("One of the largest communications and observation towers.  One can watch terrorist plots from here.");
        canadaCNTower.setBlocked(false);
        canadaCNTower.setMapSymbol(" CN-T ");
        scenes[SceneType.canadaCNTower.ordinal()] = canadaCNTower;

        Scene brazilBeach = new Scene();
        brazilBeach.setName("Brazil - Beach (Rio de Janeiro)");
        brazilBeach.setDescription("Rio de Janeiro can be a fun place, but don't get caught up in the partying.");
        brazilBeach.setBlocked(false);
        brazilBeach.setMapSymbol(" BR-B ");
        scenes[SceneType.brazilBeach.ordinal()] = brazilBeach;

        Scene brazilForest = new Scene();
        brazilForest.setName("Brazil - Amazon Forest");
        brazilForest.setDescription("The Amazon Forest is a truly amazing place.  There are many ways to die here.");
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
