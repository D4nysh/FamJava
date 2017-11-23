/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import java.awt.Color;

/**
 *
 * @author student
 */
public class Animal {
    
    // Atributes of Animal
    private String kind;
    private float height = (float) 1.15;
    private float weight = (float) 100;
    private int countOfArms = 0;
    private int countOfLegs = 4;
    private boolean fur;
    protected Color eyeColor = Color.BLUE;
    
    // Main cunstructor
    public Animal(String kind, boolean fur, int countOfArms, int countOfLegs){
        this.kind = kind;
        this.fur = fur;
        this.countOfArms = countOfArms;
        this.countOfLegs = countOfLegs;
    }
    
    // Getters and setters
    private String getKind() {
        return this.kind;
    }
    
    private void setHeight(String kind){
        this.kind = kind;
    }
    
    private float getHeight() {
        return this.height;
    }
    
    private void setHeight(float height){
        this.height = height;
    }
    
    private float getWeight() {
        return this.weight;
    }
    
    private void setWight(float weight){
        this.weight = weight;
    }
    
    private float getArms() {
        return this.countOfArms;
    }
    
    private void setArms(int countOfArms){
        this.countOfArms = countOfArms;
    }
    
    private float getLegs() {
        return this.countOfLegs;
    }
    
    private void set(int countOfLegs){
        this.countOfLegs = countOfLegs;
    }
    
    @Override
    public String toString() {
        String output = this.kind + "[Animal] ";
        output += this.height + ", ";
        output += this.weight + ", ";
        output += this.countOfArms + ", ";
        output += this.countOfLegs;
        
        return output;
    }
    
}
