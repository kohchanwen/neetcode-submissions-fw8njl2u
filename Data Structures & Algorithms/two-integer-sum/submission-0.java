class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (prevMap.containsKey(complement)) {
                return new int[] {prevMap.get(complement), i};
            } else {
                prevMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
