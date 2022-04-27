package actionsAndFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();

		driver.get("https://www.amazon.eg/");

		Actions action = new Actions(driver);
		
		WebElement move = driver.findElement(By.cssSelector("span[id ='nav-link-accountList-nav-line-1']"));
		
		
		//Move to specific element
		action.moveToElement(move).build().perform();
		
		//action.moveToElement(move).contextClick().build().perform();

		action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

	}

}
