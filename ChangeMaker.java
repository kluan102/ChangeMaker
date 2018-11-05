package Project;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		//Import scanner
		Scanner input = new Scanner(System.in);
		//Ask user to input number
		System.out.print("Enter number from 1 to 99: ");
		//Jump to getChange method
		getChange(input.nextInt());
	}
	
	public static void getChange (int inputNumber) {
		//Declare and define variables
		int numberOfCoin =0;
		int changeRemain = inputNumber;
		int[] coinValue = {25,10,05};
		String[] coinName = {"Quarter", "Dime", "Nickle"};
		//Start loop to find the changes
		for (int i=0;i<coinValue.length; i++) {
			numberOfCoin = changeRemain/coinValue[i];
			changeRemain = changeRemain - (coinValue[i]* numberOfCoin);
			System.out.println(coinName[i] + ": " + numberOfCoin);	
		}
		System.out.println("Penny: " + changeRemain);
	}

}
