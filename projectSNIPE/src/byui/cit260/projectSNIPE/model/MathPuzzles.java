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
 * @author rubengonzalezflores
 */
public class MathPuzzles implements Serializable {
    
    private int currentHealth;
    private int mathHeight;
    private int mathWidth;
    private String mathAnswer;
    private int mathX;
    private int mathY;

    public MathPuzzles() {
    }
    
    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMathHeight() {
        return mathHeight;
    }

    public void setMathHeight(int mathHeight) {
        this.mathHeight = mathHeight;
    }

    public int getMathWidth() {
        return mathWidth;
    }

    public void setMathWidth(int mathWidth) {
        this.mathWidth = mathWidth;
    }

    public String getMathAnswer() {
        return mathAnswer;
    }

    public void setMathAnswer(String mathAnswer) {
        this.mathAnswer = mathAnswer;
    }

    public int getMathX() {
        return mathX;
    }

    public void setMathX(int mathX) {
        this.mathX = mathX;
    }

    public int getMathY() {
        return mathY;
    }

    public void setMathY(int mathY) {
        this.mathY = mathY;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.currentHealth;
        hash = 59 * hash + this.mathHeight;
        hash = 59 * hash + this.mathWidth;
        hash = 59 * hash + Objects.hashCode(this.mathAnswer);
        hash = 59 * hash + this.mathX;
        hash = 59 * hash + this.mathY;
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
        final MathPuzzles other = (MathPuzzles) obj;
        if (this.currentHealth != other.currentHealth) {
            return false;
        }
        if (this.mathHeight != other.mathHeight) {
            return false;
        }
        if (this.mathWidth != other.mathWidth) {
            return false;
        }
        if (this.mathX != other.mathX) {
            return false;
        }
        if (this.mathY != other.mathY) {
            return false;
        }
        if (!Objects.equals(this.mathAnswer, other.mathAnswer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MathPuzzles{" + "currentHealth=" + currentHealth + ", mathHeight=" + mathHeight + ", mathWidth=" + mathWidth + ", mathAnswer=" + mathAnswer + ", mathX=" + mathX + ", mathY=" + mathY + '}';
    }
    
    
     }
