package Module2.day3.Map;
import java.util.HashMap;
import java.util.Map;
public class MAP {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Fname", "Sachin");
        map.put("Lname", "Tendulkar");
        map.put("Team", "MI");
        System.out.println(map);
        System.out.println(map.get("Fname"));
        System.out.println(map.get("Lname"));
        System.out.println(map.get("Team"));

        for (String key : map.keySet()) {
            System.out.println((map.values()));
        }
        for (String value : map.keySet()) {
            System.out.println((value + map.get(value)));
        }
        map.keySet().stream().forEach((String key) -> System.out.println(key + ": " + map.get(key)));
        map.values().stream().forEach((String value) -> System.out.println(value + ": " + map.get(value)));
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ "entry.getValue");
        }
        map.entrySet().stream().forEach((Map.Entry<String,String> entry)-> System.out.println(entry.getKey()));
        map.forEach((String key,String value)-> System.out.println(key+ " :" +value));

    }
}

