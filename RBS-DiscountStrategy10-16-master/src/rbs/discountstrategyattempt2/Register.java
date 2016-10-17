package rbs.discountstrategyattempt2;
public class Register {
    private Receipt receipt;
    private String storeName;
    
    public final void startNewSale(String customerId, DatabaseStrategy db){
        //needs validation
        receipt = new Receipt(customerId, db);
    }
    
    public final void endSale(){
        //printer.printReceipt();
        receipt.outputRecieptData();
    }
    
    public final  void addItemToSale(String productId, int qty){
        receipt.addItemToReceipt(productId, qty);
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        //Needs validation
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName)throws NullPointerException {
        if(storeName.isEmpty() || storeName == null){
            throw new NullPointerException("Cannot be empty or Null");
        }
        this.storeName = storeName;
    }
    
    
    
}
