import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW {
    public static void main(String[] args) {
//--1
        List<Map<String, String>> animalList = new ArrayList<Map<String, String>>();
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("shark", "ocean");
        map1.put("bear", "land");
        map1.put("moose", "land");
        map1.put("frog", "swamp");
        map1.put("jelly fish", "ocean");
        map1.put("heron", "swamp");
        map1.put("whale", "ocean");
        animalList.add(map1);
        Map<String, List<String>> animal = new HashMap<>();
        animalList.forEach(s -> {
            s.forEach((name, habitat) -> {
                if (!animal.containsKey(habitat)) {
                    animal.put(habitat,new ArrayList<>());
                }
                animal.get(habitat).add(name);
            });
        });
        for (String key : animal.keySet()) {
            System.out.println(key + ":" + animal.get(key));
        }

//--2
        Map<String, String> map = new HashMap<String, String>();
        map.put("USA", "Washington");
        map.put("Japan", "Tokyo");
        map.put("Thailand", "Bangkok");
        map.put("UK", "London");
        map.put("Australia", "Canberra");
        map.put("Denmark", "Copenhagen");
        map.put("Egypt", "Cairo");
        map.put("Vietnam", "Hanoi");
        map.put("Italy", "Rome");
        map.put("Brazil", "Brazilia");

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }

}


