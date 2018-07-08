package Problem2;

import java.util.Scanner;

public class SalesPersonProblem {
	double[][] array_init;
	double[][] array_totals;
	
	public SalesPersonProblem() {
		initArray();
	}
	// Performs Array initialization
	private void initArray() {
		this.array_init = new double[5][4];
		this.array_totals = new double[6][5];
	}
	
	// set value in 2D array
	private void setArrayValue(int row, int col, double value) {
		this.array_init[row][col] = value;
		this.array_totals[row][col] = value;
	}
	
	// compute the row-wide and collumn-wide costs
	public void computeCost() {
		int index;
		double row_total = 0;
		double col_total = 0;
		for(int row = 0; row < this.array_init.length; row++) {			
			for(int col = 0; col < this.array_init[row].length; col++) {
				row_total += this.array_init[row][col];
			}
			this.array_totals[row][4] = row_total;
			row_total = 0;
		}
		
		for(int col = 0; col < this.array_init[0].length; col++) {
			for(int row = 0; row < this.array_init.length; row++) {
				col_total += this.array_init[row][col];
			}
			this.array_totals[5][col] = col_total;
			col_total = 0;
		}
	}
	
	// print out contents of array
	public void getArray(){
		
		for(int r = 0; r < 1; r++) {
			for(int col=0; col < this.array_totals[r].length; col++) {
				if(col == 0) {
					System.out.print("Product ");
					System.out.print("\t");
				}
				if(col == 4) {
					System.out.print("Total\n");
				}
				else {
					System.out.print("Salesperson " + col);
					System.out.print("\t");
				}
				
			}
		}
		for(int row = 0; row < this.array_totals.length; row++) {
			for(int col=0; col < this.array_totals[row].length; col++) {
				if(col == 0) {
					if(row+1 == 6) {
						System.out.print("Total");
						System.out.print("\t");
						System.out.print("\t");
					}else {
						System.out.print(row+1);
						System.out.print("\t");
						System.out.print("\t");
					}
				}
				
				System.out.print(this.array_totals[row][col]);
				System.out.print("\t");
				System.out.print("\t");
			}
			System.out.println("");
		}
		
		/*
		for (int[] row : this.array_totals) {
		    System.out.format("%15d%15d%15d\n", row);
		}
		*/
	}
	
	public static void main(String args[]) {
		int[][] sales_struct;
		int row, col;
		double value;
		int index = 1;
		boolean ind = true;
		
		SalesPersonProblem sales = new SalesPersonProblem();
		
		
			
		while(ind) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter sales person (-1 to end): ");
			
			col = input.nextInt();
			if(col == -1) {
				System.out.println("Terminating");

				ind = false;
				break;
			}
			else {
				if(col > 4) {
					System.out.println("Value is Invalid and must be greater than 0 and less than or equl to 4");
					ind = false;
					break;
				}
				col -= 1;
				System.out.print("Enter product number: ");
				row = input.nextInt();
				if(row > 5) {
					System.out.println("Value is Invalid and must be greater than 0 and less than or equl to 5");
					ind = false;
					break;
				}
				else if(row < 1) {
					System.out.println("Value is Invalid and must be greater than 0 and less than or equl to 5");
					ind = false;
					break;
				}
				else {
					row -= 1;
				}
				System.out.print("Enter sales amount: ");
				value = input.nextDouble();
				sales.setArrayValue(row, col, value);	
			}
		}
		sales.computeCost();
		sales.getArray();
	}
	
	
	

}
