class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false; 
        }
        int a=0;
        int s =x;
        while(x!=0){
            a = a*10+(x%10);
            x = x/10;
        }
        if(a==s){
            return true;
        }
        else{
            return false;
        }
    }
}