class Solution {
    public int percentageLetter(String s, char letter) {
        int l = s.length();
        int k =0;
        for(int i =0;i<l;i++){
            if(s.charAt(i)==letter){
                k++;
            }
        }
      return k*100/l;

    }
}
