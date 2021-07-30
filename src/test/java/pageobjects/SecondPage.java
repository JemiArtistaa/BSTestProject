package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	
	public WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

	
	public SecondPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	public void initiateBooking() {
		
//		js.executeScript("window.scrollBy(0,4500)");
		driver.findElement(By.xpath("//button[contains(text(),'Book Now')]")).click();	
	}
	
	
	
	public void enterUserInfo() {
		
//		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Islam");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mmislam020409@gmail.com");
		driver.findElement(By.xpath("//input[@name='confirmemail']")).sendKeys("mmislam020409@gmail.com");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("01717237725");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Adress");
		driver.findElement(By.xpath("//span[text()='Select Country']")).click();
		driver.findElement(By.xpath("//input[@class='chosen-search-input']")).sendKeys("Ban");
		driver.findElement(By.xpath("//input[@class='chosen-search-input']")).sendKeys(Keys.ENTER);
	}
	
	
	
	public void enterGuestInfo() {
		
		driver.findElement(By.xpath("//*[contains(text(),'Guest 1 Name')]")).sendKeys("guest1name");
		driver.findElement(By.name("passport[1][passportnumber]")).sendKeys("pass 1");
		driver.findElement(By.name("passport[1][age]")).sendKeys("35");
		driver.findElement(By.xpath("//*[contains(text(),'Guest 2 Name')]")).sendKeys("guest2name");
		driver.findElement(By.name("passport[1][passportnumber]")).sendKeys("pass 2");
		driver.findElement(By.name("passport[1][age]")).sendKeys("25");
	
	}
	

}
