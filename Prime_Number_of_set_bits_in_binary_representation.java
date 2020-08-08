class Solution {
    public int countPrimeSetBits(int L, int R) {
       int ans = 0;
        for(int i = L; i <= R; i++)
            if(primeNum(Integer.bitCount(i)))
        ans++;
        return ans;
    }
    public boolean primeNum(int i)
    {
        return(i==2 || i==3 || i== 5 || i==7 || i==11 || i==13 || i==17 || i==19);
    }
}