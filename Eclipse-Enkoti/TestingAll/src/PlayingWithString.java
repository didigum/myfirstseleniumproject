import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PlayingWithString {

	@Test(priority = 1)
	@Parameters("original")
	public void loweringString(String actual) {
		String s = actual;

		String original = s.toLowerCase();
		System.out.println(original);
	}

	@Test(priority = 2)
	@Parameters("original")
	public void lengthString(String actual) {
		String s = actual;

		int original = s.length();
		System.out.println(original);
	}

	@Test(priority = 3)
	@Parameters("original")
	public void reverseString(String actual) {
		String s = actual, temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
			// System.out.println(temp);
		}
		System.out.println(temp);
	}

	@Test(priority = 4)
	@Parameters("original")
	public void concatString(String actual) {
		String s = actual, k = "seetha is my friend", temp = "";
		String newString = s.concat(k);
		System.out.println(newString);
	}

	@Test(priority = 5)
	@Parameters("original")
	public void splitString(String actual) {
		String s = actual, k = "seetha is my friend", temp = "";
		String[] splitString = k.split(" ");

		for (int i = 0; i < splitString.length; i++) {
			System.out.println(splitString[i]);
		}
	}

	@Test(priority = 6)
	@Parameters("original")
	public void subString(String actual) {
		String s = actual, k = "seetha is my friend", temp = "";
		
		System.out.println(k.substring(3));
		System.out.println(k.substring(0, 2));
		
	}
	
	@Test(priority = 7)
	@Parameters("original")
	public void trimString(String actual) {
		String s = actual, k = "se etha is my friend", temp = "";
		
		System.out.println(k.trim());
	
		
	}

}
