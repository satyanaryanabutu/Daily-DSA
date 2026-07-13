class Solution {
    public int findKthPositive(int[] arr, int k) {

        int l = arr[arr.length - 1] + k;   

        int[] nums = new int[l + 1];

      
        for (int i = 1; i <= l; i++) {
            nums[i] = i;
        }

        int count = 0;

        for (int i = 1; i <= l; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (nums[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                count++;

                if (count == k) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}