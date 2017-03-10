# NorthAmericanX-15 (Borisov N., Jahan I., Lum J.)
# The big-O runtime of QuickSort:
1.Average case: O(nlogn). The quicksort algorithm has to make a tree of recursive calls. The partition algorithm has a linear 
runtime corresponding do the size of the partitioned piece of the array being worked with. An array of size n, is partitioned(in n time)
and then to recursive sub calls are called on the the new piece above and below the pivot point. On average the pivto point will
end up in the middle. At the kth recusive layer: there are 2^k partition pieces that all have to run a partion algorithm before calling 
their respective recursive calls. Each partition is rougly n/2^k long so the partition function will run n/2^k on all of them and 
2^k*(n/2^k)=n runtime for a single recursive layer of the algorigthm. There are logn recursive layers since they were being sp;it roughly in half each timeso logn*n gives a nlogn runtime.

2.Best Case: O(nlogn). Even if it is handed a sorted array, QuickSort will still have to make logn 
layers of recursive calls and run the partition algorithm still has to run in linear time. 
But seeing as the version of Quick sort we chose uses the lowest element as a pivot, it would best to have an array that has medium sized elements in the begining(since then the pivots would land in the middle of their respective partitions).

3.Worst case: O(n^2). If the pivots are located in the beggining of a list(like with an already sorted array), then quicksort will be inneficient since. It would make a lot more partitions than it has to and would essentially run the partition algorithm on succesively smaller upper halves of the partitions (so n+ n-1 + n-2 +... = O(n^2)). 


GOAL: Test the runtime of QuickSort

##The algorithm is set up with the following:
1)There is a method that writes a random array of any specified length, and there is a method that uses that as a helper to writes a 2 dimensional array (int[][]) containing arrays of size 1 to n, where n is specified. 

2)There is a method that finds the runtime in nanoseconds for each of these arrays a specified number of times, and then averages it. 

3)These averages are then put into an array, so that the indices match with the 2D array.

4)The length of the list, and the average runtime is then written to a csv file for easier access.


###Specifics:
Generates a two dimensional array, that contains randomly generated arrays from size 1 to 1000. 

Generates a new array with corresponding indices to the previous 2D array that takes the average runtime for the corresponding array at each index run 100 times.

Export sthis information as a csv file for easy viewing off the command line.


##ANALYSIS:
Sorting through quicksort gave graphs that were very clearly growing faster than a linear. Whether they grew faster or slower than a quadratic is a bit difficult to see, but the graph does a decent job of showing that too. It looks to be O(nlogn) based on that charts, and this matches up with the hypothesis we had initally.


See our graphical data over [here](https://docs.google.com/document/d/1fRpI9wqXtwip9l6MJUjfgE-yfD5Q0b5uuUHvEBd72HU/pub)

If the links are broken, they are repeated below:
https://docs.google.com/document/d/1fRpI9wqXtwip9l6MJUjfgE-yfD5Q0b5uuUHvEBd72HU/pub
