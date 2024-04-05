import java.util.ArrayList;
import java.util.List;

public class Problem_57 {
//    Insert Interval
    public static void main(String[] args) {
        int[][] intervals = new int[2][2];
        intervals[0][0] = 1;
        intervals[0][1] = 3;
        intervals[1][0] = 6;
        intervals[1][1] = 9;
        int[] newInterval = new  int[2];
        newInterval[0] = 2;
        newInterval[1] = 5;
        int[][] ans = insert(intervals,newInterval);
        for(int i=0;i< ans.length;i++){
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
    }
    static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int i=0,n=intervals.length,start=newInterval[0],end=newInterval[1];
        while(i<n && intervals[i][1]<start){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        int[] mergedList = {start,end};
        while(i<n && intervals[i][0]<=end){
            mergedList[0] = Math.min(intervals[i][0],mergedList[0]);
            mergedList[1] = Math.max(intervals[i][1],mergedList[1]);
            i++;
        }
        ans.add(new int[]{mergedList[0],mergedList[1]});
        while(i<n){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
