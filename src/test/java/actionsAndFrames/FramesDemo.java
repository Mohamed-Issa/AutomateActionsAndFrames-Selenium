package actionsAndFrames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		
		// driver.switchTo().frame(0);
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());	
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, target ).build().perform();
		
		driver.switchTo().defaultContent();
		

	}

}
