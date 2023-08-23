import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaCollection2 {
    public static void main(String[] args) {
        Map<String,Integer> player=new HashMap<>();
        player.put("messi",10);
        player.put("ronaldo",11);
        System.out.println(player);
        System.out.println( player.get(10));
        Set<Map.Entry<String,Integer>> set=player.entrySet(); //get the set of entries
        System.out.println(set);
        for(Map.Entry<String ,Integer> e:set){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
