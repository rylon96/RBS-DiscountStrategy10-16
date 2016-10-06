package rbs.discountstrategyattempt2;
public class PercentOffDiscount implements DiscountStrategy{

    private double discountRate;
    
    public PercentOffDiscount(double discountRate){
        setDiscountRate(discountRate);
    }
    @Override
    public double getDiscountAmount(int qty, double unitCost) {
        return unitCost * qty * discountRate;
    }
    
    public final double getDiscountRate(){
        return discountRate;
    }
    
    public final void setDiscountRate(double discountRate){
        this.discountRate=discountRate;
    }
}
    

