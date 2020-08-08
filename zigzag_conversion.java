class Solution {
    public String convert(String st, int numRows) {
        if(numRows == 1)
            return st;
        List<StringBuilder> rows =new ArrayList<>();
        for(int i=0; i<Math.min(numRows, st.length()); i++)
            rows.add(new StringBuilder());
        int curRow=0;
        boolean goingDown = false;
        for(char c: st.toCharArray())
        {
            rows.get(curRow).append(c);
            if(curRow == 0 || curRow == numRows-1)
                goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }
        StringBuilder  ret = new StringBuilder();
        for(StringBuilder row:rows)
            ret.append(row);
        return ret.toString();
    }
}