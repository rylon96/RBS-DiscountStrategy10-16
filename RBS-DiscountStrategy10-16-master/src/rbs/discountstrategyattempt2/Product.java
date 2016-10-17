package rbs.discountstrategyattempt2;
public class Product {
    
    private String productId;
    private String productName;
    private double unitCost;
    private DiscountStrategy discount;

    public Product(String productId, String productName, double unitCost, DiscountStrategy discount) {
        setProductId(productId);
        setProductName(productName);        
        setUnitCost(unitCost);
        setDiscount(discount);
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId)throws NullPointerException {
        if(productId == null || productId.isEmpty()){
            throw new NullPointerException("Cannot be Null or Empty");
        }
        this.productId = productId;
    }
   

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName)throws NullPointerException {
        if(productName == null || productName.isEmpty()){
            throw new NullPointerException("Cannot be Null or Empty");
        }
        this.productName = productName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost){
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
}
