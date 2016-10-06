package rbs.discountstrategyattempt2;
public class LineItem {
    
    private Product product;
    private int qty;
    private double tax = 0.05;

    public LineItem(String productId, int qty, DatabaseStrategy db) {
        //Needs Val
        setProduct(db.findProductById(productId));
        setQty(qty);
    }
    
    public final double getLineItemSubTotal(){
        //Needs Val
        return product.getUnitCost() * qty; 
    }
    
    public final double getLineItemTax(){
        //Needs Val
        return product.getUnitCost() * qty * tax;
    }
    public final double getLineItemDiscount(){
        //Needs Val
        return product.getDiscount().getDiscountAmount(qty, product.getUnitCost());
    }
    public final double getLineItemTotal(){
        //Needs Val
        return qty * product.getUnitCost() - getLineItemTax() - getLineItemDiscount();
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        //Needs Val
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //Needs Val
        this.qty = qty;
    }

    public final double getTax() {
        return tax;
    }

    public final void setTax(double tax) {
        //Needs Val
        this.tax = tax;
    }
    
}
