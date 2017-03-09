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
