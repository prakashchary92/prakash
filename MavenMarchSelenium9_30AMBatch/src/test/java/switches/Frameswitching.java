package switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frameswitching 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praka\\Desktop\\selenium Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("java.applet")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.findElement(By.linkText("Applet")).click();

	}

}
