package Task1;

public class Series extends Circuit {
	Circuit a;
	Circuit b;
	public Series(Circuit a, Circuit b) {
		this.r = a.getResistance()+b.getResistance();
		this.a = a;
		this.b = b;
	}
	public double getResistance() {
		return r;
	}
	public double getPotentialDifference() {
		return pottentialDifference;
	}
	public void applyPotentialDifference(double V) {
		this.pottentialDifference = V;
		a.applyPotentialDifference(super.getCurrent()*a.r);
		b.applyPotentialDifference(super.getCurrent()*b.r);
	}

}
