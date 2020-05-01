package Task1;

public class Resistor extends Circuit {
	public Resistor(double r) {
		this.r = r;
	}
	
	public double getResistance() {
		return r;
	} 
	
	public double getPotentialDifference() {
		pottentialDifference=super.getCurrent()*r;
		return pottentialDifference;
	}

	public void applyPotentialDifference(double V) {
		pottentialDifference = V;
	}

}
