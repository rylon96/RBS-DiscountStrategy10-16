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

    public final void setCustomerId(String customerId) throws NullPointerException{
        if(customerId == null || customerId.isEmpty()){
            throw new NullPointerException("Cannot be empty or null");
        }
        this.customerId = customerId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName)throws NullPointerException {
        if(customerName == null || customerName.isEmpty()){
            throw new NullPointerException("Cannot be empty or null");
        }
        this.customerName = customerName;
    }
    
}
