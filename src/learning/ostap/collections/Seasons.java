package learning.ostap.collections;

import java.util.HashMap;
import java.util.Map;

public class Seasons {
    public static void main(String[] args) {
        Map<String, String> calendar = new HashMap<>();
        calendar.put("January", "Winter");
        calendar.put("February", "Winter");
        calendar.put("December", "Winter");
        calendar.put("March", "Spring");
        calendar.put("May", "Spring");
        calendar.put("April", "Spring");
        calendar.put("June", "Summer");
        calendar.put("July", "Summer");
        calendar.put("August", "Summer");
        calendar.put("September", "Autumn");
        calendar.put("October", "Autumn");
        calendar.put("November", "Autumn");
        System.out.println(calendar);
        Map<String, String> calendar2 = new HashMap<>();
        for (String i : calendar.keySet()) {
            calendar2.put(calendar.get(i), i);
        }
        System.out.println(calendar2);
        String season = "Summer";
        String month = "July";
        if (calendar.containsValue(season)) {
            System.out.println("Season exists");
            System.out.println(calendar.get(month));
        } else {
            System.out.println("Season does not exists");
        }
    }
}
