package observers;

import domain.Employee;

public class PayrollDepartment implements IObserver {

    public void callMe(Employee emp, String msg) {
        System.out.println("Payroll Department Notified ...");
        System.out.println(msg+" "+ emp.getName());
    }
}
