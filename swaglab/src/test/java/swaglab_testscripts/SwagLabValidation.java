package swaglab_testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import swaglab_webpages.CheckoutCompletePage;
import swaglab_webpages.CheckoutStepOnePage;
import swaglab_webpages.CheckoutStepTwoPage;
import swaglab_webpages.SwagLabCartPage;
import swaglab_webpages.SwagLabHomePage;
import swaglab_webpages.SwagLabLoginPage;
import utilities.SeleniumUtility;


public class SwagLabValidation extends SeleniumUtility{
	
	SwagLabLoginPage getSwagLabLoginPage;
	SwagLabHomePage getSwagLabHomePage;
	SwagLabCartPage getSwagLabCartPage;
	CheckoutStepOnePage getCheckoutStepOnePage;
	CheckoutStepTwoPage getCheckoutStepTwoPage;
	CheckoutCompletePage getCheckoutCompletePage;
	
	@BeforeTest
	public void precondition()
	{
		driver=setUp("chrome", "https://www.saucedemo.com/");
		getSwagLabLoginPage=new SwagLabLoginPage(driver);
		getSwagLabHomePage =new SwagLabHomePage(driver);
		getSwagLabCartPage =new SwagLabCartPage(driver);
		getCheckoutStepOnePage = new CheckoutStepOnePage(driver);
		getCheckoutStepTwoPage=new CheckoutStepTwoPage(driver);
		getCheckoutCompletePage=new CheckoutCompletePage(driver);
		
	}
	
	@Test(priority=1)
	public void testLoginLogout()
	{
		getSwagLabLoginPage.LoginSwagLab("standard_user", "secret_sauce");
		//getSwagLabHomePage.addToCart();
		getSwagLabHomePage.logoutfromapplication();
		String expUrl="https://www.saucedemo.com/";
		String actUrl=getCurrentUrlOfApplication();
		Assert.assertEquals(actUrl,expUrl,"LoginLogOut Unsuccessful or URL CHANGED!");
	}
	
	@Test(priority=2)
	public void testShoppingOnSwagLab()
	{
		getSwagLabLoginPage.LoginSwagLab("standard_user", "secret_sauce");
		
		//getSwagLabHomePage.addToCart();
		getSwagLabCartPage.performCheckout();
		getCheckoutStepOnePage.enterDetailsForCheckout("SIDDHI", "HANDE", "410504");
		getCheckoutStepTwoPage.purchasedHistory();
		getCheckoutCompletePage.validateThankYouMsg();
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		getSwagLabHomePage.logoutfromapplication();
		cleanUp();
	}
	
	

}

