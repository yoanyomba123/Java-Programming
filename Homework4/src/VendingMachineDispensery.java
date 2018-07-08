/*
 *  Author: D Yoan L Mekontchou Yomba
 *  Date: April 28th, 2017
 * 
 * 
 *  Goal:
 *  	The point of this class is to show how much money should be dispensed
 *  	from a vending machine
 * 
 */
// imports
import java.lang.*;
import java.util.*;

public class VendingMachineDispensery {
	// define class variables;
	static int dollar, quarter, dime, nickel, cent;
	int quarterNum, dimeNum, nickelNum, centNum;
	// define constructor
	public VendingMachineDispensery() {
		// set the static variable
		setVariables();
	}
	
	// method used to set the static variables
	private void setVariables() {
		dollar = 100;
		quarter = 25;
		dime = 10;
		nickel = 5;
		cent = 1;
		this.quarterNum = this.dimeNum = this.nickelNum =0;
	}
	
	// method to compute the number of quarters to return to a user
	private int computeNumberQuarters(int itemCost) {
		while(itemCost >= quarter) {
			itemCost -= quarter;
			this.quarterNum += 1;
		}
		return itemCost;
	}
	
	// method to compute the number of dimes to return to a user
	private int computeNumberDimes(int itemCost) {
		while( itemCost >= dime) {
			itemCost -= dime;
			this.dimeNum += 1;
		}
		return itemCost;
	}
	
	// method to compute the number of nickels to return to a user
	private int computeNumberNickels(int itemCost) {
		while(itemCost >= nickel) {
			itemCost -= nickel;
			this.nickelNum += 1;
		}
		return itemCost;
	}
	
	// method to compute the number of nickels to return to a user
	private int computeNumberCents(int itemCost) {
		while(itemCost >= cent) {
			itemCost -= cent;
			this.centNum += 1;
		}
		return itemCost;
	}
	
	// method to compute and print out the change to a user
	public void computeChange(int itemCost){
		int initialPrice = itemCost;
		itemCost = dollar - itemCost;
		itemCost = computeNumberQuarters(itemCost);
		itemCost = computeNumberDimes(itemCost);
		itemCost = computeNumberNickels(itemCost);
		itemCost = computeNumberCents(itemCost);

		/*
		 * You bought an item for 45 cents and gave me a dollar, so your change is:
			2 quarters,
			0 dimes, and 
			1 nickel
		 */
		System.out.printf("You bought an item for %d and gave me a dollar so your change is: \n", initialPrice);
		System.out.printf("%d quarters \n%d dimes, \n%d nickel and , \n%d cents", this.quarterNum, this.dimeNum, this.nickelNum, this.centNum);
	}
	
	
	public static void main(String[] args) {
		int itemCost;
		// define new scanner object
		Scanner input = new Scanner(System.in);
		// define new Vending machine object
		VendingMachineDispensery vendingMachine = new VendingMachineDispensery();
		System.out.println("Enter the price of the item: ");
		itemCost = input.nextInt();
		vendingMachine.computeChange(itemCost);
	}
	
}