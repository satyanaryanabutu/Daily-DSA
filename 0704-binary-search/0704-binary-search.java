class Solution {
    public int search(int[] nums, int target) {
        int t=target;
        int s=nums.length;
        for(int i=0;i<s;i++){
            if(nums[i]==t){
                return i;
                
            }

        }
        return -1;
    }
    
}