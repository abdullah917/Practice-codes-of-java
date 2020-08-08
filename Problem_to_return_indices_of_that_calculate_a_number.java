class Solution {
    public int[] twoSum(int[] numbers, int targetValue) {
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]==targetValue-numbers[i]){
                    return new int[]
                    {i,j};
                }
            }
        }
        throw new IllegalArgumentException("There is no two sum value");
    }
}