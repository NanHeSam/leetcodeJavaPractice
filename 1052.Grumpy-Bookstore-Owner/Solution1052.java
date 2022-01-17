class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        int max = 0; 
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                sum += customers[i];
            }
            // i >= minutes because it can be 0
            if (i>=minutes && grumpy[i-minutes] == 1) {
                sum -= customers[i-minutes];
            }
            max = Math.max(sum, max);
        }
        return max;
    }

    public int maxSatisfied2(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        int maxHappy = 0, curHappy = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }
        for (int i = 0, j=0; j < customers.length; i++) {
            while (j < customers.length && j < i + minutes) {
                if (grumpy[j] == 1) {
                    curHappy += customers[j];
                    maxHappy = Math.max(maxHappy, curHappy);
                }
                j++;
            }
            if (grumpy[i] == 1) {
                curHappy -= customers[i];
            }
        }
        return sum + maxHappy;
    }
}
