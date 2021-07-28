package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
public WebDriver driver;

public String url = "https://www.phptravels.net/home";
	
	@Test
	public void testOneDemo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Tours']")).click();
	
		driver.findElements(By.xpath("//span[@class=\"select2-chosen\"]")).get(5).click();
		Thread.sleep(1000);

		WebElement lwb = driver.findElement(By.xpath("//span[@class='select2-match']"));
		Select options = new Select(lwb);
		options.selectByVisibleText("Legoland Malaysia Day Pass");
		

		driver.findElement(By.id("tourtype_chosen")).click();
		Thread.sleep(1000);
		WebElement opt = driver.findElement(By.xpath("//li[@class='active-result']"));
		Select select = new Select(opt);
		select.selectByVisibleText("Yacht");
		
		driver.findElement(By.xpath("//form[@action='https://www.phptravels.net/tours/search']//input[@id='DateTours']")).clear();
		driver.findElement(By.xpath("//form[@action='https://www.phptravels.net/tours/search']//input[@id='DateTours']")).sendKeys("09/07/2021");
		driver.findElement(By.xpath("//form[contains(@action,'https://www.phptravels.net/tours/search')]//button[@type='button'][normalize-space()='+']")).click();
		driver.findElement(By.xpath("//form[@action='https://www.phptravels.net/tours/search']//button[@type='submit'][normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Book Now')]")).click();
		driver.findElements(By.xpath("//ul[@class='chosen-results']/li[@class='active-result']")).get(2).click();
				
//		driver.findElements(By.xpath("//span[contains(text(),'Search by Hotel or City Name')]")).get(0).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='First Name']")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//span[normalize-space()='Last Name']")).sendKeys("Islam");
		driver.findElement(By.xpath("//div[@class='col-md-6 col-12 o2']//span[contains(text(),'Email')]")).sendKeys("mmislam020409@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).sendKeys("mmislam020409@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Contact Number']")).sendKeys("01717237725");
		driver.findElement(By.xpath("//span[normalize-space()='Address']")).sendKeys("Adress");
		driver.findElement(By.xpath("//span[normalize-space()='Select Country']")).click();
		driver.findElement(By.xpath("//input[@class='chosen-search-input']")).sendKeys("Bangladesh");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='CONFIRM THIS BOOKING']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Pay on Arrival']")).click();
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='My Account']")).click();//a[normalize-space()='Sign Up']
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='First Name']")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//span[normalize-space()='Last Name']")).sendKeys("Islam");
		driver.findElement(By.xpath("//span[normalize-space()='Mobile Number']")).sendKeys("01717237725");
		driver.findElement(By.xpath("//span[normalize-space()='Email']")).sendKeys("mmislam020409@gmai.com");
		driver.findElement(By.xpath("//span[normalize-space()='Password']")).sendKeys("pw");
		driver.findElement(By.xpath("//span[normalize-space()='Confirm Password']")).sendKeys("pw");
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		
		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("m@m.com");
		driver.findElement(By.xpath("//button[normalize-space()='Subscribe']")).click();


		
		
		
	}
}
