class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int a1 = arr1.length, a2= arr2.length, total = arr1.length + arr2.length;
        int [] arr3 = new int[total];
        for(int i=0, k=0, j=0; i<total; i++)
        {
            if(j<a1 && k<a2 && arr1[j] <= arr2[k])
            {
                arr3[i] = arr1[j++];
            }
           else if(j<a1 && k<a2 && arr1[j]>=arr2[k]){
               arr3[i]=arr2[k++];
           }
            else if(j>=a1 && k<a2)
                arr3[i] = arr2[k++];
            else if(k>=a2 && j<a1)
                arr3[i] = arr1[j++];
        }
        if(total%2!=0)
        {
            return (double) arr3[total/2];
        }
        else
        {
            double res1 = arr3[total/2];
            double res2 = arr3[(total/2)-1];
            return (res1 + res2)/2;
        }
    }
}