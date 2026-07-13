class Solution {
    public int findKthPositive(int[] arr, int k) {

        int l = arr[arr.length - 1] + k;   

        int[] nums = new int[l + 1];

      
        for (int i = 1; i <= l; i++) {
            nums[i] = i;
        }

        int c = 0;

        for (int i = 1; i <= l; i++) {

            boolean f = false;

            for (int j = 0; j < arr.length; j++) {
                if (nums[i] == arr[j]) {
                    f = true;
                    break;
                }
            }

            if (!f) {
                c++;

                if (c == k) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}