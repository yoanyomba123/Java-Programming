package SortingAlgorithms;


import java.util.Random;

public class MergeSort extends AbstractClass{
   private int[] data;
   private static final Random generator = new Random();
   private long swaps;
   private long comparisons;
   
   public MergeSort( int size ) {
      data = new int[ size ];

      for ( int i = 0; i < size; i++ )
         data[ i ] = 10 + generator.nextInt( 90 );
   }
   

   // call this method from main program
   public void sort() {
      sortArray( 0, data.length - 1 );
   }


   private void sortArray( int low, int high ) 
   {
	   // one comparison made within if-condition
	  //this.comparisons += 1;  
      if ( ( high - low ) >= 1 ) {
         int middle1 = ( low + high ) / 2; 
         int middle2 = middle1 + 1;

         sortArray( low, middle1 ); 
         sortArray( middle2, high );

         merge ( low, middle1, middle2, high );
      }
   } 

   
   private void merge( int left, int middle1, int middle2, int right ) 
   {
      int leftIndex = left; 
      int rightIndex = middle2;
      int combinedIndex = left;
      int[] combined = new int[ data.length ];
      
      // initial conditon as well as serving for the fail and success case
      //this.comparisons += 1;
      while ( leftIndex <= middle1 && rightIndex <= right ) {
    	  // comparison and swap made within if-condition
    	 this.comparisons += 1;
    	 this.swaps += 1;
         if ( data[ leftIndex ] <= data[ rightIndex ] )
            combined[ combinedIndex++ ] = data[ leftIndex++ ]; 
         else 
            combined[ combinedIndex++ ] = data[ rightIndex++ ];
         // comparison made after each iteration to decipher if staying in the while loop is important
         //this.comparisons += 1;
      }
   
      // comparison made for if-condition
      this.comparisons += 1;
      if ( leftIndex == middle2 ) {
    	  // comparison made for initial faile, success, and or inital case
    	 //this.comparisons += 1;
         while ( rightIndex <= right ) {
        	 // swap made
             this.swaps += 1;
        	 combined[ combinedIndex++ ] = data[ rightIndex++ ];
        	 // comparison made after each iteration
        	 //this.comparisons += 1;
         }
      }
      else {
    	  // comparison made for initial faile, success, and or inital case
    	 //this.comparisons += 1;
         while ( leftIndex <= middle1 ) { 
            combined[ combinedIndex++ ] = data[ leftIndex++ ];   
            // swap made
            this.swaps += 1;
       	 	// comparison made after each iteration
            //this.comparisons += 1;
         }
      }
	  // comparison made for initial faile, success, and or inital case
      //this.comparisons += 1;
      for ( int i = left; i <= right; i++ ) {
    	  this.swaps += 1;
          data[ i ] = combined[ i ];
          // comparison made for each iteration
    	  //this.comparisons += 1;
      }
   }


   // return number of swaps
	@Override
	public long getSwaps() {
		// TODO Auto-generated method stub
		return this.swaps;
	}
	
	
	// return number of comparisons
	@Override
	public long getComparisons() {
		// TODO Auto-generated method stub
		return this.comparisons;
	} 
  
}


