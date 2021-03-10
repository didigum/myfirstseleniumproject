
public class MergeSort {
	
	public static void main(String[] args) {
		
		 int a[] = { 3,5,7,2,4,5,1,6,12,4,6};
		
		
		sort(a,0,a.length-1);
		merge();
		
		
		
	}

	 static void merge() {
		
	}

	 static void sort(int[] c,int beggin,int last) {
		
		int midNum = (beggin+last)/2;
		
		int l = (midNum - beggin) + 1;  
		int r = last - midNum;
		
		int leftArr[] = new int[15];
		int RightArr[] = new int[15];
		
		for(int i=0;i<l;i++) {
			leftArr[i] = c[beggin+i];
		}
		
		for(int i=0;i<l;i++) {
			RightArr[i] = c[midNum+1+i];
		}
		
		ThreadLocal driver = new ThreadLocal<>();
	}

}
