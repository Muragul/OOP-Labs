
public class StarTriangle {
	public String a = "[*]";
	public String b = "\n";
	public String s="";
	public int width;
	
	public StarTriangle() {};
	
	public StarTriangle(int width) {
		this.width = width;
	}
	
    public String toString() {
    	for (int i=1;i<=width;i++) {
    		for (int j=1;j<=i;j++) {
    			s+=a;
    		}
			s+=b;
    	}
		return s;
	}

}

//Узнала что можно делать не через массив, а строку.
//Удивило что можно добавить в строку элемент \n и он будет делать перенос