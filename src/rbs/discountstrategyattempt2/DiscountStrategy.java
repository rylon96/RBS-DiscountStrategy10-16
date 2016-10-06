package rbs.discountstrategyattempt2;
public interface DiscountStrategy {
    abstract double getDiscountAmount(int qty, double unitCost);
}
