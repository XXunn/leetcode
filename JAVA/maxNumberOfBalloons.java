package leetcode;

import java.util.Arrays;

public class maxNumberOfBalloons {
    int[] hs = new int[26];

    public int maxNumberOfBalloons(String text) {
        // b a l o n
        int[] cnt = new int[5];
        int n = text.length();
        for(int i = 0; i < n; i++) {
            if(text.charAt(i) == 'b') {
                cnt[0]++;
            } else if(text.charAt(i) == 'a') {
                cnt[1]++;
            } else if(text.charAt(i) == 'l') {
                cnt[2]++;
            } else if(text.charAt(i) == 'o') {
                cnt[3]++;
            } else if(text.charAt(i) == 'n') {
                cnt[4]++;
            }
        }
        cnt[2] /= 2;
        cnt[3] /= 2;
        return Arrays.stream(cnt).min().getAsInt();
    }


    // public int maxNumberOfBalloons(String text) {
    //     int ans = 0;
    //     int n = text.length();
    //     for(int i = 0; i < n; i++) {
    //         hs[text.charAt(i)-'a']++;
    //     }
    //
    //     while(hs['b'-'a'] >= 1 && hs[0] >= 1 && hs['l'-'a'] >= 2 && hs['o'-'a'] >= 2 && hs['n'-'a'] >= 1) {
    //         hs['b'-'a'] -= 1;
    //         hs[0] -= 1;
    //         hs['l'-'a'] -= 2;
    //         hs['o'-'a'] -= 2;
    //         hs['n'-'a'] -= 1;
    //         ans++;
    //     }
    //     return ans;
    // }




}
