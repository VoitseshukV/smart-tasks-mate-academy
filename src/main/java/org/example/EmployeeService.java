package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployeesByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                int result = Integer.compare(employee1.getAge(), employee2.getAge());
                if (result == 0) {
                    result = employee1.getName().compareTo(employee2.getName());
                }
                return result;
            }
        };
        Set<Employee> result = new TreeSet<>(employeeComparator);
        result.addAll(employees);
        return result;
    }
}