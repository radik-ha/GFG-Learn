/*Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
Input: s = "racecar"
Output: 'e'
Explanation: In the given string, 'e' is the only character in the string which does not repeat.
Input: s = "aabbccc"
Output: '$'
Explanation: All the characters in the given string are repeating.*/

class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int repeat[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            repeat[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(repeat[s.charAt(i)-'a']==1)
            {
                return s.charAt(i);
            }
        }
        return '$';
    }
}

class NonRepeatGfg
{
public static void main(String args[])
{
String s = "athikath";
Solution o = new Solution();
char result = o.nonRepeatingChar(s);
System.out.println(result);
}
}






























