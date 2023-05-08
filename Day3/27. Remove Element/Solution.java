class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int temp;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }

        return k;      
   }
}
