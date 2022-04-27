package actionsAndFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a")).click();

		System.out.println(driver.getTitle());

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> iterators = ids.iterator();
		String parentID = iterators.next();
		System.out.println(parentID);
		String childID = iterators.next();
		System.out.println(childID);
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);

	}

}
