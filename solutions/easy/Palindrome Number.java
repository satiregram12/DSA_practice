// Title: Palindrome Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/palindrome-number/

        while (num > 0){
            int a = num%10;
            rev_num = (rev_num *10) + a;
        }
    }
            num = num/10;
        if (rev_num == x) return true;
        else return false;
}
        int rev_num = 0;
        int num = x;
    public boolean isPalindrome(int x) {
class Solution {
