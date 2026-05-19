class SumSubsetXOR {
    public int solve(int i, int[] nums, int xor) {
        if (i == nums.length) {
            return xor;
        }
        int take = solve(i + 1, nums, xor ^ nums[i]);
        int notTake = solve(i + 1, nums, xor);
        return take + notTake;
    }
    public int subsetXORSum(int[] nums) {
        return solve(0, nums, 0);
    }

}