/*Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

Examples:

Input: s1 = "geeks" s2 = "kseeg"
Output: true 
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergyy" 
Output: false 
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. 
Input: s1 = "listen", s2 = "lists" 
Output: false 
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.*/
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length())
        return false;
        int count[] = new int[26];
        for(char w:s1.toCharArray())
        {
            count[w-'a']++;
        }
        for(char w:s2.toCharArray())
        {
            count[w-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            return false;
        }
        return true;
        
    }
}

class Anagramgfg
{
public static void main(String args[])
{
String s1= "code";
String s2 = "decd";
Solution o = new Solution();
boolean result = Solution.areAnagrams(s1,s2);
System.out.println(result ? "Anagrams" :"Not Anagrams");
}

}
