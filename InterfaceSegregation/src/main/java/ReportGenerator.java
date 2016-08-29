/**
 * Created by yshen on 8/28/16.
 */
public class ReportGenerator {

    private Reporting transactionObject;

    public void generateReport() {
         System.out.println(transactionObject.getName()+" "+transactionObject.productBreakdown()+" "+transactionObject.getDate());
    }
}
