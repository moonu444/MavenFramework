package comm.test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleTest extends SetUp{
	
	@Test(priority = 1)
	public void ContElements() throws InterruptedException {
		WebElement accList = driver.findElement(By.xpath("//span[contains(text(),'Lists')]"));
		Actions act = new Actions(driver);
		act.moveToElement(accList).perform();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='nav-title']|//a[@class='nav-link nav-item']"));;
		 System.out.println(list.size()); 
		 for(int i=0; i<list.size(); i++) 
		 {
		 System.out.println(list.get(i).getText());
		 }
	}

	@Test(priority = 2)
	public void SelectDrop() throws InterruptedException {
		WebElement Search = driver.findElement(By.id("searchDropdownBox"));
		Select Sel = new Select(Search);

		Sel.selectByVisibleText("Girls' Fashion");
		System.out.println("Girls' Fashion");
		Thread.sleep(2000);
		Sel.selectByValue("search-alias=baby-products-intl-ship");
		System.out.println("Baby");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Huggies");
	}

}
