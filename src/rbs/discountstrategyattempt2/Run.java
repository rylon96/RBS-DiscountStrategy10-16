package rbs.discountstrategyattempt2;
public class Run {
    public static void main(String[] args) {
        //KLUDGE: Do Config here
        DatabaseStrategy db = new FakeDatabase();
        //Start Talking to Objects
        Register register = new Register(); 
        
        register.startNewSale("100", db);
        
        register.addItemToSale("001", 2);
        register.addItemToSale("002", 2);
        register.addItemToSale("003", 6);
        
        
        register.endSale();
                    
        }
        

        
    }
