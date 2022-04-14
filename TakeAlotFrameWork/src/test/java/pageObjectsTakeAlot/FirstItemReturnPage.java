package pageObjectsTakeAlot;

import org.openqa.selenium.By;

import frameWorkClasses.BasePage;

public class FirstItemReturnPage extends BasePage {

	// public boolean checkFirstItem(String checkFirstItem) {
	//		return false
	
	public String checkElementText() {
		String text1 = getElementText(By.cssSelector("div:nth-of-type(1) > .grid.search-product .product-card-module_brand-wrapper_Kv3Cy > a > span"));
		return text1;
		}
	
	
}
