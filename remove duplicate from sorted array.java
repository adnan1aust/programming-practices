class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int unique = 0;
        if(l == 1 || l == 0){
            return l;
        }else {
            for(int i = 0 ; i < l - 1 ; i++){
                if(nums[i] != nums[i+1]){
                    nums[unique++] = nums[i];
                }
            }
        }
        nums[unique++] = nums[l-1];
        return unique;
    }
}