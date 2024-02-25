public class Problem_1732 {
//    Find The Highest Altitude
    public int largestAltitude(int[] gain) {
        int pf = gain[0];
        int max = 0;
        max = Math.max(max,gain[0]);
        for(int i=1;i<gain.length;i++){
            pf = pf + gain[i];
            max = Math.max(max,pf);
        }
        return max;
    }
}
