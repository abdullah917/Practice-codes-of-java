class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    private int bitCount(int n){
    int count =0;
    while (n > 0)
    {
        n=n &(n-1);
        count++;
    }
        return count;
    }
}