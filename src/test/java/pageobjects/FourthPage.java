package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FourthPage {
	
	public WebDriver driver;
//    JavascriptExecutor js = (JavascriptExecutor) driver;

	
	public FourthPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	
	public void confirmPayOnArrial() throws InterruptedException {
	    driver.findElement(By.xpath("//button[text()='Pay on Arrival']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	
	
	public void AttemptSignup() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()=' My Account                  ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
	}
	
	
	public void completeSignUp() {
//		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Islam");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("01717237725");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mmislam020409@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rNfza6DhywfGHsq");
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("rNfza6DhywfGHsq");
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
	}
	
	
	public void newsletterSubscription(){
		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("m@m.com");
		driver.findElement(By.xpath("//button[normalize-space()='Subscribe']")).click();
	}

}
