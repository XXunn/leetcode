package leetcode;

public class reverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        int l = s.length();
        StringBuilder strB = new StringBuilder(s.substring(n, l));
        return strB.append(s.substring(0, n)).toString();
    }
}
