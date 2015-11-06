package mappractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jwardell
 */
public class Lab4 {

    public static void main(String[] args) {

        Employee e1 = new Employee("Smith", "John", "333-33-3333");
        Employee e2 = new Employee("Jordan", "Michael", "111-11-1111");
        Employee e3 = new Employee("Favre", "Brett", "444-44-4444");
        Employee e4 = new Employee("Cricket", "Jiminy", "222-22-2222");

        Set<Employee> set = new TreeSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        List<Employee> list = new ArrayList<>(set);

        Collections.sort(list, new EmployeeByLastName());

        for (Employee t : list) {
            System.out.println(t);
        }
    }
}
