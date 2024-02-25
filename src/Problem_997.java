public class Problem_997 {
//    Find the Town Judge
public int findJudge(int n, int[][] trust) {
    if(trust.length==0 && n>1){
        return -1;
    }
    if(n==1){
        return 1;
    }
    int[] inDegree = new int[n];
    int[] outDegree = new int[n];
    int ans =0;
    for(int i=0;i<trust.length;i++){
        outDegree[trust[i][0]-1]++;
        inDegree[trust[i][1]-1]++;
    }
    for(int i=0;i<inDegree.length;i++){
        if(inDegree[i] == n-1){
            ans = i;
        }
    }
    if(outDegree[ans]==0){
        return ans + 1;
    }
    else{
        return -1;
    }
}
}
