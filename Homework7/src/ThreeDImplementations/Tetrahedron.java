package ThreeDImplementations;

/*
 * Author: D Yoan L Mekontchou Yomba
 * Date: 5/14/2018
 * 
 * Purpose: inherits behaviors from the ThreeDShape class and implement 
 * 			getArea() & getVolume() functionality for the Tetrahedron class
 * 
 */
import java.lang.*;
import java.math.*;
import java.util.*;

import abstracts.ThreeDShape;

public class Tetrahedron extends ThreeDShape {
	private double edge;

	// define constructors
	public Tetrahedron() {
		this.edge = 1;
	}

	public Tetrahedron(double edge) {
		this.edge = edge;
	}

	// override inherited methods
	@Override
	public double getArea() {
		return Math.sqrt(3) * Math.pow(this.edge, 2);
	}

	@Override
	public double getVolume() {
		return Math.pow(this.edge, 3) / (6 * Math.sqrt(2));
	}

	@Override
	public String toString() {
		return "Tetrahedron " + "" + "Area " + this.getArea() + " Tetrahedron " + "Volume " + this.getVolume();
	}
}
