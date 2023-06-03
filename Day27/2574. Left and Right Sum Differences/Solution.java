class Solution {
    public int[] leftRightDifference(int[] nums) {
              int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] ans=new int[nums.length];
        int l=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
                left[i]=l;
            l+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
                right[i]=r;
            r+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
              ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;  
    }
}
