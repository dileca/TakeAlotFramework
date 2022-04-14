package frameWorkClasses;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	// Declare the WebDriver
	public static WebDriver driver; 
		
	//	Constructor of the Base Class	- Check if our Driver has been started
	public BasePage() {
	if (driver == null) {
		//Set Parameter values
		//String browser = getDataConfigPropeties("browser");
		//String URL = getDataConfigPropeties("systemUnderTest");
		//String pdriverDir = getDataConfigPropeties("driverdir");
		String browser = "chrome";
		String URL = "https://www.takealot.com/";
		String pdriverDir = "/Users/dianaleca/Applications/";
		
		// Verify parameter passed as "chrome"
		if (browser.equalsIgnoreCase("chrome")) {
		//Set path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver", pdriverDir + "chromedriver");
		//create an instance of chrome
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		// String pdriverDirFireFox = getDataConfirgPropeties("driverdirFirefox");
		else if (browser.equalsIgnoreCase("firefox")) {
			//Set path to geckodriver.exe
			System.setProperty("webdriver.gecko.driver", pdriverDir+"geckodriver.exe");
			//create an instance of firefox
			driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		
		// System.setProperty("webdriver.edge.driver",pdriverDir+"MicrosoftWebDriver.exe");
		else if (browser.equalsIgnoreCase("edge")) {
			//Set path to MicrosoftWebDriver.exe
			System.setProperty("webdriver.edge.driver",pdriverDir+"MicrosoftWebDriver.exe");
			//create an instance of edge
			driver = new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			}
			}
		
	// METHOD: Set the Browser and the URL	
	
	// METHOD: Read the Config	
	
	// METHOD: Wait for URL
	public void waitForUrl(int elementWait, String urlContains) {
		WebDriverWait wait = new WebDriverWait(driver, elementWait);
		wait.until(ExpectedConditions.urlContains(urlContains));
		}
	
	// METHOD: Wait for Click
	public void waitforClick(int elementWait, By pLocator) {
		WebDriverWait wait = new WebDriverWait(driver, elementWait);
		wait.until(ExpectedConditions.elementToBeClickable(pLocator));
		}
	
	// METHOD: Wait for Element
	public void waitForElement(int elementWait, By pLocator) {
		WebDriverWait wait = new WebDriverWait(driver, elementWait);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pLocator));
		}
	
	// METHOD: Get Element
	public WebElement getElement(By pLococator) {
		waitforClick(30, pLococator);
		return driver.findElement(pLococator);
		}
	
	// METHOD: Get  Element Text
	public String getElementText(By pLocator) {
		String elementText = getElement(pLocator).getText();
		return elementText ;
		}
	
	// 	METHOD: Verify Element exists
	
	// METHOD: Click Element
	public void clickElement(By pLocator) {
		waitforClick(30, pLocator);
		getElement(pLocator).click();
		}
	
		// METHOD: Click Search for Products input box
		public void clickSearchBar() {
			
		}
	
	
		// METHOD: Clean up
	
		// METHOD: Enter text
		public void enterText(By pLocator, String enterText) {
			waitforClick(30, pLocator);
			driver.findElement(pLocator).sendKeys(enterText);
		}

		
		
		// METHOD: Clear text
	
		// METHOD: Select from drop-down
	
		// METHOD: Get text on 
	
		// METHOD: Switch Window
		public void switchToNewTab() {
		Set<String> handles = driver.getWindowHandles(); 
		// Selenium will check how many windows are currently open.
		// This will store the ID for both parent and child window
		Iterator<String> it = handles.iterator(); 
		// Using the it object you can access the ID
		String parentWindowID = it.next();
		String childWindowID = it.next();
		// Switch to new window by passing the ID of the child window
		driver.switchTo().window(childWindowID); 
		}
	
		// METHOD: Switch to Parent
		public void switchToParent() {
			Set<String> handles = driver.getWindowHandles(); 
			Iterator<String> it = handles.iterator(); 
			String parentWindowID = it.next();
			String childWindowID = it.next();
			// Switch to new window by passing the ID of the parent window
			driver.switchTo().window(parentWindowID); 
			}
}
