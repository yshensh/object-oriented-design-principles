/**
 * Created by yshen on 8/28/16.
 */
public class AccountReceivable {

    private Accounting transactionObject;

    public AccountReceivable(Accounting aTransaction) {
        transactionObject = aTransaction;
    }

    public void postPayment() {
        transactionObject.chargeCustomer();
    }

    public void sendInvoice() {
        transactionObject.prepareInvoice();
    }

}
