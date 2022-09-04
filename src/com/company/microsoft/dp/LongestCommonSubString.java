package com.company.microsoft.dp;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
       int length = s.length();
       boolean dp[][] = new boolean[length][length];
       String ans = "";
       //base cases
       //1 every string is a palindrome
        for(int i = 0;i < length; i++){
            dp[i][i] = true;
        }

        for(int i = length - 1; i >=0; i--){
            for(int j= i+1;j < length; j++){
                if(s.charAt(i) == s.charAt(j)){
                    //If it is of two character OR if its susbtring is palindrome.
                    if(j-i == 1 || dp[i+1][j-1] == true){
                        dp[i][j] = true;
                        if(ans.length() < j-i+1){
                            ans = s.substring(i,j-i+1);
                        }
                    }
                }
            }
        }
        return ans;

    }
}
