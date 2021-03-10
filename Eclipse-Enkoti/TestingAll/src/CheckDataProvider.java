import org.testng.annotations.Test;

public class CheckDataProvider {
	
	DataProvider data;

	
	@org.testng.annotations.DataProvider
	public void getData()  {
		
		//Object[][] data = data.length;
		//return data;
	}
	
	@Test(dataProvider = "getData")
	public void printCheck(String title, String firstName, String lastName, String Email ) {
		
		System.out.println(title +" "+lastName + " " + Email);
		
	}
		
}
