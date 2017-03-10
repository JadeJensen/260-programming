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
public enum Character implements Serializable {
        Man("Stan Smith"),
        Woman("Scarlett O'hara");

    private final String description;
    private final Point coordinates;
    private final double health;

    public Character(String description) {
        this.description = description;
        coordinates =  new Point(1,1);
    }

    

    public String getDescription() {
        return description;
    }


    public int getCoordinants() {
        return coordinants;
    }


    public double getHealth() {
        return health;
    }




    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", coordinants=" + coordinants + ", health=" + health + '}';
    }

}
