package osorio_p1;

import java.util.Scanner;

public class decrypt_p1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] dataArr = new int[4];
		int rawData;
		int i;
		int tempValue;
		
		System.out.println("Please enter data to decrypt in the form of a 4-digit number:");
		rawData = scnr.nextInt();
		
		for(i = 0; i < dataArr.length; i++) {
			dataArr[(dataArr.length) - 1 - i] = ((int) ((rawData / Math.pow(10, i)) % 10));
		}

		tempValue = dataArr[0];
		dataArr[0] = dataArr[2];
		dataArr[2] = tempValue;
		
		tempValue = dataArr[1];
		dataArr[1] = dataArr[3];
		dataArr[3] = tempValue;
		
		for(i = 0; i < dataArr.length; i++) {
			dataArr[i] = (((dataArr[i] + 10) - 7) % 10);
		}
		
		System.out.println("");
		System.out.println("Decrypted Data:");
		for(i = 0; i < dataArr.length; i++) {
			System.out.print(dataArr[i]);
		}
	}

}
