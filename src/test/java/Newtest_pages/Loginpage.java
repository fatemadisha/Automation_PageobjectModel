package Newtest_pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Newtest_driver.PageDriver;
import Newtest_utilities.Commonmethods;

public class Loginpage extends Commonmethods{
	public Loginpage() {

		// 1. pagefactory init
		// 2. locators
		//3. function
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}

	@FindBys({

			// can use multiple xpath for same place in page object model
			//@FindBy(xpath = "//input[@name = 'username']"),
			//@FindBy(xpath = "//input[@placeholder='Username'])"),
			@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")

	})
	WebElement userName;

	@FindBys({ 
		@FindBy(xpath = "//input[@name = 'password']"), 
		@FindBy(xpath = "//input[@placeholder = 'Password']"),
		@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]") })

	WebElement Password;

	@FindBys({ @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]") })

	WebElement Button;

	public void login() throws InterruptedException {
		timeout(5000);
	  
	  //username
	  try {
		  if(userName.isDisplayed()) {
			  userName.sendKeys("Admin");
			  timeout();
	  }
	  }
	  catch(Exception e){
		  System.out.println(e);
	  }

	// password
	try

	{
		if (Password.isDisplayed()) {
			Password.sendKeys("admin123");
			timeout();
		}
	}
	catch(Exception e){
		System.out.println(e);
	}

	// Login button
	try{
		if(Button.isDisplayed()){
			Button.click();
			timeout(5000);
			}
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
	
  

