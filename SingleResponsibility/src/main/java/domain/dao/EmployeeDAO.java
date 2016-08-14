package domain.dao;

import database.DatabaseConnectionManager;
import domain.Employee;

/**
 * Created by yshen on 8/7/16.
 */
public class EmployeeDAO {
    public void saveEmployee(Employee employee) {
//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConectionObject().prepareStatement("insert into Employee tbl");
//        connectionManager.disconnect();
        System.out.println("saved employee to the database: "+employee);
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("deleted employee to the database: "+employee);
    }
}
