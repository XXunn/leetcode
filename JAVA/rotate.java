package leetcode;

public class rotate {
    
    void swap(int [][] matrix, int x1, int y1, int x2, int y2) {
        System.out.format("%d %d %d %d%n",x1,y1,x2,y2);
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                System.out.format("%d %d%n",i,j);
                swap(matrix, i,j,j,i);
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                swap(matrix, i, j, i, n-j-1);
            }
        }
    }

}
