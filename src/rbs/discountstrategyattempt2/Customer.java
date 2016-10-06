package rbs.discountstrategyattempt2;
public class Customer {

    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {
        setCustomerId(customerId);
        setCustomerName(customerName);
    }
    
    

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        //Needs Val
        this.customerId = customerId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        //Needs Val
        this.customerName = customerName;
    }
    
}
