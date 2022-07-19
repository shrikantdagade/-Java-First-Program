package encapsulation;

public class Account {
    private double accountBalance=4567.12;
   
    
    public double getbalance(int accno) {
    	return accountBalance;
    }
    public void setbalance(double val) {
    	this.accountBalance+=val;
    }
    }
   
