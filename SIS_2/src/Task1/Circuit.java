package Task1;

public abstract class Circuit {
	public double r;
	public double pottentialDifference ;
	public abstract double getResistance();
	public abstract double getPotentialDifference();  
	public abstract void applyPotentialDifference(double V);
	public double getPower()
	{
		return (pottentialDifference*pottentialDifference)/r;
	}
	public double getCurrent() { 
		return pottentialDifference/r;
	}

}	
