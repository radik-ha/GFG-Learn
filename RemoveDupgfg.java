/*Given a string s which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input: s = "geEksforGEeks"
Output: "geEksforG"
Explanation: After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
Example 2:

Input: s = "HaPpyNewYear"
Output: "HaPpyNewYr"
Explanation: After removing duplicate characters such as e, a, we have string as "HaPpyNewYr".*/

import java.util.*;
class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder st = new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(!seen.contains(c))
            {
                seen.add(c);
                st.append(c);
            }
        }
        return st.toString();
    }
}
class RemoveDupgfg
{
public static void main(String[] args) 
{
        String s = "geEksforGEeks";
        Solution obj = new Solution();
        System.out.println(obj.removeDuplicates(s)); // Output: geEksforG
}
}
