class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int j = 0;
        for(int i = 0 ; i < len ; i++){
            int current = nums[i];
            if(current == target || current > target){
                return i;
            }
        }
        return len;
    }
}