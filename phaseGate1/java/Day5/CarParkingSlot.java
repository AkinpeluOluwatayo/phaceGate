//import scanner
// declare methods
// declare number of parking slots
//collect select of slot
// use for loop to check the slot choice
// use if statement to compare the slot choice to boolean
// print out and test

import java.util.Scanner;
	public class CarParkingSlot {
 	 public static void main(String[] args){

	 int[] slots = new int[5];


}
	public static int numberOfSlot(int num){

	Scanner inputCollector = new Scanner(System.in);
	 
	System.out.println("Pick car park slot number '1 - 5' ");
	int carSlot = inputCollector.nextInt();

	}


	public static boolean checkIfOccupied(int num){

	boolean unOccupied = true;

	for (int index = 0; index <= slots.length; index++){

		if (slots[index] && unOccupied){

		        System.out.println("Car slot is free");

		}else{
			System.out.println("Car slot is occupied");
		}
	

	}



	}

}