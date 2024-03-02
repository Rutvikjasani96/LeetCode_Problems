public class Problem_3033 {
//    Modify the Matrix
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] answer = matrix;
        int[] maxSum = new int[matrix[0].length];
        for(int i=0;i<answer[0].length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<answer.length;j++){
                max = Math.max(max,answer[j][i]);
            }
            maxSum[i] = max;
            for(int j=0;j<answer.length;j++){
                if(answer[j][i]==-1){
                    answer[j][i] = maxSum[i];
                }
            }
        }
        return answer;
    }
}
