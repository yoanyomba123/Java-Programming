package SortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort extends AbstractClass {
   private int[] data;
   private static final Random generator = new Random();
   private long comparisons, swaps; 

   public InsertionSort( int size ) {
      data = new int[ size ];

      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   }

   // call this method from main program
   public void sort(){
      int insert;

      // comparison for failure case as well as success case - Initial comparison
      this.comparisons += 1;
      for ( int next = 1; next < data.length; next++ ) {
         insert = data[ next ]; 
         int moveItem = next; 

         // comparison for while loop failure as well as success case
         this.comparisons += 1;
         while ( moveItem > 0 && data[ moveItem - 1 ] > insert ) {   
            this.swaps += 1;
            data[ moveItem ] = data[ moveItem - 1 ];
         // comparison performed after each iteration to decipher whether to re-run the contents of while loop
            this.comparisons += 1;
            moveItem--;
            
         }
         
         // swap to be performed
         this.swaps += 1;
         data[ moveItem ] = insert;
         
         // comparison performed again to for all conditions that aren't the inital condition
         this.comparisons +=  1;
      } 
   }

   // returns the number of swaps
	@Override
	public long getSwaps() {
		// TODO Auto-generated method stub
		return this.swaps;
	}
	
	// returns the number of comparisons
	@Override
	public long getComparisons() {
		// TODO Auto-generated method stub
		return this.comparisons;
	}
}


