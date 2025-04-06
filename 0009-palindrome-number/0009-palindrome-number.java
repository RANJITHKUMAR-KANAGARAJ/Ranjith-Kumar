class Solution {
    public boolean isPalindrome(int num) {
        int ans = 0;
        int res=num;
        while(num>0){
        int rem = num%10;
        num = num/10;
        ans=ans*10+rem;
        }
        if(ans==res){
        return true;
        }
       return false;
    }
}