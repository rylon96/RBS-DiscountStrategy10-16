package rbs.discountstrategyattempt2;
public class NoDiscount implements DiscountStrategy{
    private final int NO_DISCOUNT = 0;
    
    @Override
    public final double getDiscountAmount(int qty, double unitCost){
        return NO_DISCOUNT;
    }
}
