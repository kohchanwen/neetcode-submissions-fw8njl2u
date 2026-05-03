class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums, target, curr, 0, res);
        return res;
    }

    private void backtrack(int[] nums, int target, List<Integer> curr, int i, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList(curr));
            return;
        }
        if (target < 0 || i >= nums.length) {
            return;
        }
        curr.add(nums[i]);
        backtrack(nums, target - nums[i], curr, i, res);
        curr.remove(curr.size() - 1);
        backtrack(nums, target, curr, i + 1, res);
    }
}
