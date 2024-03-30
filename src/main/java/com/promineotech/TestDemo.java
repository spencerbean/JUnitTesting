package com.promineotech;

import java.util.Random;

public class TestDemo {

    // Instance method to add two positive integers
    public int addPositive(int a, int b) {
        // Check if both parameters are positive
        if (a > 0 && b > 0) {
            // Return the sum if both parameters are positive
            return a + b;
        } else {
            // Throw an IllegalArgumentException if either parameter is zero or negative
            throw new IllegalArgumentException("Both parameters must be positive!");
        }
    }
    
  
    // Method to cut a number in half
	public int cutInHalf(int number) {
		return number / 2;
	}

	// Method to generate a random integer between 1 and 10
    int getRandomInt() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    // Method to return the square of a random integer between 1 and 10
    public int randomNumberSquared() {
        int randomNumber = getRandomInt(); // Call getRandomInt to get a random integer
        return randomNumber * randomNumber; // Return the square of the random integer
    }
}
