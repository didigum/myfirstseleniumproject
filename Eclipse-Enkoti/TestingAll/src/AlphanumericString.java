
public class AlphanumericString {

	
	public static void main(String[] args) {
		
		
		 String s = "This09 Is Alph5u3";
		 int alphabets =0,numbers =0;
		 
		 char comp[] = s.toCharArray();
		 
		 for(int i =0;i<comp.length;i++) {
			 
			 if(comp[i] >= 'a' && comp[i]<='z' || comp[i] >= 'A' && comp[i]<='Z') {
				 alphabets++;
				 
			 }else if(comp[i] >= '0' && comp[i] <= '9') {
				 numbers++;
			 }
		 }
		 
		 System.out.println("The number of Alphabets " +alphabets +"  and the num  "+numbers);
	}
}
