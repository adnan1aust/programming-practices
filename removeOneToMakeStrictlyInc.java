class Solution {
    public boolean canBeIncreasing(int[] nums) {
        
        int count = 0;
        int index = -1;
        int n = nums.length;

        for(int i = 1; i < n; i++) 
        {
            if (nums[i - 1] >= nums[i])
            {
                count++;
                index = i;
            }
        }
        if (count > 1){
            return false;
        }

        if (count == 0){
            return true;
        }

        if (index == n - 1 || index == 1){
            return true;
        }

        if (nums[index - 1] < nums[index + 1]){
            return true;
        }

        if (index - 2 >= 0 && nums[index - 2] < nums[index])
        {
            return true;
        }

        if(index < 0){
            return true;
        }

        return false;
    }
}