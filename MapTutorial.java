import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTutorial {
    public static void main(String[] args) {
        // ? key value
        Map<String, Integer> grades = new HashMap<String, Integer>();
        grades.put("kader", 20);
        grades.put("ali", 89);
        grades.put("mehmet", 88);
        grades.put("rüya", 0);
        grades.put("melike", 100);
        // ? lets look if same key can be added?
        // if the key is exist, value is updated
        grades.put("kader", 75);
        // what if we want to only create if the key is absent
        grades.putIfAbsent("kader", 45);
        // ? some usages
        boolean a = grades.remove("kader", 45);
        System.out.println(a ? "çıkarıldı" : "nooo");
        // ?lets remove by key
        grades.remove("kader");

        System.out.println(grades);
        List<Integer> onlyGrades = new ArrayList<>();
        grades.forEach((key, value) -> {
            onlyGrades.add(value);
        });

        System.out.println("grades: " + onlyGrades);
        System.out.println("melikenin notu: " + grades.get("melike"));
    }
}
