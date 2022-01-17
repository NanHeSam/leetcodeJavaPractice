**076. Minimum Window Substring**
1. use sliding window 
2. first collect all the characters and its count in a `map` (can use a int array to optimize since number of character is limited)
3. then use fast and slow pointer to define a window and count the matching character in the window
   1. first move the fast pointer to the right until all the characters-count satisfy the requirement
   2. then move the slow pointer until the window don't satisfy the requirement
4. use `count` to find how many unique character satisfy the requirement count
5. pay attention to the caveat of comparing the Integer as JVM cache Integer(-128) - Integer(127)
