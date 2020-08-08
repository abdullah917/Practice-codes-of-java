class Solution {
    public int reverse(int value) {
        int revValue =0;
        while(value !=0){
            int pop= value %10;
            value /=10;
            if(revValue>Integer.MAX_VALUE/10 || (revValue==Integer.MAX_VALUE/10 && pop>7))
                return 0;
            if(revValue<Integer.MIN_VALUE/10 || (revValue==Integer.MIN_VALUE/10 && pop<-8))
                return 0;
            revValue = revValue*10+pop;
        }
        return revValue;
    }
}