
public class ImmediateBiggerNumber {
	
	public static void main(String[] args) {
		
		
		int j = 345,k,rev=0;
		
		while(j>0) {
			
			k = j%10;
			rev = rev * 10 + k;
			j =j/10;
		}
		System.out.println(rev);
	}

}
