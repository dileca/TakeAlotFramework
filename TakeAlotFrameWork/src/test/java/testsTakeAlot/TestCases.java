package testsTakeAlot;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectsTakeAlot.BasePageTakeALot;
import pageObjectsTakeAlot.CartPage;
import pageObjectsTakeAlot.CheckOutPage;
import pageObjectsTakeAlot.FirstItemReturnPage;
import pageObjectsTakeAlot.LandingPage;
import pageObjectsTakeAlot.LogInPage;
import pageObjectsTakeAlot.ResultReturnPage;

public class TestCases {
	
	// Instantiate the Landing Page class
	LandingPage landPG = new LandingPage();
	CartPage cartPG = new CartPage();
	LogInPage logPG = new LogInPage();
	ResultReturnPage resultPG = new ResultReturnPage();
	BasePageTakeALot basePageTA= new BasePageTakeALot();
	CheckOutPage checkOutPG = new CheckOutPage();
	FirstItemReturnPage firstItemPG = new FirstItemReturnPage();
	
	
	@BeforeTest
	public void setUp1() {
	basePageTA.clickCookiesButton();
	}
	
	//@BeforeTest
	public void setUp2() {
	basePageTA.clickSurveyButton(); 
	}
	
	
		// Search DKNY
		
		// Navigate to Landing Page
		
		// Ensure Cart is empty
	
		// Click Search for Products input box
		
		// Search for DKNY Product
			
		// Click Search Button
			
		// Select Item	
			
		// Add to Cart	
			
		// Navigate to Cart
			
		// Verify selected item in Cart	
	
	
		
		// GIVEN
		//		Shopper is on the Landing Page
		// WHEN
		//		He enters "DKNY" as the search string
		// AND
		// 		He clicks the Search button	
		//	 THEN
		//		"DKNY EDT 30ml" is displayed as the first item on the grid	
		
		// GIVEN_ShopperOnLandingPage_WHEN_enterDKNYAsSearhString_THEN_DKNY30mlDisplayedAsFirstItem() {
		//	landPG.checkLandingPageNavigation();
		//	landPG.searchItem("DKNY");
		//	landPG.clickSearchButton();
		//	landPG.checkSearchItem("DKNY EDT 30ml");
		

	@Test
		public void GIVEN_ShopperOnLandingPage_WHEN_enterDKNYAsSearhString_THEN_DKNY30mlDisplayedAsFirstItem() {
		basePageTA.navigateToHomePage();
		landPG.clickSearchBar();
		landPG.enterTextInSearchBar("DKNY");			
		landPG.clickSearchButton();
		resultPG.clickFirstElement();
		firstItemPG.checkElementText();
		
		}
			// GIVEN
			//		Shopper has added item to Shopping Cart
			// WHEN
			//		He clicks the Remove Button 
			//	 THEN
			//		"Your shopping cart is empty" returns	
			
			// GIVEN_ShopperAddedItemToShopingCart_WHEN_clicksRemoveButton_THEN_YourShoppingCartIsEmptyReturns() {
			//	cartPG.checkCartPageNavigation();
			// cartPG.checkCartPageItems();
			//	cartPG.clicksRemoveButton();
			//	cartPG.checkEmptyCartMessage();
			
	//		@Test
	//		public void GIVEN_ShopperAddedItemToShopingCart_WHEN_clicksRemoveButton_THEN_YourShoppingCartIsEmptyReturns() {
		
				/*2
				* GIVEN the shopper is on the landing page
				* WHEN he enters "DKNY" as the search string
				* WHEN clicks the search button
				* THEN "DKNY" is displayed as the first item in the grid
				*/
				
				// GIVEN_ShopperOnLandingPage_WHEN_enterDKNYAsSearhString_THEN_DKNY30mlDisplayedAsFirstItem() {
				//	landingPG.checkLandingPageNavigation();
				//	landingPG.searchItem("DKNY");
				//	landingPG.clickSearchButton();
				//	landingPG.checkSearchItem("DKNY EDT 30ml");
		
		//   HOMEWORK		
		@Test
		public void GIVEN_ShopperOnLandingPage_WHEN_enterHunterBootsAsSearhString_THEN_HunterRefinedTallBlackRWBLogoDisplayedAsFirstItem() {
		basePageTA.navigateToHomePage();
		landPG.clickSearchBar();
		landPG.enterTextInSearchBar("Hunter Boots");
		landPG.clickSearchButton();
		resultPG.clickFirstElement();		
		}
				
				
				
				
				
				
	}
			

