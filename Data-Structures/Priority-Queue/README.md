#### API

* poll() or remove()
* add(element)

Implemented using heap.

##### What is a heap?
A heap is a tree based DS that satisfies the heap invariant (also called heap property): If 'A' is a parent node of B then 'A' is ordered with respect to B for all nodes A,B in the heap.

Therefore we have both max or min heaps. Note that these are binary heaps.

##### When and Where is PQ used?
* Used in certain implementations of Dijkstra's shortest path algorithm.
* Anytime you need to dynamically fetch next best or next worst element.
* Used in Huffman coding
* Best first search algorithms such as A* use PQs to continuously grab the next most promising node.
* Used by Minimum Spanning Tree algorithms

##### Complexity PQ with binary heap
construction    - O(n)
polling         - O(logn)
peeking         - O(1)
adding          - O(logn)

Naive removing  - O(n)
Advanced removing with help of hash table  - O(logn)
Naive contains  - O(n)
Contains check with help of hash table  - O(1)


#### Turning MIN PQ to Max PQ
Since elements in PQ are comparable they implement some sort of comparable interface which we can simply negate to achieve max heap

#### Adding elements to binary heap
A complete binary tree is a tree in which at every level except possibly the last is completely filled and all the nodes are as far left as possible. So we should use this complete binary tree itself for PQs

Binary Heap representation can be done with an array.

Let i be the parent node index, then
left child index = 2i + 1
right child index = 2i + 2

if i is the child, then parent node index = floor(i-1/2)

##### Adding algorithm: sifting or bubbling up(min heap)
* Add the new element to last spot in complete binary tree.
* Now bubble it and then check if its parent is greater or lesser than it.
* If parent is still greater than me, then bubble myself up again and repeat.


#### Poll elements from min heap; sinking: O(logn)
* When we remove, we call it poll since we only remove the topmost element
* Take the last element in last spot and copy its value into topmost place.
* Now heap invariant is messy, now we need to sink this new element.
* Now we compare with left and right and choose whichever is smaller and then go to that place.
* repeat. if tie, choose to go to left

##### Remove any element(not just the one at top : O(n)
* Do a linear scan and find that element if it exists
* Now replace it with last element in last spot.
* Now heap invariant might be messy. we do either of two steps depending on which heap invariant is not satisfied
    * Now bubble up just like we did in add process
    * Now bubble down just like we did in poll process.

##### We can remove any element in O(logn) using this hack: hashtable
* Instead of doing linear scan for finding where the element is, we just use hashtable with O(1)
* However there might be duplicate values. So instead we store index information in value part of hashtable.

key : value
node's value : its position in array representation

* But we have extra space complexity now