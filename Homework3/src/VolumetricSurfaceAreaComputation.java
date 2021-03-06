/*
 *  Author: D Yoan L Mekontchou Yombna
 *  Date: April 18th, 2018
 * 	Class: CS570
 * 
 */


/*
 *  Purpose: Purpose of this class is to compute the volume and surface area of a
 *  sphere based on the radius given by the user
 *  
 *  Inputs: radius corresponding to the sphere under analysis
 *  Outputs: the volume and surface area of the sphere
 */


// Specify imports
import java.util.*;
import java.lang.*;

public class VolumetricSurfaceAreaComputation {
	// define instance variables
	double radius, surfaceArea;
    static double PI = Math.PI;

	/*
	 *  Define a constructor
	 */
	public VolumetricSurfaceAreaComputation(double radius) {
		this.radius = radius;
	}
	
	/*
	 * Support method:
	 * 	computes the cube of the sphere's radius
	 */
	private double cubeRadius(double radius) {
		return Math.pow(radius,3);
	}
	
	/*
	 * Support method:
	 * 	computes the squared value of the sphere's radius
	 */
	private double squareRadius(double radius) {
		return Math.pow(radius,2);
	}
	
	/*
	 *  Computes the volume of a sphere
	 */
	public double computeVolume() {
		double result = (4.0/3.0) * cubeRadius(this.radius) * Math.PI;
		return result;
	}
	
	/*
	 *  Compute the Surface Area of the sphere
	 */
	public double computeSurfaceArea() {
		double result = 4.0 * squareRadius(this.radius) * Math.PI;
		return result;
	}
	
	public static void main(String[] args) {
		double radius, volume, surfaceArea;
		// declare scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Compute the Surface Area and Volume of a Sphere");
		System.out.println("====================================================");
		System.out.println("Please enter the radius");
		radius = input.nextDouble();
		

		// compute the volume 
		VolumetricSurfaceAreaComputation computation = new VolumetricSurfaceAreaComputation(radius);
		volume = computation.computeVolume();
		
		// compute the surface area
		surfaceArea = computation.computeSurfaceArea();
		
		
		System.out.printf("The Computed volume is  %.4f And The Computed Surface Area is %.4f\n", volume, surfaceArea);
		input.close();
	}
}
