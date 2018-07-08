package abstracts;
/*
 * Author: D Yoan L Mekontchou Yomba
 * Date: 5/14/2018
 * 
 * Purpose: inherits behaviors from the Shape class
 * 			and defines a new volume behavior for child classes
 * 			to inherit
 */
public class ThreeDShape extends Shape {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	// define new volume method to be inherited by child classes
	public double getVolume() {
		return 0;
	}

}
