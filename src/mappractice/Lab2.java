package mappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jwardell
 */
public class Lab2 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "John", "333-33-3333");
        Employee e2 = new Employee("Jordan", "Michael", "111-11-1111");
        Employee e3 = new Employee("Favre", "Brett", "444-44-4444");
        Employee e4 = new Employee("Cricket", "Jiminy", "444-44-4444");

        Map<String, Employee> map = new HashMap<>();
        map.put("333-33-3333", e1);
        map.put("111-11-1111", e2);
        map.put("444-44-4444", e3);
        map.put("444-44-4444", e4);

        Employee e = map.get("111-11-1111");
        System.out.println(e);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Employee info = map.get(key);
            System.out.println(info);
        }

    }
}
