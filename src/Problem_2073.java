public class Problem_2073 {
//    Time Needed to Buy Tickets
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        int ignore=0;
        for(int i=0;i<tickets.length;i++){
            if(i!=k){
                time = time + Math.min(tickets[k],tickets[i]);
            }
            if(tickets[i]>=tickets[k] && k<i){
                ignore++;
            }
        }
        time+=tickets[k];
        return time - ignore;
    }
}
