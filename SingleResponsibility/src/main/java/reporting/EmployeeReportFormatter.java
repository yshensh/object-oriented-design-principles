package reporting;

import domain.Employee;

/**
 * Created by yshen on 8/7/16.
 */
public class EmployeeReportFormatter extends ReportFormatter{

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }

}
