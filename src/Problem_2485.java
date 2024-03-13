public class Problem_2485 {
//    Find the Pivot Integer
    public int pivotInteger(int n) {
        int sumLeft = 0,sumRight = 0;
        sumRight = (n*(n+1))/2;
        for(int i=1;i<=n;i++){
            sumLeft = sumLeft + i;
            sumRight = sumRight - (i-1);
            if(sumLeft==sumRight){
                return i;
            }
        }
        return -1;
    }
}
