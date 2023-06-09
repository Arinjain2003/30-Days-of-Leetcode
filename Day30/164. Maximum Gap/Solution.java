class Solution {
    public int maximumGap(int[] nums) {
           if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int arr[] = new int[nums.length-1];
        int k = 0;
     for(int i = 1; i < nums.length;i++){
     
      arr[k++] = nums[i] - nums[i-1];

     }
       Arrays.sort(arr);
     return arr[arr.length-1];

    }
}
