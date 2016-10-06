package rbs.discountstrategyattempt2;
public class QuantityDiscount implements DiscountStrategy{

    private double discountRate;
    private int minQty;
    private final int NO_DISCOUNT = 0;
    
    public QuantityDiscount(double discountRate, int minQty){
        setDiscountRate(discountRate);
        setMinQty(minQty);
    }
    
    @Override
    public final double getDiscountAmount(int qty, double unitCost) {
        //Needs Validation
        if(qty >= minQty) {
        return unitCost * qty * discountRate;
        } else {
            return NO_DISCOUNT;
        }
        
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //Needs Validation
        this.discountRate = discountRate;
    }

    public final int getMinQty() {
        return minQty;
    }

    public final void setMinQty(int minQty) {
        //Needs Validation
        this.minQty = minQty;
    }

    
}
