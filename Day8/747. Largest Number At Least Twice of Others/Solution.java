class Solution {
    public int dominantIndex(int[] nums) {

        int max = 0;
        
        for(int i =1 ;i< nums.length;i++){
            if(nums[max]<nums[i])
              max = i;
        }

    for(int i =0 ;i< nums.length;i++){
         if(i == max){
             continue;
         }

         if(nums[max] >= 2*nums[i])
             continue;

             else
             return -1;
           }

           return max;
        
    }
}
