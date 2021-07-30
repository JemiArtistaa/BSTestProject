package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;

	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(xpath="//a[normalize-space()='Tours']")
	 private WebElement tour;
	
	public void gotoTour() {
		tour.click();
	}
	
	
	
//	@FindBys(xpath="//span[@class='select2-chosen']").get(5)
//	 private WebElement destinationInputField;
	
	@FindBy(xpath="//div[contains(text(),'Legoland Malaysia Day Pass')]")
	 private WebElement destinationInputFieldS;
	
	public void selectTourDestination() {
		driver.findElements(By.xpath("//span[@class=\"select2-chosen\"]")).get(5).click();
		destinationInputFieldS.click();
	}
	
	
	
	@FindBy(id="tourtype_chosen")
	 private WebElement tourTypeField;
	
	@FindBy(xpath="//li[contains(text(),'Yacht')]")
	 private WebElement tourTypeFieldS;
	
	public void selectTourtype() {
		tourTypeField.click();
		tourTypeFieldS.click();
	}
	
	
	
	@FindBy(xpath = "//form[@action='https://www.phptravels.net/tours/search']//input[@id='DateTours']")
	private WebElement dateCalender;
	
	@FindBy(xpath = "//div[@class='datepicker -bottom-left- -from-bottom- active']//div[@class='datepicker--nav-title']")
	private WebElement monthYearVal;
	
	@FindBy(xpath = "//div[8]/div/div/div/div[10]")
	private WebElement dateField;
	
	public void setDate() {
		dateCalender.click();
		String valMonthYear = monthYearVal.getText();
		String month = valMonthYear.split(",")[0].trim();
     	String year = valMonthYear.split(",")[1].trim(); 
     	while (!(month.equals("September") && year.equals("2021"))) {
     		driver.findElement(By.xpath("//div[@class='datepicker -bottom-left- -from-bottom- active']//nav[@class='datepicker--nav']//div[3]//*[local-name()='svg']")).click();
         		valMonthYear = driver.findElement(By.xpath("//div[@class='datepicker -bottom-left- -from-bottom- active']//div[@class='datepicker--nav-title']")).getText();
         		month = valMonthYear.split(",")[0].trim();
         		year = valMonthYear.split(",")[1].trim();
		}  
     	dateField.click();
		
	}
	
	
	
	@FindBy(xpath = "//form[contains(@action,'https://www.phptravels.net/tours/search')]//button[@type='button'][normalize-space()='+']")
    private WebElement incrementButton;	
	
	public void selectNoOfPeple() {
		incrementButton.click();
	}
	
	
	
	@FindBy(xpath = "//form[@action='https://www.phptravels.net/tours/search']//button[@type='submit'][normalize-space()='Search']")
	private WebElement searchButton;
	
	public void clickSearch() {
		searchButton.click();
	}
	


}

