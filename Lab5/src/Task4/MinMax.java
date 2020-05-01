package Task4;

public class MinMax {
	static class InnerClass {
		int [] array;
		int min,max;
		InnerClass(int [] array) {
			this.array = array;
			min = array[0];
			max = array[0];
			findMinMax();
		}
		void findMinMax() {
			for (int i=0;i<array.length;i++) {
				if (min>array[i])min = array[i];
				if (max<array[i])max = array[i];
			}
		}
		public String toString() {
			return min+"\n"+max;
		}
	}
	
	static InnerClass minmax(int [] array) {
		InnerClass ic = new InnerClass(array); 
		return 	ic;
	}

}
