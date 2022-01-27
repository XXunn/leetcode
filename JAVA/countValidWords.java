package leetcode;

import java.util.HashSet;

public class countValidWords {
    public int countValidWords(String sentence) {
        int ans = 0;
        String[] str = sentence.split("\\s+");
        for(String s : str) {
            if(isValid(s) && !s.equals("")) {
                ans++;
            }
        }
        return ans;
    }

    public boolean isValid(String word) {
        int n = word.length();
        boolean hasHyphens = false;
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(word.charAt(i))) {
                return false;
            } else if (word.charAt(i) == '-') {
                if (hasHyphens == true || i == 0 || i == n - 1 || !Character.isLetter(word.charAt(i - 1)) || !Character.isLetter(word.charAt(i + 1))) {
                    return false;
                }
                hasHyphens = true;
            } else if (word.charAt(i) == '!' || word.charAt(i) == '.' || word.charAt(i) == ',') {
                if (i != n - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
