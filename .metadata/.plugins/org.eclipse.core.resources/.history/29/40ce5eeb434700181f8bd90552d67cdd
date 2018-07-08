/*
 *  Author: D Yoan L Mekontchou Yombna
 *  Date: April 18th, 2018
 * 	Class: CS570
 * 
 */


/*
 *  Purpose: Purpose of this class is to compute the euclidean distance
 *  between two points
 *  
 *  Inputs: x1, x2, y1, y2 corresponding to the points under analysis
 *  Outputs: Euclidean Distance between the two points
 */


// Specify imports
import java.util.*;
import java.lang.*;

public class EuclideanDistance {
	// Specify and declare instance variables
	int x1, x2, y1, y2;
	
	
	// specify constructor
	public EuclideanDistance(int x1, int x2, int y1, int y2) {
		// declare variables
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	/*
	 *  Computes the difference between to coordinate ie... x1 -x2 or y1 -y2
	 *  and returns the absolute value
	 */
	private int computeDifference(int coord1, int coord2) {
		int result = Math.abs(coord1 - coord2);
		return result;
	}
	
	/*
	 *  Computes the power two of some input value of type int
	 *  and returns the squared value
	 */
	private int computeSquaredValue(int value) {
		return (int) Math.pow(value, 2); 
	 }
	
	/*
	 *  Computes the euclidean distance between some point coordinate
	 */
	public int computeEuclideanDistance() {
		// calculate the various point differences in x and y direction
		int xdifference = computeDifference(this.x1, this.x2);
		int ydifference = computeDifference(this.y1, this.y2);
		
		int xsquared = computeSquaredValue(xdifference);
		int ysquared = computeSquaredValue(ydifference);
		
		// return the square root of the squared components as the distance
		int result = (int) Math.sqrt(xsquared + ysquared); 
		return result;
	}
	
	public static void main(String[] args) {
		int inputx1, inputx2, inputy1, inputy2, result;
		// declare scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Compute the Euclidean Distance Between Two Points");
		System.out.println("====================================================");
		System.out.println("Please enter the first coordinate's X component");
		inputx1 = input.nextInt();
		System.out.println("Please enter the first coordinate's Y component");
		inputy1 = input.nextInt();
		System.out.println("Please enter the second coordinate's X component");
		inputx2 = input.nextInt();
		System.out.println("Please enter the second coordinate's Y component");
		inputy2 = input.nextInt();

		// compute Euclidean distance
		EuclideanDistance euclidDistance = new EuclideanDistance(inputx1, inputx2, inputy1, inputy2);
		result = euclidDistance.computeEuclideanDistance();
		
		System.out.print("\n\n\nThe Computed Euclidean Distance between the two points is ");
		System.out.print(result);
		System.out.println("");
		input.close();
	}
}
