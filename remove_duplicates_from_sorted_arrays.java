class Solution {
    public int removeDuplicates(int[] val) {
        if(val.length == 0)
            return 0;
        int i=0;
        for(int j = 1; j < val.length; j++)
        {
            if(val[j] != val[i])
            {
                i++;
                val[i] = val[j];
            }
        }
        return i+1;
    }
}