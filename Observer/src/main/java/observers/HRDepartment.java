package observers;

import domain.Employee;

public class HRDepartment implements IObserver {

    public void callMe(Employee emp, String msg) {
        System.out.println("HR Department Notified ...");
        System.out.println(msg+" "+ emp.getName());
    }
}
