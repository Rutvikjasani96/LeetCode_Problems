import java.util.Arrays;

public class Problem_3074 {
//    Apple Redistribution into Boxes
    public int minimumBoxes(int[] apple, int[] capacity) {
        int apple_count=0;
        for(int i=0;i<apple.length;i++){
            apple_count = apple_count + apple[i];
        }
        int ans=0;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            apple_count = apple_count-capacity[i];
            ans++;
            if(apple_count<=0){
                break;
            }
        }
        return ans;
    }
}
