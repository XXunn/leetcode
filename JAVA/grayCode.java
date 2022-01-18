package leetcode;

import java.util.ArrayList;
import java.util.List;

public class grayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i^(i >> 1));
        }
        return result;
    }

//    public List<Integer> grayCode(int n) {
//        List<Integer> res = new ArrayList<Integer>() {{add(0);}};
//        int i, j;
//        int digit = 1;
//        for(i = 0; i < n; i++) {
//            for(j = res.size() - 1; j >= 0; j--) {
//                res.add(digit + res.get(j));
//            }
//            digit <<= 1;
//        }
//        return res;
//    }
}
