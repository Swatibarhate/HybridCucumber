import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//here it checks the webelement is there
		System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
		//here it comes back out of the frame
		driver.switchTo().defaultContent();
		//here back i am clicking another link
		driver.findElement(By.linkText("Droppable")).click();
		driver.close();

	}

}
