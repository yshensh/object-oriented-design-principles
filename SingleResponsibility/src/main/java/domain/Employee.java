package domain;

/**
 * Created by yshen on 8/7/16.
 */
public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;

    public Employee(long id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee [id" + id + ", name=" + name + ", department="
                + department + ", working=" + working + "]";
    }
}
