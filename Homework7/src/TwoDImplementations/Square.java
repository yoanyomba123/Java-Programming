package TwoDImplementations;
/*
 * Author: D Yoan L Mekontchou Yomba
 * Date: 5/14/2018
 * 
 * Purpose: inherits behaviors from the TwoDShape class and implement 
 * 			getArea() functionality for the Square class
 * 
 */

import java.lang.*;
import java.math.*;
import java.util.*;

import abstracts.TwoDShape;


public class Square extends TwoDShape {
	private double side;
	
	// define constructor
	public Square() {
		this.side = 1;
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	// override the getArea Method
	@Override
	public double getArea() {
		// Area = side ^
		return Math.pow(side, 2);
	}
	
	// override the toString method
	@Override
	public String toString() {
		return "Square " + "" + this.getArea();
	}
}
