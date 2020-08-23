//package stepDefinitions;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//public class LoginStep {
//	final String apkPath = "E:\\Appium_POC_specs\\pocappv1.0.apk";
//	final int defaultTimeout = 7;
//	AppiumDriver<MobileElement> driver;
//	public WebDriverWait wait = null;
//
//	@Given("^Access the url link$")
//	public void User_Enters_Application_Url() throws MalformedURLException {
//		String path = System.getProperty("user.dir");
//		System.out.println(path);
//
//		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//
//		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "96b836");
//		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
//		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//		desiredCapabilities.setCapability("appPackage", "tsel.www.myapplication");
//		desiredCapabilities.setCapability("appActivity", "tsel.www.myapplication.MainActivity");
////		desiredCapabilities.setCapability(MobileCapabilityType.APP, apkPath);
//		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
//		wait = new WebDriverWait(driver, defaultTimeout);
//		String platformName = desiredCapabilities.getBrowserName();
//		String platformVersion = desiredCapabilities.getVersion();
//		System.out.println(platformName + " " + platformVersion);
//	}
//
//	@When("^User enters the login details$")
//	public void User_enters_login_details() throws InterruptedException {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tsel.www.myapplication:id/server")));
//		driver.findElementById("tsel.www.myapplication:id/server").sendKeys("itbsjabartsel.com");
//		driver.findElementById("tsel.www.myapplication:id/username").sendKeys("haniffaj");
//		driver.findElementById("tsel.www.myapplication:id/password").sendKeys("password");
//		driver.findElementById("tsel.www.myapplication:id/loginbtn").click();
//	}
//
//	@When("^User enters the wrong login details$")
//	public void User_enters_wrong_login_details() throws InterruptedException {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tsel.www.myapplication:id/server")));
//		driver.findElementById("tsel.www.myapplication:id/server").sendKeys("itbsjabartsel.com");
//		driver.findElementById("tsel.www.myapplication:id/username").sendKeys("admin");
//		driver.findElementById("tsel.www.myapplication:id/password").sendKeys("pass");
//		driver.findElementById("tsel.www.myapplication:id/loginbtn").click();
//	}
//
//	@Then("^User will be redirected back to login page$")
//	public void User_In_login_Page() throws InterruptedException {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tsel.www.myapplication:id/loginbtn")));
//		String activityView = driver.findElementById("tsel.www.myapplication:id/loginbtn").getText();
//		Assert.assertEquals("Login", activityView);
//	}
//
//	@Then("^User will( not | )get an error message \"(.*)\"$")
//	public void User_Will_Get_Error_Message(String falseCase, String errorMsg) {
//		String activityView = null;
//		if (falseCase.trim().equals("not")) {
//			wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(
//					driver.findElementById("tsel.www.myapplication:id/textError"), errorMsg)));
//			if (driver.findElementsById("tsel.www.myapplication:id/textError").size() != 0) {
//				activityView = driver.findElementById("tsel.www.myapplication:id/textError").getText();
//				Assert.assertNotEquals("Expected: '" + errorMsg + "' | Actual: '" + activityView + "'", errorMsg,
//						activityView);
//			}
//		} else {
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tsel.www.myapplication:id/textError")));
//			activityView = driver.findElementById("tsel.www.myapplication:id/textError").getText();
//			Assert.assertEquals("Expected: '" + errorMsg + "' | Actual: '" + activityView + "'", errorMsg,
//					activityView);
//		}
//	}
//
//	@Then("^User will be able to see Home Page$")
//	public void User_In_Home_Page() throws InterruptedException {
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"ITQA FRAME WORK\"]")));
//		Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text=\"ITQA FRAME WORK\"]").getText(),
//				"ITQA FRAME WORK");
//	}
//
//	@Then("^Access menu profile$")
//	public void Access_menu_profile() throws InterruptedException {
//		wait.until(
//				ExpectedConditions.visibilityOfElementLocated(By.id("tsel.www.myapplication:id/navigation_profiles")));
//		driver.findElementById("tsel.www.myapplication:id/navigation_profiles").click();
//	}
//
//	@Then("^Logout from the application$")
//	public void Logout_from_the_application() throws InterruptedException {
//		wait.until(ExpectedConditions.visibilityOf(driver.findElementById("tsel.www.myapplication:id/logout")));
//		driver.findElementById("tsel.www.myapplication:id/logout").click();
//	}
//
//}
