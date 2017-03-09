# NorthAmericanX-15 (Borisov N., Jahad I., Lum J.)
# The big-O runtime of QuickSort:
1.Average case: O(nlogn). The quicksort algorithm has to make a tree of recursive calls. The partition algorithm has a linear 
runtime corresponding do the size of the partitioned piece of the array being worked with. An array of size n, is partitioned(in n time)
and then to recursive sub calls are called on the the new piece above and below the pivot point. On average the pivto point will
end up in the middle. At the kth recusive layer: there are 2^k partition pieces that all have to run a partion algorithm before calling 
their respective recursive calls. Each partition is rougly n/2^k long so the partition function will run n/2^k on all of them and 
2^k*(n/2^k)=n runtime for a single recursive layer of the algorigthm. There are logn recursive layers since they were being sp;it roughly in half each time
so logn*n gives a nlogn runtime.
