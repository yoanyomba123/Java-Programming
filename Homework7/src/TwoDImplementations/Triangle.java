package TwoDImplementations;
/*
 * Author: D Yoan L Mekontchou Yomba
 * Date: 5/14/2018
 * 
 * Purpose: inherits behaviors from the TwoDShape class and implement 
 * 			getArea() functionality for the Triangle class
 * 
 */

import java.lang.*;
import java.math.*;
import java.util.*;

import abstracts.TwoDShape;

public class Triangle extends TwoDShape {
	private double sideA, sideB, sideC; // triangle sides
	
	// define constructors
	public Triangle() {
		this.sideA = 1;
		this.sideB = 1;
		this.sideC = 1;
	}
	
	public Triangle(double a, double b, double c) {
		this.sideA  = a;
		this.sideB = b;
		this.sideC = c;
	}
	
	// define service methods
	private double getPerimeter() {
		// perimeter of a triangle give three sides is (a + b + c) /2
		return (this.sideA + this.sideB + this.sideC)/2;
	}
	
	
	// override the getArea() method
	@Override
	public double getArea() {
		// area of a triangle is sqrt(perim*(perim-a)(perim-b)(perim-c))
		// get the perimeter
		double perim = getPerimeter();
		
		// return the area
		return Math.sqrt(perim*(perim-this.sideA)*(perim*this.sideB)*(perim*this.sideC));
	}
	
	// override the toString Method
	@Override
	public String toString() {
		return "Triangle " + "" + this.getArea();
	}
	
}
