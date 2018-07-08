package Problem2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Stack;


public class StackProblem {
	Stack stack;
	
	public StackProblem() {
		this.stack = new Stack();
	}
	
	public boolean processString(String input) {
		this.stack.clear();
		System.out.println(this.stack);
		for (int i = 0; i < input.length(); i++){
		    char c = input.charAt(i);        
		    if(checkForOpenExpressions(c)) {
		    	System.out.println("Pushing " + c);
		    	this.stack.push(c);
		    }
		    else if(checkForClosingExpressions(c)) {
		    	if(!this.stack.isEmpty()) {
		    		char temp = (char) this.stack.pop();
		    		if(!(isParenthesis(temp) && isParenthesis(c))) {
		    			return false;
		    		}
		    		else if(!(isBracket(temp) && isParenthesis(c))) {
		    			return false;
		    		}
		    		else if(!(isCurlyBrace(temp) && isParenthesis(c))) {
		    			return false;
		    		}
		    		System.out.println("Removing -- " + c);
		    		System.out.println(this.stack);
		    		
		    	}
		    	else {
		    		System.out.println("Stack is Empty and character is invalid");
		    		return false;
		    	}
		    }
		}
		System.out.print("\n");
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
			return true;
		}
		else {
			System.out.println("Stack is Full");
			return false;
		}
		
	}
	public Stack getStack() {
		return this.stack;
	}
	
	
	
	public boolean isParenthesis(char item) {
		if(item == '(' || item == ')') {
			return true;
		}
		return false;
	} 
	
	public boolean isCurlyBrace(char item) {
		if(item == '{' || item == '}') {
			return true;
		}
		return false;
	} 
	
	public boolean isBracket(char item) {
		if(item == '[' || item == ']') {
			return true;
		}
		return false;
	} 
	
	public boolean checkForOpenExpressions(char item) {
		if(item == '{'  || item == '(' || item == '[' ) {
			return true;
		}
		return false;
	}
	
	public boolean checkForClosingExpressions(char item) {
		if(item == '}'  || item == ')' || item == ']' ) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		
		StackProblem process = new StackProblem();
		URL path = StackProblem.class.getResource("input.txt");
		File f = new File(path.getFile());
		File dir1 = new File (".");
		String currentDirectory;
		currentDirectory = dir1.getCanonicalPath();
		String filename = currentDirectory + "//output.txt";
		File file = new File(filename);
		

	    // creates the file
		if(file.createNewFile()) {
			System.out.println("Success Output file was successfully created at :" + file);
		}
		else {
			System.out.println("File Already Exists at : " + file );
		}
	    
	    
	    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
		    String line;
		    while ((line = reader.readLine()) != null) {
		    	// store expression as a string
		    	String words = line;
		    	boolean ind = process.processString(line);
		    	if(ind) {
		    	    writer.write(line.toString() + "   ");
		    	    writer.write("proper");
		    	    writer.write("\n");
		    	}
		    	else {
		    		writer.write(line.toString() + "   ");
		    	    writer.write("improper");
		    	    writer.write("\n");
		    	}
		    	
		    }
	}
		writer.close();
}
}
