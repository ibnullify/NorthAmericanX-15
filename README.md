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

