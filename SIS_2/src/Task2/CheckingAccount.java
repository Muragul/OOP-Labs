package Task2;

public class CheckingAccount extends Account{
	private double charge = 0.02;
	private int freeTransactions = 5;
	private int doneTransactions = 0;
	
	public CheckingAccount(int n) {
		super(n);
	}
	public void deductFee() {
		super.withdraw(charge);
	}
	public String toString() {
		return "\n"+super.toString()+", charge: "+charge+", free: "+freeTransactions+", done: "+doneTransactions;
	}
	@Override
	public void deposit(double sum) {
		if (this.freeTransactions<this.doneTransactions)
			deductFee();
		super.deposit(sum);
		this.doneTransactions++;
	}
	@Override   
	public void withdraw(double sum) {
		if (super.getBalance()!=0) {
			if (this.freeTransactions<this.doneTransactions)
				deductFee();
			super.withdraw(sum);
			this.doneTransactions++;
		} else
			throw new IllegalArgumentException("Balance is 0!");
	}
	@Override        
	public void transfer(double amount, Account other){
		if (super.getBalance()!=0) {
			other.deposit(amount);
			this.withdraw(amount);
		} else
			throw new IllegalArgumentException("Balance is 0!");
		if (this.freeTransactions<this.doneTransactions)
			deductFee();
		this.doneTransactions++;
	} 
	
	@Override
	public int hashCode() {
		int result = super.hashCode();
		result += 31 * result + freeTransactions;
		result += 31 * result + doneTransactions;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckingAccount other = (CheckingAccount) obj;
		if (freeTransactions != other.freeTransactions)
			return false;
		if (doneTransactions != other.doneTransactions)
			return false;
		return true;
	}



}
