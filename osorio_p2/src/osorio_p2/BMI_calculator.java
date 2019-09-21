package osorio_p2;

import java.util.Scanner;

public class BMI_calculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int weightInPounds;
		int weightInKilograms;
		int heightInInches;
		int heightInMeters;
		int resultBMI;
		int measureSystem;
		
		System.out.println("Welcome to the BMI Calculator!");
		System.out.println("");
		System.out.println("Input the number next to the measurement system you would like to use:");
		System.out.printf("1 - Standard\n2 - Metric\n");
		System.out.println("Input number below:");
		measureSystem = scnr.nextInt();
		
		if (measureSystem == 1) {
			System.out.printf("\nStandard BMI Calculator:\n");
		} else if (measureSystem == 2) {
			System.out.printf("\nMetric BMI Calculator:\n");
		} else {
			System.out.println("\nInvalid Input.\n");
		}

	}

}
