package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/7 14:22
 **/
public class quickSortTemplate {

    public static void quickSort(int[] nums, int l, int r) {
        if(l >= r) {
            return;
        }
        int i = l, j = r-1, x = nums[(l+r)>>1];
        while(i < j) {
            while(i < j && nums[i] < x) {
                i++;
            }
            while(i < j && nums[j] > x) {
                j--;
            }
            if(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        quickSort(nums, l, j);
        quickSort(nums, j+1, r);
    }

    public static void main(String[] args) {
        int[] a = new int[] {4, 6, 8, 2, 1};
        quickSort(a, 0, a.length);
        for (int x : a) {
            System.out.println(x);
        }
    }
}
