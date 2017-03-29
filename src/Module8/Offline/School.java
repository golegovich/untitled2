package Module8.Offline;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by George on 23/03/2017.
 */
public class School {
    public static void main(String[] args) {

        Map <String, Integer> map = new HashMap();

        Map treeMap = new TreeMap();

        Map linkedMap = new LinkedHashMap();

        String lastName = "Okun";

        map.put("Petrov", 1);
        map.put("Voronov", 2);
        map.put("Sidorov", 2);
        map.put("Okun", 3);
        map.put("Korzh", 3);

        System.out.println(lastName + " studying at " + map.get(lastName));

        for (String s : map.keySet()) {
            System.out.println(s + " studying at " + map.get(s) + " class");

        }
    }
}

