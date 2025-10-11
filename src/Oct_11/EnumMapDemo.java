package Oct_11;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.Saturday, "Xutti");
        System.out.println(map);
    }
}
enum Day {
    Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
}