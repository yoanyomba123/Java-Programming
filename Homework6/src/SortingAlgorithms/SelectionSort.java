package SortingAlgorithms;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort extends AbstractClass {
   private long comparisons, swaps; 
   private int[] data;
   private static final Random generator = new Random();

   public SelectionSort( int size ) {
      data = new int[ size ];
      this.comparisons = 0;
      this.swaps = 0;
      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   }


   // call this method from main program
   public void sort() {
      int smallest;

      this.comparisons += 1;
      for ( int i = 0; i < data.length - 1; i++ ) {
         smallest = i;
         this.comparisons += 1;
         for ( int index = i + 1; index < data.length; index++ ) { 
        	this.comparisons += 1;
            if ( data[ index ] < data[ smallest ] ) {
            	smallest = index;
            }
            this.comparisons += 1;
      }
         swap( i, smallest ); 
         this.comparisons += 1;
      }
   }

   public void swap( int first, int second ) {
      int temporary = data[ first ]; 
      data[ first ] = data[ second ]; 
      data[ second ] = temporary; 
      this.swaps += 1;
   }
   
   @Override
   public long getSwaps() {
	   return this.swaps;
   }
   
   @Override
   public long getComparisons() {
	   return this.comparisons;
   }
}

