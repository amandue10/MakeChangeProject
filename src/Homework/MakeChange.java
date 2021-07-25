package Homework;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double priceOfItem, amountTendered, amountShort;

		System.out.println("Please enter the price of the item ");
		priceOfItem = kb.nextDouble();

		System.out.println("Pleae enter the amount tendered");
		amountTendered = kb.nextDouble();

		if (amountTendered < priceOfItem) {
			System.out.println("Erro: Incorrect amount tendered.");
		} else if (amountTendered == priceOfItem) {
			System.out.println("Exact amount, no change needed");
		}
		kb.close();

		double change = (amountTendered - priceOfItem);

		while (change > 0.0) {
			System.out.println("Your change is: " + change);
			double quarter, dime, nickle, penny, oneDollar, fiveDollar, tenDollar, twentyDollar;
			double leftOverTwentyDollar, leftOverTenDollar, leftOverOneDollar, leftOverQuarter;
			double leftOverDime, leftOverNickle, leftOverFiveDollar, leftOverPenny;

			twentyDollar = Math.floor(change / 20);
			leftOverTwentyDollar = change % 20;

			tenDollar = Math.floor(leftOverTwentyDollar / 10);
			leftOverTenDollar = leftOverTwentyDollar % 10;

			fiveDollar = Math.floor(leftOverTenDollar / 5);
			leftOverFiveDollar = leftOverTenDollar % 5;

			oneDollar = Math.floor(leftOverFiveDollar / 1);
			leftOverOneDollar = leftOverFiveDollar % 1;

			quarter = Math.floor(leftOverOneDollar / 0.25);
			leftOverQuarter = leftOverOneDollar % 0.25;

			dime = Math.floor(leftOverQuarter / 0.10);
			leftOverDime = leftOverQuarter % 0.10;

			nickle = Math.floor(leftOverDime / 0.05);
			leftOverNickle = leftOverDime % 0.05;

			penny = Math.round(leftOverNickle / 0.01);

			System.out.println("Your change in 20$ bills: " + twentyDollar);
			System.out.println("Your change in 10$ bills: " + tenDollar);
			System.out.println("Your change in 5$ bills: " + fiveDollar);
			System.out.println("Your change in 1$ bills: " + oneDollar);
			System.out.println("Your change in quaters: " + quarter);
			System.out.println("Your change in dimes: " + dime);
			System.out.println("Your change in nickles: " + nickle);
			System.out.println("Your change in pennies: " + penny);
			break;

		}

	}
}
