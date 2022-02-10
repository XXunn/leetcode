package leetcode;


import java.util.LinkedList;
import java.util.List;

public class simplifiedFractions {

    public List<String> simplifiedFractions(int n) {
        List<String> res = new LinkedList<>();
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                if(gcd(i, j) == 1) {
                    res.add(j+"/"+i);
                }
            }
        }
        return res;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }


}
