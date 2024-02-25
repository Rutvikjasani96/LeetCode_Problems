import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Problem_989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int sum,carry=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            if(k>0){
                sum = (k%10) + num[i] + carry;
                k=k/10;
            }else{
                sum = num[i];
                k = 0;
            }
            carry = sum/10;
            int result = sum%10;
            ans.add(result);
        }
        ans.add(carry);
        int i=0;
        int j= ans.size()-1;
        int temp;
        while(i<j){
            temp = ans.get(i);
            ans.set(i,ans.get(j));
            ans.set(j,temp);
            i++;
            j--;
        }
        return ans;
    }
}
