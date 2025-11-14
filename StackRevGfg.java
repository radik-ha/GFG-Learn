/*You are given a string s , the task is to reverse the string using stack.

Examples:

Input: s ="GeeksforGeeks"
Output:  skeeGrofskeeG
Input: s ="Geek"
Output: keeG*/
import java.util.*;
class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> stack = new Stack<>();
        for(char c: S.toCharArray())
        {
            stack.push(c);
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty())
        {
            str.append(stack.pop());
        }
        return str.toString();
    }
}

class StackRevGfg
{
public static void main(String args[])
{
String S = "geek";
Solution o = new Solution();
String result = o.reverse(S);
System.out.println(result);
}
}
















