package Processing;

import ThreeDImplementations.*;
import TwoDImplementations.*;
import abstracts.Shape;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class FileProcessing {
	public static void main(String[] args) throws IOException {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		URL path = FileProcessing.class.getResource("inputfile.txt");
		File f = new File(path.getFile());
		try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
		    String line;
		    while ((line = reader.readLine()) != null) {
		    	// check if line contains certain chapes
		    	String[] words = line.split("\\s");
		    	
		    	if(line.contains("circle") || line.contains("Circle")){
		    		int x_coord = Integer.valueOf(words[1]);
		    		int y_coord = Integer.valueOf(words[2]);
		    		int radius = Integer.valueOf(words[3]);
		    		Circle shapeobj = new Circle(radius, x_coord, y_coord);
		    		shapes.add(shapeobj);
		    	}
		    	else if(line.contains("square") || line.contains("Square")){
		    		int side = Integer.valueOf(words[1]);
		    		Square shapeobj = new Square(side);
		    		shapes.add(shapeobj);
		    	}
		    	else if(line.contains("triangle") || line.contains("Triangle")) {
		    		int side_a = Integer.valueOf(words[1]);
		    		int side_b = Integer.valueOf(words[2]);
		    		int side_c = Integer.valueOf(words[3]);
		    		Triangle shapeobj = new Triangle(side_a, side_b, side_c);
		    		shapes.add(shapeobj);
		    	}
		    	else if(line.contains("sphere") || line.contains("Sphere")){
		    		int radius = Integer.valueOf(words[1]);
		    		Sphere shapeobj = new Sphere(radius);
		    		shapes.add(shapeobj);
		    	}
		    	else if(line.contains("cube") || line.contains("Cube")) {
		    		int edge = Integer.valueOf(words[1]);
		    		Cube shapeobj = new Cube(edge);
		    		shapes.add(shapeobj);
		    	}
		    	else if(line.contains("tetrahedron") || line.contains("Tetrahedron")) {
		    		int edge = Integer.valueOf(words[1]);
		    		Tetrahedron shapeobj = new Tetrahedron(edge);
		    		shapes.add(shapeobj);
		    	}
		    }
		}
		File dir1 = new File (".");
		String currentDirectory;
		currentDirectory = dir1.getCanonicalPath();
		//currentDirectory = FileProcessing.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		String filename = currentDirectory + "/output.txt";
		File file = new File(filename);
		

	    // creates the file
		if(file.createNewFile()) {
			System.out.println("Output file Created Successfully at " + filename);
		}
		else {
			System.out.println(file + " Already Exists");
		}
	    
	    
	    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	    for(Shape item: shapes) {
	    	writer.write(item.toString());
	    	writer.write("\n");
	    }
	    writer.close();
	}
}
