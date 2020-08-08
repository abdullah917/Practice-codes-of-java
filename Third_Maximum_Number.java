class Solution {
    public int thirdMax(int[] val) {
        HashSet <Integer> hash =new HashSet<Integer> ();
        for(int num:val)
            hash.add(num);
        if(hash.size() >=3)
        {
            hash.remove(Collections.max(hash));
            hash.remove(Collections.max(hash));
        }
        return Collections.max(hash);
    }
}