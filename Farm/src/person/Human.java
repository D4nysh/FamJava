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
public class Human {
    public enum Sex{
        Male, Female
    }
    private String name;
    private int age;
    private Sex Sex;

    public Human(String name, int age, Sex Sex) {
        this.name = name;
        this.age = age;
        this.Sex = Sex;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return Sex;
    }

    public void setSex(Sex Sex) {
        this.Sex = Sex;
    }
    
    
}
