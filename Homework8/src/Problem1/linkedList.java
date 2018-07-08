package Problem1;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class linkedList {
	// initialize a head node
	
	
	public static void main( String[] args ) {
	      LinkedList< Integer > list = new LinkedList< Integer >();
	      int sum; double average;
	      sum = 0;
	      // Create objects to store in the List
	      for(int i =0 ; i < 25; i ++) {
	    	  Random rand = new Random();
	    	  int  n = rand.nextInt(50) + 1;
	    	  list.add(n);
	      }
	      System.out.println("Generated List is:  "  );
	      for (int i = 0; i < list.size(); i++) {
	    	    System.out.print(list.get(i) + " ");
	    	}
	      System.out.println();
	      
	      Collections.sort(list, new Comparator<Integer>() {
	    	     @Override
	    	     public int compare(Integer x,Integer y) {
	    	         return Integer.compare(x, y);
	    	     }
	    	 });

	      System.out.println("Sorted List is:  "  );
	      for (int i = 0; i < list.size(); i++) {
	    	    System.out.print(list.get(i) + " ");
	    	}
	      System.out.println();
	      // Calculate and print the average '
	      for (int i = 0; i < list.size(); i++) {
	    	  	sum += list.get(i);
	    	}
  	    System.out.println("Sum of all elements is : " + sum);
  	    average = sum/list.size();
  	    System.out.println("The average value computed is : "  + average);
  	    

	}

	
	
	
}
