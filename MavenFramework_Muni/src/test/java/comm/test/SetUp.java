package comm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {
	WebDriver driver;

	@BeforeClass()
	public void Initilization() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	@AfterClass()
	public void CleanUp() {
		driver.quit();
	}

}
