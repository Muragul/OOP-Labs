package Task4;

public class Sort {
    @SuppressWarnings("hiding")
	static <Object> void swap(Object [] array, int i, int j) {
    	Object c = array [i];
    	array[i] = array [j];
    	array[j] = c;
    }
    @SuppressWarnings("hiding")
	static <Object extends Comparable<Object>> void bubbleSort(Object [] array) {
    	for (int i=0;i<array.length;i++) {
    		for (int j=0; j<array.length;j++)
    			if (array[i].compareTo(array[j])==-1)swap(array, i, j);
    	}
    }
    
    @SuppressWarnings("hiding")
	static <Object extends Comparable<Object>> void QuickSort(Object[]a, int l, int r){
        int i=l;
        int j=r;
        Object p = a[(l+r)/2];
        while (i<j){
            while (a[i].compareTo(p)==1)i++;
            while (a[j].compareTo(p)==-1)j--;
            if (i<=j){
                swap(a, i, j);
                i++;
                j--;
            }
        }
        if (l<j) QuickSort(a,l,j);
        if (i<r) QuickSort(a,i,r);
    }
   

}
