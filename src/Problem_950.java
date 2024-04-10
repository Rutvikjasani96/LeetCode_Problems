import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Problem_950 {
//    Reveal Cards In Increasing Order
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> ind = new ArrayDeque<>();
        for(int i=0;i<deck.length;i++){
            ind.addLast(i);
        }
        int[] ans = new int[deck.length];
        int i=0;
        while(!ind.isEmpty()){
            ans[ind.pollFirst()] = deck[i];
            if(!ind.isEmpty()){
                ind.addLast(ind.pollFirst());
            }
            i++;
        }
        return ans;
    }
}
