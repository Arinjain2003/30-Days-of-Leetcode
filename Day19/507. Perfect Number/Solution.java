class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num%2!=0)
            return false;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum=sum+i;
            if(sum>num)
                return false;
        }
        return sum==num;
    }
}
