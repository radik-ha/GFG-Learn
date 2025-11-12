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