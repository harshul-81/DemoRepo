package tests;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;
import utilities.Xls_Reader;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	WebDriver driver;
	LoginPage lp = new LoginPage();
	DataFile df = new DataFile();
			
			
			
	
	
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	 lp.openBrowser();
	 lp.openYahoo();
  } 

  @AfterMethod
  public void afterMethod() {
	  lp.closeBrowser();
	  
  }
  
  @Test
  public void LoginwithWrongPassword() throws InterruptedException {
	  	lp.enterEmail(df.correctEmail);
	  	lp.enterPassword(df.wrongPassword);
		Assert.assertEquals(lp.readPasswordError(), df.passwordErrMsg);
	  
  }
  
  @Test
  public void LoginWrongEmailTest() throws InterruptedException {
	lp.enterEmail(df.wrongEmail);   
		String expectedErrMsg =(df.emailErrMsg);
		String actualErrMsg = lp.readEmailError();
		System.out.println(actualErrMsg);
		
		Assert.assertEquals(actualErrMsg, expectedErrMsg );	
  

}
}