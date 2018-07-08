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

public class Sphere extends ThreeDShape {
	private final double radius;
	private final double pi = Math.PI;

	// define constructors
	public Sphere() {
		this.radius = 1;
	}

	public Sphere(double radius) {
		this.radius = radius;
	}

	// ovveride inherited mehtods
	@Override
	public double getArea() {
		return 4 * pi * Math.pow(this.radius, 2);
	}

	@Override
	public double getVolume() {
		return (4 / 3) * pi * Math.pow(this.radius, 3);
	}

	@Override
	public String toString() {
		return "Sphere " + "" + "Area: " + this.getArea() + " Sphere " + "Volume " + this.getVolume();
	}
}
