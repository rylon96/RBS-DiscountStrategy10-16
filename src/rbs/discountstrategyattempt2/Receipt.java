package rbs.discountstrategyattempt2;
public class Receipt {
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems;
    private Register register;
    public final String ID_HEADER = "ProductID";
    public final String PRODUCT_NAME = "Product";
    public final String COST = "Cost";
    public final String QTY = "Qty";
    public final String SUBTOTAL = "Subtotal";
    public final String DISCOUNT = "Discount";
    public final String TAX = "Tax";
    public final String DISCOUNT_TAX_SUBTOTAL = "Discount/Tax Subtotal";
    public final String TOTAL_BEFORE_DISCOUNT_AND_TAX = "Total before Discount and Tax";
    public final String TOTAL_AFTER_DISCOUNT_AND_TAX = "Total after Discount and Tax";
    
    public Receipt(String customerId, DatabaseStrategy db){
        setDb(db);
        setCustomer(db.findCustomerById(customerId));
        lineItems = new LineItem[0];
    }
    public final void addItemToReceipt(String productId, int qty){
        LineItem item = new LineItem(productId,qty, db);
        
        addItemToArray(lineItems, item);
    }
    private void addItemToArray(LineItem[] origArray, LineItem item){
        LineItem[] tempArray = new LineItem[origArray.length + 1];
       System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
       tempArray[tempArray.length - 1] = item;
       origArray = tempArray;
       lineItems = origArray;
    }
    
    public final void outputRecieptData(){     
      

        System.out.println("Customer Id:" + customer.getCustomerId()+ " Name:" +customer.getCustomerName() +
                "\nDate: " + "1/2/2016" + "\n" 
            + "Thank you for shopping at Kohls \n" 
            + "_______________________________________________________________________________________________________________________\n"
            + ID_HEADER + "        "+PRODUCT_NAME+"         "+COST+"       "+QTY+"        "+SUBTOTAL+"         "+DISCOUNT+"       "+TAX+"       "+DISCOUNT_TAX_SUBTOTAL+"  \n");
    
        double totalBeforeDiscountAndTax = 0;
        double totalAfterDiscountAndTax = 0;
       

        
        LineItem[] items = getLineItems();
        
        for(LineItem item : items){
            totalBeforeDiscountAndTax += item.getLineItemSubTotal();
            totalAfterDiscountAndTax += item.getLineItemTotal();
            
            System.out.println("   "+ item.getProduct().getProductId() + "           " 
                                    + item.getProduct().getProductName() + "       "
                                    + item.getProduct().getUnitCost() + "       " 
                                    + item.getQty() + "          " 
                                    + item.getLineItemSubTotal()+"            "
                                    + Math.round(item.getLineItemDiscount() * 100.0) / 100.0+ "           "
                                    + Math.round(item.getLineItemTax() * 100.0) / 100.0+"           "
                                    + Math.round(item.getLineItemTotal() * 100.0) / 100.0);
        }
        System.out.println("\n\n                "+TOTAL_BEFORE_DISCOUNT_AND_TAX);
        System.out.println("                "+totalBeforeDiscountAndTax);
        System.out.println("\n                "+TOTAL_AFTER_DISCOUNT_AND_TAX);
        System.out.println("                "+totalAfterDiscountAndTax);
    }

    public final DatabaseStrategy getDb() {
        return db;
    }

    public final void setDb(DatabaseStrategy db) {
        //Needs Validation
        this.db = db;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        //Needs Validation
        this.customer = customer;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        //Needs Validation
        this.lineItems = lineItems;
    }
    
}
