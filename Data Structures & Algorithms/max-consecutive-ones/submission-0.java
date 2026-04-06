class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int highestCount = 0;
        int currentCount = 0;
        for (int i=0; i < nums.length; i++) {
          if (nums[i] == 1) {
            currentCount++;
          } else {
            if (currentCount > highestCount) {
                highestCount = currentCount;
            }
            currentCount = 0;
          }
        }
        return Math.max(highestCount, currentCount);
    }
}