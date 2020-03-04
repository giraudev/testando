package Hacker;

public class RepeatedString {

    /*Lilah has a string, s , of lowercase English letters that she repeated infinitely many times.
    Given an integer, n , find and print the number of letter a's in the first n letters of Lilah's infinite string.
    For example, if the string s=aba and n=10 , the substring we consider is abaabaabaa, the first  characters of her
    infinite string. There are 7 occurrences of a in the substring.*/

    public static void main(String[] args) {
        long number = repeatedString("a", 1000000000000L);
        System.out.println(number);
    }

    static long repeatedString(String s, long t) {
        long num = (t / s.length());
        long rem = t % s.length();
        long aCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount += num;
                if (i < rem)
                    aCount++;
            }
        }
        return aCount;
    }
}
