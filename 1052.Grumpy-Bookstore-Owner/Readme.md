**1052. Grumpy Bookstore Owner**
1. first sum up all the satisfied customer during the owner's happy minutes
2. use a sliding window of size `minutes`,  
   1. when an element slide in the window, if owner is grumpy (grumpy[i] == 1), add the number of customer in the minute in the sum
   2. when an element slide out the window, if owner is grumpy (grumpy[i] == 1), remove the number of customer in the minute from the sum
3. record the max if the current sum is createer than the max
