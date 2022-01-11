class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int reverse = 0;
        int rem = x;
        int r;
        while(rem > 0){
            r = rem % 10;
            reverse = (reverse * 10) + r;
            rem = rem / 10;
        }
        if(reverse == x){
            return true;
        }else{
            return false;
        }
    }
}