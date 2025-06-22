import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        // add in list method
        list.add(1);
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            // get list
            System.out.println(list.get(i));

        }

        // MAP SYNTAX
        Map<String, Integer> m = new HashMap<>();
        m.put("Bhavesh", 100);
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        // optional in map
        Optional<String> bad = Optional.of(null);
        // ✅ Safely check and print
        student.getMarks()
                .ifPresentOrElse(
                        m -> System.out.println(m),
                        () -> System.out.println("No marks available"));// Throws NullPointerException

    }
}
