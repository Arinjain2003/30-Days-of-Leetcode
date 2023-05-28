class Solution {
    public int findGCD(int[] nums) {
        int min = 0;
        int max = 0;

        for(int i = 1; i< nums.length;i++){
            if(nums[min]>nums[i]){
                min = i;
            }
            if(nums[max]<nums[i]){
                max=i;
            }
        }

        for(int i = nums[min]; i>0; i--){
            if(nums[min]%i==0 && nums[max]%i==0){
                return i;
            }
        }
       return 0;
    }
}
