import java.util.ArrayList;
import java.util.List;

public class Problem_54_Replay {
    // Solution Repeat and More Focus
    public static void main(String[] args) {
        int[][] matrix = new int[1][4]; // [n][m]
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
//        matrix[1][0] = 5;
//        matrix[1][1] = 6;
//        matrix[1][2] = 7;
//        matrix[1][3] = 8;
//        matrix[2][0] = 9;
//        matrix[2][1] = 10;
//        matrix[2][2] = 11;
//        matrix[2][3] = 12;
//        matrix[3][0] = 13;
//        matrix[3][1] = 14;
//        matrix[3][2] = 15;
//        matrix[3][3] = 16;
        List<Integer> ans = spiralOrder(matrix);
        System.out.println("ans : "+ans);
    }
    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int row_start = 0;
        int column_start = 0;
        int row_end = n-1;
        int column_end = m-1;
        while(ans.size() < n*m){
            for(int i=column_start;i<=column_end;i++){
                ans.add(matrix[row_start][i]);
            }
            for(int i=row_start+1;i<=row_end;i++){
                ans.add(matrix[i][column_end]);
            }
            if(row_start!=row_end){
                for(int i=column_end-1;i>=column_start;i--){
                    ans.add(matrix[row_end][i]);
                }
            }
            if(column_start!=column_end) {
                for (int i = row_end - 1; i >= row_start + 1; i--) {
                    ans.add(matrix[i][column_start]);
                }
            }
            row_start++;
            column_start++;
            row_end--;
            column_end--;
        }
        return ans;
    }
}
