package rbs.discountstrategyattempt2;
public interface DatabaseStrategy {

    public abstract Customer findCustomerById(String customerId);
    public abstract Product findProductById(String customerId);
}
