package Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectsProducts.MyStoreHomePage;

import Resources.Base;
import junit.framework.Assert;

public class ValidateMyStore extends Base{
	
	File myObj = new File(System.getProperty("user.dir")+"\\reports\\FinalProductResult.txt");
	
	
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	public MyStoreHomePage mystore;
	public Base base;
	SoftAssert as=new SoftAssert();
	

	Actions act;
	@BeforeTest
	public void initialize() throws IOException
	{
		
		driver=initilizeDriver();
		driver.get(URL);
		log.info("Driver is initialized successfully");
		
	}
	@Test
	public void clickOnSignin() throws IOException
	{
		mystore=new MyStoreHomePage(driver);
		mystore.getSignin().click();
		log.info(" User is able to click on SignIn button successfully");
	
		
	}
	//@Test(dataProvider="getData",priority=1)
	@Test(priority=1)
	//public void login(String userId,String password)
	public void login()
	{
		
		mystore.getUserId().sendKeys(userId);
		mystore.getPassword().sendKeys(password);
		mystore.getSigninButton().click();
		log.info(" User is able SignIn  successfully");
	}
	/*@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="jetblue@grr.la";
		data[0][1]="jetblue";
		return data;
	}*/
	@Test(priority=2)
	public void ProductSelection()
	
	{
		
		List<WebElement> productsName=mystore.getElemetns();
		for(WebElement productName:productsName)
		{
		
			if(productName.getText().equalsIgnoreCase("T-SHIRTS"))
			
				
				productName.click();
		}
		act=new Actions(driver);
		act.moveToElement(mystore.getProduct()).doubleClick().build().perform();
		log.info(" Product selected successfully");
		
	}
	@Test(priority=3)
	public void productAddToCart() throws IOException
	{
		
		mystore.getAddToCart().click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(mystore.getProductToCheckOutmsg()));
		as.assertEquals(mystore.getProductMsg().getText(), "Product successfully added to your shopping cart");
		@SuppressWarnings("resource")
		 BufferedWriter wr = new BufferedWriter(new FileWriter(myObj));
	   
		String finalResult=mystore.getFinalProductName().getText()+System.lineSeparator()+mystore.getProductOfColour().getText()+System.lineSeparator()+
				mystore.getQuantityLabel().getText()+" "+mystore.getQuantityValue().getText()+System.lineSeparator()+mystore.getTotalLabel().getText()+" "+mystore.getTotalValue().getText();
		//System.out.println(finalResult);
		wr.write(finalResult);
		wr.close();
		mystore.getProductToCheckOut().click();
		log.info(" Product added to cart successfully");
		
		as.assertAll();
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		log.info("Driver closed successfully");
	}

}
