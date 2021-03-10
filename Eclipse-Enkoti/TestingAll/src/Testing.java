import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static WebDriver driver;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "//Users//ranjeethdidigum//Downloads//chromedriver"); 
		 * driver = new ChromeDriver();
		 * driver.get("https://www.filmibeat.com/celebs/vijay-kanakamedala.html");
		 */

		/*
		 * Hash Maps related questions to count the repetition of characters;
		 * 
		 * Date class in java;
		 * 
		 * program to convert one date format to other form
		 */

		Date date = new Date();

		String j = "This is my First Thing With HashMap";
		int count = 0;

		System.out.println(date);

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c = j.toCharArray();

		for (char j1 : c) {

			if (map.containsKey(j1)) {

				map.put(j1, map.get(j1)+1);
			} else {

				map.put(j1, 1);
			}

		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> traverse : map.entrySet()) {
			
			if(traverse.getValue() > 1) {
				System.out.println("The character is repeated  " +traverse.getKey() + "  " +traverse.getValue() +   "  times");
			}
			
			
		}

	}

}
