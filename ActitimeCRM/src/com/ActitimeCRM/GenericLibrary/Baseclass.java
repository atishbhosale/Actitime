package com.ActitimeCRM.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ActitimeCRM.pom.loginpage;

public class Baseclass {
public WebDriver d;
filelibrary f = new filelibrary();
   @BeforeSuite
   public void databaseconnection()
   {
	   Reporter.log("database connected",true);
   }

   @BeforeClass
   public void launchbrowser() throws IOException 
   {
	   d = new ChromeDriver();
	   d.manage().window().maximize();
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   String link = f.readdatafrompropertyfile("url");
	   d.get(link);
	   Reporter.log("browser launched succcessfully",true);
   }
   
   @BeforeMethod
   public void logintoactitime() throws IOException 
   {
	   loginpage lp = new loginpage(d);
	  String un = f.readdatafrompropertyfile("username");
	  lp.getUntbx().sendKeys(un);
	  String pas = f.readdatafrompropertyfile("passsword");
	  lp.getPwtbx().sendKeys(pas);
	  lp.getLgbtn().click();
	   Reporter.log("loged successfully",true);
   }
   
   @AfterMethod
   public void logoutfromactitime() 
   {
	   d.findElement(By.id("logoutLink")).click();
	   Reporter.log("logged out successfully",true);
   }
   
   @AfterClass
   public void closebrowser() 
   {
	   d.close();
	   Reporter.log("close browser successfully",true);
   }
   
   @AfterSuite
   public void closedatabse() 
   {
	   
   }
}
