class Solution {
    public String longestPalindrome(String s) {
        //corner case
        if(s == null || s.length() == 0) {
            return "";
        }
        //define parameters
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int start = 0;
        int maxLen = 1;
        //initialize
        for(int i = 0; i < len; i ++) {
            dp[i][i] = true;
        }
        int currLen = 1;
        // i : left pointer r : right pointer
        while(currLen <= len) {
            currLen ++;
            for(int i = 0, j = currLen - 1; j < len; i ++, j ++) {
                if(s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if(currLen == 2) {
                        dp[i][j] = true;
                        start = i; maxLen = currLen;
                    }
                    else {
                        if(dp[i + 1][j - 1]) {
                            dp[i][j] = true;
                            start = i; maxLen = currLen;
                        } else {
                            dp[i][j] = false;
                        }
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
        
    }
}