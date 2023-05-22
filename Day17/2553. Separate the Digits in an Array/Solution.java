class Solution {
    public int[] separateDigits(int[] nums) {
            int size = 0;
        int temp;
        for(int i = 0; i < nums.length; i++) {
            temp = nums[i];
            while(temp > 0) {
                size++;
                temp /= 10;
            }
        }
        int answer[] = new int[size];
        for(int i = nums.length - 1; i >= 0; i--) {
            while(nums[i] > 0) {
                answer[--size] = nums[i] % 10;
                nums[i] /= 10;
            }
        }
        return answer; 
    }
