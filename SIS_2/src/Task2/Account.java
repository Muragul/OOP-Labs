package Task2;

public class Account {  
	private double balance;
	private int accNumber; 
	public Account() {};
	public Account(int a)  {       
		balance=0.0;    
		accNumber=a;  
	}    
	public void deposit(double sum) {this.balance+=sum;}    
	public void withdraw(double sum) {this.balance-=sum;}    
	public double getBalance(){return balance;}    
	public double getAccountNumber(){return accNumber;}        
	public void transfer(double amount, Account other){
		if (this.getBalance()!=0) {
			other.deposit(amount);
			this.withdraw(amount);
		} else
			throw new IllegalArgumentException("Balance is 0!");	
	} 
	
	public String toString() {
		return "\n Account: "+accNumber+", balance: "+balance;
	}    
	public final void print() {
		System.out.println( toString() );
	}
	
	@Override
	public int hashCode() {
		int result = 31 + 17 * accNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accNumber != other.accNumber)
			return false;
		return true;
	}

}