package comm.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHovering extends SetUp {
	@Test
	public void Hovering() throws InterruptedException {

		WebElement accList = driver.findElement(By.xpath("//span[contains(text(),'Lists')]"));
		Actions act = new Actions(driver);
		act.moveToElement(accList).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		System.out.println(driver.getTitle());

	}	

}
