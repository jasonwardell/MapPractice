package mappractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author jwardell
 */
public class Lab3 {

    public static void main(String[] args) {

        Employee e1 = new Employee("Smith", "John", "333-33-3333");
        Employee e2 = new Employee("Jordan", "Michael", "111-11-1111");
        Employee e3 = new Employee("Favre", "Brett", "444-44-4444");
        Employee e4 = new Employee("Cricket", "Jiminy", "222-22-2222");

        Map<String, Employee> map = new TreeMap<>();
        map.put("333-33-3333", e1);
        map.put("111-11-1111", e2);
        map.put("444-44-4444", e3);
        map.put("222-22-2222", e4);

        Set<String> keys = map.keySet();
        
        System.out.println("Sorted by ssn.");
        for (String key : keys) {
            Employee info = map.get(key);
            System.out.println(info);
        }
        
        Collection<Employee> values = map.values();
        List<Employee> sortedList = new ArrayList<>(values);
        Collections.sort(sortedList, new EmployeeByLastName());
        
        System.out.println("\nSorted by last name.");
        for (Employee emp : sortedList) {
            System.out.println(emp);
        }
    }
}
