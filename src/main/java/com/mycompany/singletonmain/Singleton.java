/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singletonmain;

/**
 *
 * @author gavan
 */
public class Singleton {

    // Eager initialization of instance.
    private static final Singleton INSTANCE = new Singleton();

    // Add a private field. Belongs to instance, not the class.
    private int meaningOfLife;

    private Singleton() {
        // Initialize the instance variable.
        this.meaningOfLife = 42;
    }

    // Get Singleton instance
    public static Singleton getInstance() {
        // Can lazy initialize instance here by checking if it is null and creating
        // if it is null.
        return INSTANCE;
    }

    // Show a message. Doesn't rely on or update an instance variable, and so
    // it can be static.
    public static void showMessage() {
        System.out.println("The showMessage static method of Singleton.");
    }

    // Print the meaning of life. Relies on an instance variable and so is correctly
    // not static.
    public void printMeaningOfLife() {
        System.out.println("Meaning of life: " + meaningOfLife);
    }
}
