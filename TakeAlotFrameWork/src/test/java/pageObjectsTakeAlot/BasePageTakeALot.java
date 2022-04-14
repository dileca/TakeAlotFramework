package pageObjectsTakeAlot;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import frameWorkClasses.BasePage;

public class BasePageTakeALot extends BasePage {

	// METHOD; Navigate to Home Page
	public void navigateToHomePage() {
		driver.get("https://www.takealot.com/");
		waitForUrl(30, "takealot");
	}
	
	// METHOD; Click Cookies Button
	public void clickCookiesButton() {
	String cookiesButton = ".button.cookies-banner-module_dismiss-button_24Z98";
		if(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cookiesButton)) != null) 
		clickElement(By.cssSelector(cookiesButton));
		}

	// METHOD; Click Survey Button
	public void clickSurveyButton() {
		if(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("_hj-1X9Q4__styles__surveyTitle")) != null) 
		clickElement(By.cssSelector("_hj-1X9Q4__styles__surveyTitle"));
			}	
	}
	
	
	

