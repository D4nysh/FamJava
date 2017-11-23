/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author David
 */
public class field {
    public enum Plant{
        potatoes, tomatoes, cabbage, salad
    }
    
    public enum State{
        dry, seeding, growing, grown, gathering
    }
    
    private String name;
    private Plant plant;
    private State state;
    private int lenght;
    private int wide;
    protected int grownPercentage;

    public field(String name, Plant plant, State state, int lenght, int wide, int grownPercentage) {
        this.name = name;
        this.plant = plant;
        this.state = state;
        this.lenght = lenght;
        this.wide = wide;
        this.grownPercentage = grownPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public int getGrownPercentage() {
        return grownPercentage;
    }

    public void setGrownPercentage(int grownPercentage) {
        this.grownPercentage = grownPercentage;
    }
    
}
