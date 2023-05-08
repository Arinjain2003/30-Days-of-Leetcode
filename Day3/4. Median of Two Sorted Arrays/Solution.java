class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m = nums1.length;
       int n = nums2.length;
       int x = m+n;
       
        int arr[] = new int[m+n];
        int k = 0;
        for(int i = 0 ; i<m;i++){
            arr[k++] = nums1[i];
           

        }
        

        for(int j = 0; j<n; j++){
            arr[k++] = nums2[j];
        }
        Arrays.sort(arr);
        if (x%2==0)
            return (float)(arr[x/2-1] + arr[x/2])/2;
        

        return (float) (arr[x/2]) ;

        
        
    }
}
