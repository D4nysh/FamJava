/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.awt.Color;

/**
 *
 * @author David
 */
public class Plant {
    private String name;
    private String kind;
    private int GrowLenght;
    private int grown;
    private Color color;

    public Plant(String name, String kind, int GrowLenght, Color color) {
        this.name = name;
        this.kind = kind;
        this.GrowLenght = GrowLenght;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getGrowLenght() {
        return GrowLenght;
    }

    public void setGrowLenght(int GrowLenght) {
        this.GrowLenght = GrowLenght;
    }

    public int getGrown() {
        return grown;
    }

    public void setGrown(int grown) {
        this.grown = grown;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
}
