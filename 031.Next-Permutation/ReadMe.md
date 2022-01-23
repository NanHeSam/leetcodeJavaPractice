**031. Next Permutation**
say input [1 3 5 4 2]
1. the next larger permutation will need a digit at some point, so try to identify the digit that need to be changed first. 3 is the first one that is less than the right 5
2. starting from the right most digit travers to the left, find the first digit that is greater than the one found above. then swap those two. 4 is the first one larger than 3. swap gives [1 4 5 3 2]. 
3. not at this point the digit after 4 is still in non ascending order. then just reverse them
