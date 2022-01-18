package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class pancakeSort {
    static void rev(int[] arr, int l) {
        int temp;
        for(int i = 0;i <= l/2; i++) {
            temp = arr[i];
            arr[i] = arr[l-i];
            arr[l-i] = temp;
        }
    }
    static public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = arr.length;
        for(int num = 1; num <= n; num++) {
            for(int i = 0; i < n; i++) {
                if(arr[i] == num) {
                    if(i == n - num) {
                        break;
                    }
                    rev(arr, i);
//                    for(int j = 0; j < n; j++) {
//                        System.out.print(arr[j]);
//                    }
                    //System.out.println();
                    ans.add(i+1);
                    rev(arr, n-num);
//                    for(int j = 0; j < n; j++) {
//                        System.out.print(arr[j]);
//                    }
                    //System.out.println();
                    ans.add(n-num+1);
                    break;
                }
            }
        }
        ans.add(n);
        return ans;
    }

    @Test
    public void test() {
        int []arr = {3, 2, 4, 1};
        System.out.println(pancakeSort(arr));
    }

}
