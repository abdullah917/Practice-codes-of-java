class Solution {
    public boolean isPowerOfFour(int num) {
        while(num > 1)
        {
            if(num % 4 != 0)
                return false;
            num = num /4;
        }
        if(num == 1)
            return true;
        else 
            return false;
        
    }
}