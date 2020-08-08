class Solution {
    public int lengthOfLongestSubstring(String st) {
        int num = st.length();
        int res=0;
        for(int i =0; i<num; i++)
            for(int j=i+1; j<=num; j++)
                if(uniqueString(st,i,j))
                    res = Math.max(res,j-i);
        return res;
    }
    public boolean uniqueString(String st, int start, int end)
    {
        Set<Character> set = new HashSet<>();
        for(int i=start; i<end; i++){
            Character ch = st.charAt(i);
            if(set.contains(ch))
            return false;
            set.add(ch);
            }
        return true;
    }
}