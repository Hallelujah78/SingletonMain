/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.singletonmain;

/**
 * This is useful:
 * https://chatgpt.com/c/67b5fb80-302c-8006-a0ab-f0974dd978b5
 *
 * @author gavan
 */
public class SingletonMain {

    public static void main(String[] args) {

        // Get the single instance.
        Singleton single = Singleton.getInstance();

        // Call getMessage on the single object. This still calls the static method at the class level.
        single.showMessage();

        // call meaning of life on single object
        single.printMeaningOfLife();
        // Can we call getMessage on the class, since it is static?
        Singleton.showMessage();
        // Cannot call printMeaningOfLife on class, as method is not static
//        Singleton.printMeaningOfLife();
    }
}
