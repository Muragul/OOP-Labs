
public class Temperature {
	public double degree;
	public char scale;
	     
	public Temperature() {
		this.degree = 0;
		this.scale = 'C';
	}
	public Temperature(double degree) {
		this.degree = degree;
		this.scale = 'C';
	}
	public Temperature(char scale) {
		this.degree = 0;
		this.scale = scale;
	}
	public Temperature(double degree, char scale) {
		this.degree = degree;
		this.scale = scale;		
	}
	
	public double degreeC() {
		if (scale=='C')return degree;
		return ((degree-32)*5)/9;
	}
	public double degreeF() {
		if (scale=='F')return degree;
		return ((degree/5)*9)+32;
	}
	public void setDegree(double degree) {
		this.degree = degree;
	}
	public void setScale(char scale) {
		this.scale = scale;
	}
	public void setTemperature(double degree, char scale) {
		this.degree = degree;
		this.scale = scale;
	}
	public char getScale() {
		return scale;
	}
}
//в основном поняла как работать с конструкторами, геттерами и сеттерами