package com.company.microsoft.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    //tc - o(n)
    //sc - o(n)
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int count = 0;
        for(int i = 0; i< length;i++){
            Character letter = s.charAt(i);
            if(!map.containsKey(letter)){
                count++;
            }
            map.put(letter,map.getOrDefault(letter,0)+1);
        }
        return count;
    }



}
