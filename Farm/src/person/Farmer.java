/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

        
/**
 *
 * @author David
 */
public class Farmer extends Human{
    
    private float cash;
    private int level;

    public Farmer(String name, int age, Sex Sex) {
        super(name, age, Sex);
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
}
