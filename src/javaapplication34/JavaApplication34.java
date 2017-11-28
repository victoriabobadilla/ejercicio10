/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);	// Create new Scanner object.

		// Prompt the user to enter the amount of water in kilograms.
		System.out.print("Enter the amount of water in kilograms: ");
		double kilograms = input.nextDouble();
		// Prompt the user to enter the initial temperature.
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		// Prompt the user to enter the final temperature.
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		// Calculate the energy
		double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

		// Display result
		System.out.println("The energy needed is " + energy);
    }
    
}
