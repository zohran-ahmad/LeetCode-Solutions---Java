class Solution {
    public boolean isPalindrome(int x) {
        int myNum = x;
        int reverse = 0;
        while (x>0) {
            int lastDigit = x%10;
            reverse = reverse*10 + lastDigit;
            x /= 10;
        }
        return myNum == reverse;
    }
}
