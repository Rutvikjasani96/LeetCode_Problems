import java.util.ArrayList;
import java.util.List;

public class Problem_118 {
//    Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            int ans = 1;
            List<Integer> temp = new ArrayList<>();
            temp.add(ans);
            for(int j=1;j<i;j++){
                ans = ans * (i-j)/j;
                temp.add(ans);
            }
            result.add(temp);
        }
        return result;
    }
}
