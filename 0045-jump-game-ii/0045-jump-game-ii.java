class Solution {
    public int jump(int[] nums) {

        int jumps = 0;
        int currentEnd = 0;
        int n = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            n = Math.max(n, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = n;
            }
        }

        return jumps;
    }
}