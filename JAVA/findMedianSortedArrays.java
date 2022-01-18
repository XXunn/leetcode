package leetcode;

public class findMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 存结果
        double res = 0;
        int n1 = nums1.length, n2 = nums2.length;
        int p1 = 0, p2 = 0;
        // cur是当前所指，lastCur是上一次的cur
        int lastCur = 0, cur = 0;
        int n = n1+n2, mid = n/2;
        for(int i = 0; i <= mid; i++) {
            lastCur = cur;
            if(p1 < n1 && (p2 >= n2 || nums1[p1] < nums2[p2])) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
        }
        if((n&1) != 0) {
            res = cur;
        } else {
            res = (lastCur + cur) / 2.0;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num1 = {1,3};
        int[] num2 = {2};
        findMedianSortedArrays(num1,num2);
    }
    /*public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1+n2;
        int f = 0;  // 0->1 1->2
        double res = 0;
        // 分别指向nums1和nums2的指针
        // cnt 计数
        int p1 = 0, p2 = 0, cnt = 0;
        //奇数只有一个，偶数有两个
        if(n%2==1) {
            int mid = (n/2)+1;
            while(2+p1+p2 < mid) {
                if(nums1[p1] < nums2[p2]) {
                    p1++;
                    f = 0;
                } else {
                    p2++;
                    f = 1;
                }
            }
            if(f == 0) {
                res = nums1[p1];
            } else {
                res = nums2[p2];
            }
        } else {
            int mid = n / 2;
            while(2+p1+p2 < mid) {
                if(nums1[p1] < nums2[p2]) {
                    p1++;
                    f = 0;
                } else {
                    p2++;
                    f = 1;
                }
            }
            if(f == 0) {
                res = (nums1[p1] + nums1[p1+1])/2;
            } else {
                res = (nums2[p2] + nums2[p2+1])/2;
            }
        }
        System.out.println("n: " + n);
        System.out.println("f: " + f);
        System.out.println("p1: " + p1 + " p2: " + p2);

        return res;
    }*/
}
