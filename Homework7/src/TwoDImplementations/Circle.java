package TwoDImplementations;
/*
 * Author: D Yoan L Mekontchou Yomba
 * Date: 5/14/2018
 * 
 * Purpose: inherits behaviors from the TwoDShape class and implement 
 * 			getArea() functionality for the Circle class
 * 
 */

import abstracts.TwoDShape;

public class Circle extends TwoDShape {	
	private final double radius;
	private final double pi = Math.PI;
	private double x_coord, y_coord;
	// define constructors
	public Circle() {
		this.radius = 1;
		this.x_coord = 1;
		this.y_coord = 1;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.x_coord = 1;
		this.y_coord = 1;
	}
	
	public Circle(double radius, double x, double y) {
		this.radius = radius;
		this.x_coord = x;
		this.y_coord = y;
	}
	
	// overriding getArea function for this specific class
	@Override
	public double getArea() {
		// Area = pi * r^2
		return pi * Math.pow(this.radius, 2);	
	}
	
	// override the toString function for this specific class
	@Override
	public String toString() {
		return "Circle " + "" +  this.getArea() ;
	}
}
