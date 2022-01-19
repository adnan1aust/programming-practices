class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] array = new int[length * 2];
        for(int i = 0 ; i < length * 2 ; i++){
            if(i < length ){
                array[i] = nums[i];
            } else {
                array[i] = nums[i - length];
            }
        }
        return array;
    }
}