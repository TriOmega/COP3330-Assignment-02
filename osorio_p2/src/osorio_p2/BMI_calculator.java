package osorio_p2;

import java.util.Scanner;

public class BMI_calculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int weightInPounds;
		double weightInKilograms;
		int heightInInches;
		double heightInMeters;
		double resultBMI;
		int measureSystem;
		
		System.out.println("Welcome to the BMI Calculator!");
		System.out.println("");
		System.out.println("Input the number next to the measurement system you would like to use:");
		System.out.printf("1 - Standard(lb & in)\n2 - Metric(kg & m)\n");
		System.out.println("Input number below:");
		measureSystem = scnr.nextInt();
		
		if (measureSystem == 1) {
			System.out.printf("\nStandard BMI Calculator:\n");
			System.out.println("Input Weight Below (pounds - lb):");
			weightInPounds = scnr.nextInt();
			System.out.println("Input Height Below (inches - in):");
			heightInInches = scnr.nextInt();
			
			resultBMI = (703 * ((double) weightInPounds)) / (heightInInches * heightInInches);
			
			System.out.printf("\nYour BMI Value is:\n");
			System.out.printf("%.1f\n", resultBMI);
			System.out.println("Your BMI category is:");
			if (resultBMI < 18.5) {
				System.out.println("Underweight");
			} else if ((resultBMI >= 18.5) && (resultBMI <= 24.9)) {
				System.out.println("Normal Weight");
			} else if ((resultBMI >= 25) && (resultBMI <= 29.9)) {
				System.out.println("Overweight");
			} else if (resultBMI >= 30) {
				System.out.println("Obesity");
			}
			
			System.out.println("");
			System.out.println("BMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal Weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		} else if (measureSystem == 2) {
			System.out.printf("\nMetric BMI Calculator:\n");
			System.out.println("Input Weight Below (kilograms - kg):");
			weightInKilograms = scnr.nextDouble();
			System.out.println("Input Height Below (meters - m):");
			heightInMeters = scnr.nextDouble();
			
			resultBMI = ((weightInKilograms) / (heightInMeters * heightInMeters));
			
			System.out.printf("\nYour BMI Value is:\n");
			System.out.printf("%.1f\n", resultBMI);
			System.out.println("Your BMI category is:");
			if (resultBMI < 18.5) {
				System.out.println("Underweight");
			} else if ((resultBMI >= 18.5) && (resultBMI <= 24.9)) {
				System.out.println("Normal Weight");
			} else if ((resultBMI >= 25) && (resultBMI <= 29.9)) {
				System.out.println("Overweight");
			} else if (resultBMI >= 30) {
				System.out.println("Obesity");
			}
			
			System.out.println("");
			System.out.println("BMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal Weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		} else {
			System.out.println("\nInvalid Input.\n");
		}

	}

}
