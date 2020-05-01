package Task1;

public class Parallel extends Circuit {
	Circuit a;
	Circuit b;
	public Parallel(Circuit a, Circuit b) {
		double r1 = a.getResistance();
		double r2 = b.getResistance();
		this.r = (r1*r2)/(r1+r2);
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
		a.applyPotentialDifference(pottentialDifference);
		b.applyPotentialDifference(pottentialDifference);
	}

}
