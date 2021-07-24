package Homework;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
System.out.println("Please enter the price of the item ");		
double priceOfItem = kb.nextDouble();

System.out.println("Amount tendered:  ");		
double amountTendered = kb.nextDouble();

if (amountTendered < priceOfItem) {
	System.out.println("Alert customer amount tendered less than price of the item.");
} else if (amountTendered == priceOfItem) {
System.out.println("Exact amount, no change needed");
}
kb.close();

	}

}
