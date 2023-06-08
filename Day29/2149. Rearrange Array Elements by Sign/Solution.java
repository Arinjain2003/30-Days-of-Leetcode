class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr1[] = new int[nums.length/2];
        int arr2[] = new int[nums.length/2];
      int k =0;
      int  l =0;
      for(int i = 0; i<nums.length;i++){
        if(nums[i]>=0){
          arr1[k++] = nums[i];

        }
        else{
            arr2[l++] = nums[i];
        }
      }

      int m = 0;
      int n = 0;

       for(int i = 0; i<nums.length;i++){
        if(i%2==0){
            nums[i] = arr1[m++];
        }
         else{
             nums[i] = arr2[n++];
         }

       }


return nums;
        
    }
}
