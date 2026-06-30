class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int n = s.length() - 1;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(n)==' '){
                n--;
            }
            else if(s.charAt(i)==' '){
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }
}