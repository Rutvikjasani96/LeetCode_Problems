public class Problem_2965 {
//    Find Missing and Repeated Values
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int[] freq = new int[grid.length*grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                freq[grid[i][j]-1]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                ans[0] = i+1;
            }else if(freq[i]==0){
                ans[1] = i+1;
            }
        }
        return ans;
    }
}
