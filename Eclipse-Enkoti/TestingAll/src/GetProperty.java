
public class GetProperty {
	
	static int i;
	
	static { 
         i = 10; 
        System.out.println("static block called "); 
    } 
	
	public static void seetha() {
		System.out.println(System.getProperty("user.dir"));
	}
	
	public static void main(String[] args) {
		System.out.println(GetProperty.i);
		seetha();
		
	}

}
