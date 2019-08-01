package HashTable.LinkedHashMapTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(15, 0.75f, true);
        linkedHashMap.put("1", "1");
        linkedHashMap.put("2", "1");
        linkedHashMap.put("3", "1");
        linkedHashMap.put("4", "1");
        linkedHashMap.put("5", "1");
        print(linkedHashMap);
        linkedHashMap.get("1");
        print(linkedHashMap);

    }

    public static void print(LinkedHashMap<String, String> linkedHashMap) {
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + "\t");
        }
        System.out.println();
    }
}
