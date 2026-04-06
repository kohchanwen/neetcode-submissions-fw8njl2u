class Solution {
    public int[] getConcatenation(int[] nums) {
        int arrSize = nums.length;
        int[] ans = new int[arrSize * 2];
        for(int i=0; i<arrSize; i++) {
            Arrays.fill(ans,i,i+1,nums[i]);
            Arrays.fill(ans,i+arrSize,i+arrSize+1,nums[i]);
        }

        return ans;
    }
}