class Solution {
    public int maxSubArray(int[] nums) {
        int curMax = Integer.MIN_VALUE;
        int maxEnd = 0;
        int size = nums.length;
        boolean allNeg = true;
        int minNeg = Integer.MIN_VALUE;
        for(int i = 0 ; i < size; i++){
            maxEnd += nums[i];
            if(maxEnd < 0){
                maxEnd = 0;
            }
            if(curMax < maxEnd){
                curMax = maxEnd;
            }
            if(nums[i] > 0 && allNeg){
                allNeg = !allNeg;
            }
            if(nums[i] > minNeg){
                minNeg = nums[i];
            }
        }
        if(allNeg){
            return minNeg;
        } else {
            return curMax;
        }
    }
}