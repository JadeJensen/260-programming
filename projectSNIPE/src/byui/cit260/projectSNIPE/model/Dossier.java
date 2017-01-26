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
public class Dossier implements Serializable{
    private int dossierNumber;
    private int location;

    public Dossier() {
    }

    public int getDossierNumber() {
        return dossierNumber;
    }

    public void setDossierNumber(int dossierNumber) {
        this.dossierNumber = dossierNumber;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.dossierNumber;
        hash = 47 * hash + this.location;
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
        final Dossier other = (Dossier) obj;
        if (this.dossierNumber != other.dossierNumber) {
            return false;
        }
        if (this.location != other.location) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dossier{" + "dossierNumber=" + dossierNumber + ", location=" + location + '}';
    }
    
}
