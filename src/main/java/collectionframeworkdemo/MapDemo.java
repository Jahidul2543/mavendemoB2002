package collectionframeworkdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> stundentInfo = new HashMap<>();

        stundentInfo.put(11, "John");
        stundentInfo.put(12, "Mon");
        stundentInfo.put(13, "Khon");

        System.out.println("Size of the map: " + stundentInfo.size());
        System.out.println("Value of key 12: " + stundentInfo.get(12));

        for(Map.Entry<Integer, String> entry : stundentInfo.entrySet() ){
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
