package org.grouping;


import org.dataprovider.DataSet;

//import javax.servlet.Registration;

import org.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import org.utility.BaseClass;



public class Facebook extends BaseClass{

	@BeforeClass
	public static void beforeClass() {
		browserLaunch("chrome");
		//urlLaunch("https://www.facebook.com");
		maximize();
		implicitWait(10);
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Parameters({"username","password"})
	@Test(dataProvider="login", dataProviderClass=DataSet.class)
	public void test1(String param1, String param2) {
		LoginPage lp = new LoginPage();
		urlLaunch("https://www.facebook.com");
		String urltext = currentURL();
		boolean urlcontains = urltext.contains("facebook");
		//SoftAssert s = new SoftAssert();
		//s.assertTrue(urlcontains,"Verify URL");
		//Assert.assertTrue("Verify URL", currentURL().contains("flipkart")); //made into single line
		
		sendKeys(lp.getTxtusername().get(0), param1);
		//s.assertEquals(getAttribute(lp.getTxtusername().get(0)),"Sujatha1","Verify username");		
		sendKeys(lp.getTxtpass(), param2);
		//s.assertEquals(getAttribute(lp.getTxtpass()),"1234suja","Verify password");
		clickBtn(lp.getBtnlogin());
		//s.assertAll();
		System.out.println("Test1 from Facebook class");
	}
	
	
	/*@Test
	public void test2() {
		RegisterPage rs = new RegisterPage();
		clickBtn(rs.getBtnaccount());
		sendKeys(rs.getFirstname(), "sujatha");
		sendKeys(rs.getTxtlastname(), "p");
		sendKeys(rs.getTxtemail(), "gg@gmail.com");
		clickBtn(rs.getSubmitBtn());
		System.out.println("Test2");
	}*/
}

