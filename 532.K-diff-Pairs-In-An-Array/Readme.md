532. K-diff-Pairs-In-An-Array
1. think in 2 pointers -> fast and slow pointer
2. first identify the valid i, then try to see if there's valid j that satisfy nums[i] + k == nums[j], if exist, counter++
3. make sure to skip all the same i
4. for each valid i, start from j = i + 1
