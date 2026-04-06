class Solution {
    public int removeElement(int[] nums, int val) {
        int writerPointer = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[writerPointer] = nums[i];
                writerPointer++;
            }
        }
        return writerPointer;
    }
}