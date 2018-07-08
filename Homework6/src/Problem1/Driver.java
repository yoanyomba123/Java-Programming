package Problem1;

import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.MergeSort;
import SortingAlgorithms.QuickSort;
import SortingAlgorithms.SelectionSort;

public class Driver {
	
	static int log(int x, int base)
	{
	    return (int) (Math.log(x) / Math.log(base));
	}
	
	public long getQuickSortTime(int num) {
		Long upper=System.currentTimeMillis();
		QuickSort q=new QuickSort(num);
		q.sort();
		double value = num * log(num,2);
		Long lower=System.currentTimeMillis();
		System.out.println("Quick sort swaps performed : " + q.getSwaps() +  " comparisons performed : " + q.getComparisons() + " for " + Integer.toString(num) + " elements");
		System.out.println("Number of comparisons should be around " + value + "  Due to N*log(N)");
		return (lower - upper);
		
	}
	public long getInsertionSortTime(int num) {
		Long upper=System.currentTimeMillis();
		InsertionSort q=new InsertionSort(num);
		q.sort();
		double value = Math.pow(num, 2);

		Long lower=System.currentTimeMillis();
		System.out.println("Insertion sort swaps performed : " + q.getSwaps() +  " comparisons performed : " + q.getComparisons() + " for "  + Integer.toString(num) + " elements");
		System.out.println("Number of comparisons should be around " + value + " Due to N^2") ;

		return (lower - upper);
		
	}
	public long getMergeSortTime(int num) {
		Long upper=System.currentTimeMillis();
		MergeSort q=new MergeSort(num);
		q.sort();
		double value = num * log(num, 2);
		Long lower=System.currentTimeMillis();
		System.out.println("Merge sort swaps performed : " + q.getSwaps() +  " comparisons performed : " + q.getComparisons() + " for " + Integer.toString(num) + " elements");
		System.out.println("Number of comparisons should be around " + value +" Due to *log(N)");

		return (lower - upper);
		
	}
	public long getSelectionSortTime(int num) {
		Long upper=System.currentTimeMillis();
		SelectionSort q=new SelectionSort(num);
		q.sort();
		double value = Math.pow(num, 2);
		Long lower=System.currentTimeMillis();
		System.out.println("Selection sort swaps performed : " + q.getSwaps() +  " comparisons performed : " + q.getComparisons() + " for " + Integer.toString(num) + " elements");
		System.out.println("Number of comparisons should be around " + value +  " Due to N^2");

		return (lower - upper);
		
	}
	public static void main(String arg[]) {
		int[] numset = {50000, 100000, 200000, 300000, 400000};
		Driver sortData = new Driver();
		for(int i = 0; i < numset.length; i++) {
			int num = numset[i];
			long quicksorttime = sortData.getQuickSortTime(num) ;
			long insertionsorttime = sortData.getInsertionSortTime(num) ;
			long mergesorttime = sortData.getMergeSortTime(num) ;
			long selectionsorttime = sortData.getSelectionSortTime(num) ;
			
			System.out.println("**********************" + Integer.toString(num) + "***************");
			System.out.println("Quick sort takes "+ quicksorttime +" ms"+ " for " + num);
			System.out.println("Insertion sort takes "+ insertionsorttime +" ms"+ " for " + num);
			System.out.println("Merge sort takes "+ mergesorttime +" ms"+ " for " + num);
			System.out.println("Selection sort takes "+ selectionsorttime +" ms"+ " for " + num);
			System.out.println("");

		}
		
	}

}
