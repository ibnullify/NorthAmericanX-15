//Ibnul Jahan
//APCS2 pd
//HW15--So So Quick
//2017-03-09
/*****************************************************
 * class QuickSort
 * (skeleton) 
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): Quicksort chooses a number in a range of indexes and puts the number in its sorted index. It then recrusively does this again to the range of numbers left and right of this partition. 
 *
 * 2a. Worst pivot choice / array state and associated runtime:
If the array is sorted in a way where your partitions are high numbers and you're searching for a low number or vice versa. Or you can get really unlucky and keep getting bad numbers as the partition.
 *
 * 2b. Best pivot choice / array state and associated runtime:
Somehow choosing the median as the partition for each recursive call. O(nlogn)
 *
 * 3. Approach to handling duplicate values in array:
 *Put the duplicates on the left side of the array. 
 *****************************************************/

/***
    PROTIP: Assume no duplicates during initial development phase.
    Once you have a working implementation, test against arrays 
    with duplicate values, and revise if necessary. (Backup first.)
 ***/

public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------
   

    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ){
	qSortHelper(d,0,d.length-1);	

    }
    public static void qSortHelper(int[] d,int low,int high){
	if(low<high){
	    int pvtPos=partition(d,low,high,low);
	    qSortHelper(d,low,pvtPos-1);
	    qSortHelper(d,pvtPos+1,high);
	}
    }


    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.


/*  public static int partition(int[]arr, int low, int high, int pivot){
	//a=low,b=high,c=pivot
	int piv= arr[pivot];
	swap(high, pivot,arr);
	int s=low;
	int i=low;
        while(i< high){
	    if(arr[i]<piv){
		swap(s,i,arr);
	        //printArr(arr);
		s+=1;
	    }
	    i++; 
	}
	swap(arr.length-1,s,arr);
	return s;
	}*/ //this is original partition code, but now we can simplify some of it
     public static int partition( int arr[], int a, int b, int c)
    {
	int v = arr[c];
	swap( c, b, arr);
	int s = a;
	for( int i = a; i < b; i++ ) {
	    if ( arr[i] <= v) {
		swap( i, s, arr );
		s++;}
	}
	swap(s,b,arr);
	return s;
    }//end partition

    
    //main method for testing
    public static void main( String[] args ) 
    {
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);



	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


	
	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);
/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 

	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class QuickSort
