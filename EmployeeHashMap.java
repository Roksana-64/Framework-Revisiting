import java.util.*;

public class EmployeeHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> empMap = new HashMap<>();

        // employeeID -> department
        empMap.put(201, "HR");
        empMap.put(202, "IT");
        empMap.put(203, "Finance");

        System.out.println("Employee Department List:");
        System.out.println(empMap);
    }
}
