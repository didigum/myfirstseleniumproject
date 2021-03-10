import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "//Users//ranjeethdidigum//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		Actions action = new Actions(driver);

		WebElement enterAmountBox = driver.findElement(By.xpath("(//li[@class ='placeholder'])[2]"));
		
		//ol[@class = 'field14 ui-droppable ui-sortable']/li

		WebElement DebitFiveThousandAmount = driver.findElement(
				By.xpath("(//a[@class ='button button-orange'])[2]"));
		
		Thread.sleep(6000);

//		Actions builder = 
		
		action.clickAndHold(DebitFiveThousandAmount);
		
		action.release(enterAmountBox).build().perform();

	}

}
