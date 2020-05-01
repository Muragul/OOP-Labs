package Task2;

public class SavingsAccount extends Account{
	private double rate = 0.05;
	
	public SavingsAccount (int n) {
		super(n);
	}
	public void setInterest(double rate) {
		this.rate = rate;
	}
	public void addInterestRate() {
		double sum = super.getBalance()*rate;
		super.deposit(sum);
	}
	public double getInterestRate() {
		return rate;
	}	
	public String toString() {
		return "\n"+super.toString()+", rate: "+rate;
	}
	@Override
	public int hashCode() {
		int result = super.hashCode();
		long temp = Double.doubleToLongBits(rate);
		result += 31 * temp;
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
		SavingsAccount other = (SavingsAccount) obj;
		if (Double.doubleToLongBits(rate) != Double.doubleToLongBits(other.rate))
			return false;
		return true;
	}


}
