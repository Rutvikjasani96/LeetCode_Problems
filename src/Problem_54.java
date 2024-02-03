import java.util.ArrayList;
import java.util.List;

public class Problem_54 {
//    Spiral Matrix
    public static void main(String[] args) {
        int[][] matrix = new int[3][2]; // [n][m]
        matrix[0][0] = 2;
        matrix[0][1] = 5;
        matrix[1][0] = 8;
        matrix[1][1] = 4;
        matrix[2][0] = 0;
        matrix[2][1] = -1;
        List<Integer> ans = spiralOrder(matrix);
        System.out.println("ans : "+ans);
    }
    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        int n = matrix[0].length;
        int m = matrix.length;
        int row_start = 0;
        int col_start = 0;
        int row_end = m - 1;
        int col_end = n - 1;
        while(ans.size() < n*m){
            //For starting row addition
            for(int i = col_start; i <= col_end; i++){
                ans.add(matrix[row_start][i]);
            }

            //To add last colm
            for(int i = row_start + 1; i <= row_end; i++){
                ans.add(matrix[i][col_end]);
            }
            //To add last row
            if(row_start != row_end){   // one row matrix check
                for(int i = col_end - 1; i >= col_start; i--){
                    ans.add(matrix[row_end][i]);
                }
            }
            //To add first colm
            if(col_start != col_end){   // one column matrix check
                for(int i = row_end - 1; i >= row_start + 1; i--){
                    ans.add(matrix[i][col_start]);
                }
            }
            col_start++;
            col_end--;
            row_start++;
            row_end--;
        }
        return ans;
    }
}
