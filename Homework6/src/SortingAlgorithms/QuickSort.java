package SortingAlgorithms;


import java.util.Random;

public class QuickSort extends AbstractClass {
   private int[] data; 
   private static Random generator = new Random();
   private long swaps;
   private long comparisons;

   public QuickSort( int size ) {
      data = new int[ size ]; // create space for array

      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   }

   // call this method from the main program
   public void sort() {
      quickSortHelper( 0, data.length - 1 );      
   }

   private void quickSortHelper( int left, int right ) {
      int pivot = partition( left, right );

      // comparison made
      this.comparisons += 1;
      if ( left < pivot - 1 ) { 
         quickSortHelper( left, pivot - 1 );
         
      }
      
      // comparison made
      this.comparisons += 1;
      if ( pivot + 1 < right ) {
         quickSortHelper( pivot + 1, right ); 
      }
   }

   private int partition( int left, int right ) {
      int pivot = left;

      // comparison made
      //this.comparisons += 1;
      while ( true ) {
    	//this.comparisons += 1;
         while ( data[ right ] >= data[ pivot ] ) {
        	this.comparisons += 1;
            if ( right == pivot ) {
               return pivot;
            }
            --right;
            //this.comparisons += 1;
         }

         swap( pivot, right );

         pivot = right--;

         //this.comparisons += 1;
         while ( data[ left ] <= data[ pivot ] ) {
         	this.comparisons += 1;
            if ( left == pivot ) {
                return pivot;
            }
            ++left;
            //this.comparisons += 1;
         }

         swap( pivot, left );
         pivot = left++;
         //this.comparisons += 1;
      }
   }

   private void swap( int first, int second ) {
      int temporary = data[ first ];
      data[ first ] = data[ second ];
      data[ second ] = temporary;
      this.swaps += 1;
   }

	@Override
	public long getSwaps() {
		// TODO Auto-generated method stub
		return this.swaps;
	}
	
	@Override
	public long getComparisons() {
		// TODO Auto-generated method stub
		return this.comparisons;
	}
}
