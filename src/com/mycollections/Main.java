/**
 *  Java program to create, update, display, and clear Vector instance.
 */

package com.mycollections;

import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Vector<Integer> myVector = new Vector<>();

        // Add.
        myVector.add(6);
        myVector.add(1);
        myVector.add(4);
        myVector.add(2);

        // Print.
        System.out.println(myVector); // Output: [6, 1, 4, 2]

        // Update.
        myVector.add(3);
        myVector.add(5);
        myVector.add(8);

        // Print.
        System.out.println(myVector); // Output: [6, 1, 4, 2, 3, 5, 8]

        // Set.
        myVector.set(6, 7);

        // Print.
        System.out.println(myVector); // Output: [6, 1, 4, 2, 3, 5, 7]

        // Clear.
        myVector.clear();

    }
}
