package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.FourthPage;
import pageobjects.HomePage;
import pageobjects.SecondPage;
import pageobjects.ThirdPage;

public class FirstTest {
	
public WebDriver driver;

public String url = "https://www.phptravels.net/home";
	
	@Test
	public void testOneDemo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		
		HomePage homepage = new HomePage(driver);
		homepage.gotoTour();
		homepage.selectTourDestination();
		homepage.selectTourtype();
		homepage.setDate();
		homepage.selectNoOfPeple();
		homepage.clickSearch();
		
		
		SecondPage secondpage = new SecondPage(driver);
		js.executeScript("window.scrollBy(0,4500)");
	    secondpage.initiateBooking();
	    
	    
	    ThirdPage thirdpage = new ThirdPage(driver);
		js.executeScript("window.scrollBy(0,500)");
	    thirdpage.enterUserInfo();
//	    thirdpage.enterGuestInfo();
		js.executeScript("window.scrollBy(0,1500)");
	    thirdpage.confirmBooking();
	    
	    
	    FourthPage fourthpage = new FourthPage(driver);
	    fourthpage.confirmPayOnArrial();
	    fourthpage.AttemptSignup();
		js.executeScript("window.scrollBy(0,200)");
		fourthpage.completeSignUp();
	    fourthpage.newsletterSubscription();
		
		
		

//		driver.findElement(By.xpath("//a[normalize-space()='Tours']")).click();	
//		driver.findElements(By.xpath("//span[@class=\"select2-chosen\"]")).get(5).click();
//		driver.findElement(By.xpath("//div[contains(text(),'Legoland Malaysia Day Pass')]")).click();
//		driver.findElement(By.id("tourtype_chosen")).click();
//		driver.findElement(By.xpath("//li[contains(text(),'Yacht')]")).click();
//     	driver.findElement(By.xpath("//form[@action='https://www.phptravels.net/tours/search']//input[@id='DateTours']")).click();
//     	
//     	String valMonthYear = driver.findElement(By.xpath("//div[@class='datepicker -bottom-left- -from-bottom- active']//div[@class='datepicker--nav-title']")).getText();
//     	String month = valMonthYear.split(",")[0].trim();
//     	String year = valMonthYear.split(",")[1].trim();   	
//
//     	while (!(month.equals("September") && year.equals("2021"))) {
//     		driver.findElement(By.xpath("//div[@class='datepicker -bottom-left- -from-bottom- active']//nav[@class='datepicker--nav']//div[3]//*[local-name()='svg']")).click();
//         		valMonthYear = driver.findElement(By.xpath("//div[@class='datepicker -bottom-left- -from-bottom- active']//div[@class='datepicker--nav-title']")).getText();
//         		month = valMonthYear.split(",")[0].trim();
//         		year = valMonthYear.split(",")[1].trim();
//		}   	
//     	driver.findElement(By.xpath("//div[8]/div/div/div/div[10]")).click();
//		driver.findElement(By.xpath("//form[contains(@action,'https://www.phptravels.net/tours/search')]//button[@type='button'][normalize-space()='+']")).click();
//		driver.findElement(By.xpath("//form[@action='https://www.phptravels.net/tours/search']//button[@type='submit'][normalize-space()='Search']")).click();
		
		
//		js.executeScript("window.scrollBy(0,4500)");
//		driver.findElement(By.xpath("//button[contains(text(),'Book Now')]")).click();	
//		js.executeScript("window.scrollBy(0,500)");
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mohammad");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Islam");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mmislam020409@gmail.com");
//		driver.findElement(By.xpath("//input[@name='confirmemail']")).sendKeys("mmislam020409@gmail.com");
//		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("01717237725");
//		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Adress");
//		driver.findElement(By.xpath("//span[text()='Select Country']")).click();
//		driver.findElement(By.xpath("//input[@class='chosen-search-input']")).sendKeys("Ban");
//		driver.findElement(By.xpath("//input[@class='chosen-search-input']")).sendKeys(Keys.ENTER);
		
	    
//		driver.findElement(By.xpath("//*[contains(text(),'Guest 1 Name')]")).sendKeys("guest1name");
//		driver.findElement(By.name("passport[1][passportnumber]")).sendKeys("pass 1");
//		driver.findElement(By.name("passport[1][age]")).sendKeys("35");
//		driver.findElement(By.xpath("//*[contains(text(),'Guest 2 Name')]")).sendKeys("guest2name");
//		driver.findElement(By.name("passport[1][passportnumber]")).sendKeys("pass 2");
//		driver.findElement(By.name("passport[1][age]")).sendKeys("25");

	    
//		js.executeScript("window.scrollBy(0,1500)");
//		driver.findElement(By.xpath("//button[text()='CONFIRM THIS BOOKING']")).click();
		
	    
//	    driver.findElement(By.xpath("//button[text()='Pay on Arrival']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
	    
	    
//		driver.findElement(By.xpath("//a[text()=' My Account                  ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Sign Up")).click();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,200)");
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mohammad");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Islam");
//		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("01717237725");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mmislam020409@gmail.com");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rNfza6DhywfGHsq");
//		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("rNfza6DhywfGHsq");
//		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
//		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("m@m.com");
//		driver.findElement(By.xpath("//button[normalize-space()='Subscribe']")).click();

		
	}
}
