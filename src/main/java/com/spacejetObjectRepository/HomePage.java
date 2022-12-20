package com.spacejetObjectRepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	@FindBy(xpath="//div[text()='round trip']/../..//*[name()='svg']")
	private WebElement round_tripRadioButton;
	
	@FindBy(xpath="//div[text()='From']/..//input")
	private WebElement From_Locatin;
	
	@FindBy(xpath="//div[text()='To']/..//input")
	private WebElement selectDestination_Locatin;
	
	@FindBy(xpath="//div[text()='Departure Date']/..//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
	private WebElement departurecalenderButton;
	
	@FindBy(xpath="//div[@data-testid='undefined-month-November-2022']/div[3]/div[5]/div[3]")
	private WebElement departureselectDate;
	
	@FindBy(xpath="//div[text()='Select Date']/..//*[name()='svg']")
	private WebElement returnDateButton;
	
	@FindBy(xpath="//div[@data-testid='undefined-month-December-2022']/div[3]/div[2]/div[6]")
	private WebElement returnselectDate;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnRound_tripRadioButton()
	{
		round_tripRadioButton.click();
	}
	public void selectFrom_Locatin(String location)
	{
		From_Locatin.sendKeys(location);
		
	}
	public void selectDestination_Locatin(String destinationlocation)
	{
		selectDestination_Locatin.sendKeys(destinationlocation);
		
	}
	public void clickOnDepartureCalender()
	{
		departurecalenderButton.click();
		
	}
	public void selectDepartureDate()
	{
		departureselectDate.click();
	}
	public void clickOnreturnDateButton()
	{
		returnDateButton.click();
		
	}
	public void selectreturnDate()
	{
		returnselectDate.click();
	}
}
