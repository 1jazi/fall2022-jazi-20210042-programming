package Shuffle;

import java.util.Scanner;

public class ShufleAlgorithm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // define scanner
 
		System.out.println("enter the size of your index : ");

		int sizeOfIndex = scanner.nextInt(); // get size of index

		double[] shufleArray = new double[sizeOfIndex]; // define an array

		System.out.println("enter your elements to shufle it : ");

		for (int j = 0; j < sizeOfIndex; j++) {   // make for loop and  get elements 
			shufleArray[j] = scanner.nextDouble();

		}

		 // call the method to shuffle the given array
		for(int x = 0 ; x<3; x++) {
			shuffle(shufleArray);
		for (double e : shufleArray) {

			System.out.println("< " + e);  // for each and print all elements after shuffling 
		}
		System.out.println("**************************");
		}

	}

	public static void shuffle(double ShufleArray[]) {

		for (int j = 0; j < ShufleArray.length; j++) {
			// call the function random numbers and give Index random number
			double Index = generateRandomNumbers() * ShufleArray.length-1; 
			

		   // make a swapping for array elements 
			double Shuffle = ShufleArray[j];
			ShufleArray[j] = ShufleArray[(int) Index];
			ShufleArray[(int) Index] = Shuffle;

		}

	}

	public static double generateRandomNumbers() {

		double range = 999;  // here is the range of numbers
		double a = 3;   
		double c = 4;
	 // give the start value , time of operating system which is change with every run to get different numbers
		double z = (System.nanoTime());

		z = (((a * 0.1) * z + (c * 0.1)) % (range * 0.001));  //Linear Congruential Generator
		// System.out.println(z);

		return z;
	}

}
