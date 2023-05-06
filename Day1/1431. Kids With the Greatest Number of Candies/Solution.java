class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= 0;
        List<Boolean> arr = new ArrayList<Boolean>();
        for(int i = 0; i< candies.length;i++){
            if(candies[max]<candies[i])
            max = i;
        }
        for(int i = 0; i< candies.length;i++){
            if(candies[i]+ extraCandies >=candies[max])
            arr.add(true);

            else
            arr.add(false);
        }

        return arr;
    }
}
