package domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    Employee emp1 = new Employee("Mike", null, 1000, false);
    Employee emp2 = new Employee("Jack", null, 2000, false);
    Employee emp3 = new Employee("Jo", null, 3000, false);
    Employee emp4 = new Employee("Jon", null, 4000, false);

    List<Employee> employees;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

}
