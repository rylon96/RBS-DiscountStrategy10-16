package rbs.discountstrategyattempt2;
public class FlatAmountDiscount implements DiscountStrategy{
    private double discountRate;
    
    public FlatAmountDiscount(double discountRate){
        setDiscountRate(discountRate);
    }
    
    @Override
    public final double getDiscountAmount(int qty, double unitCost){
        return unitCost - discountRate;
    }
    

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}
