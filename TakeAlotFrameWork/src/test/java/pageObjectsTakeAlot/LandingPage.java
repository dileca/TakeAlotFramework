package pageObjectsTakeAlot;

import org.openqa.selenium.By;

import frameWorkClasses.BasePage;

public class LandingPage extends BasePage {

	// METHOD: Navigate to Landing Page
	public boolean checkLandingPageNavigation() {
		return false;
		}
	
	// METHOD: Click Search for Products input box
	public void clickSearchBar() {
		clickElement(By.cssSelector("input[name='search']"));	
		}
	
	// METHOD: Click Search Button	
	public void clickSearchButton() {
		clickElement(By.cssSelector("button[type='submit']"));
		}
	
	// METHOD: Enter text in Search bar
	public void enterTextInSearchBar(String enterTextInSearchBar) {
		enterText(By.name("search"), enterTextInSearchBar);	
		}
	
	// METHOD: Check Element Text
	public String checkElementTextOfFirstItem() {
		String text1 = getElementText(By.cssSelector(
				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
		return text1;
		}
	
	public void clickElementTextOfFirstItem() {
		clickElement(By.cssSelector(
				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
	}
	
	public boolean checkFirstItem(String checkFirstItem) {
		return false;
	}
			
	public void searchItem(String selectItem) {	
	}
	
	public void checkSearchItem(String selectItem) {	
	}
	
		
}
