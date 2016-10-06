package rbs.discountstrategyattempt2;
public class FakeDatabase implements DatabaseStrategy {
    private final Customer[] customers = {
      new Customer("100","Billy Bob"),
      new Customer("200","Francis Ajax"),
      new Customer("300","Peter Willy")
    };
    
    private final Product[] products = {
        new Product("001","Green Hat", 11.99, new PercentOffDiscount(.10)),
        new Product("002","Blue Shirt", 9.99, new FlatAmountDiscount(5.00)),
        new Product("003","Red Pants", 15.99, new NoDiscount())
    };
    
    @Override
    public final Customer findCustomerById(String customerId){
        //Needs Validation
        Customer customer = null;
        
        for(Customer c : customers){
            if(c.getCustomerId().equals(customerId)){
                customer = c;
                break;
            }
        }
        
        return customer;
    }
    @Override
    public final Product findProductById(String productId){
        //Needs Validation
        Product product = null;
        
        for(Product p : products){
            if(p.getProductId().equals(productId)){
                product = p;
                break;
            }
        }
        
        return product;
    }
    
}
