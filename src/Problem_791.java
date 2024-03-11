import java.util.HashMap;

public class Problem_791 {
//    Custom Sort String
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<order.length();i++){
            if(hm.containsKey(order.charAt(i))){
                while(hm.get(order.charAt(i))>0){
                    sb.append(order.charAt(i));
                    hm.put(order.charAt(i),hm.get(order.charAt(i))-1);
                }
                if(hm.get(order.charAt(i))==0){
                    hm.remove(order.charAt(i));
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                while(hm.get(s.charAt(i))>0){
                    sb.append(s.charAt(i));
                    hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                }
                if(hm.get(s.charAt(i))==0){
                    hm.remove(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
