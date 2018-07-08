package ThreeDImplementations;

/*
 * Author: D Yoan L Mekontchou Yomba
 * Date: 5/14/2018
 * 
 * Purpose: inherits behaviors from the ThreeDShape class and implement 
 * 			getArea() & getVolume() functionality for the Cube class
 * 
 */
import java.lang.*;
import java.math.*;
import java.util.*;

import abstracts.ThreeDShape;

public class Cube extends ThreeDShape {
	private double edge;

	// define constructors
	public Cube() {
		this.edge = 1;
	}

	public Cube(double edge) {
		this.edge = edge;
	}

	// override inherited methods
	@Override
	public double getArea() {
		return Math.pow(this.edge, 2) * 6;
	}

	@Override
	public double getVolume() {
		return Math.pow(this.edge, 3);
	}

	@Override
	public String toString() {
		return "Cube " + "" + "Area: " + this.getArea() + " Cube " +  "Volume: " + this.getVolume();
	}
}
