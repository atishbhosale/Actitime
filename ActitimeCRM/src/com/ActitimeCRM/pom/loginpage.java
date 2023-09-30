package com.ActitimeCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	 //decleration
		@FindBy(id="username")
		private WebElement untbx;
		
		@FindBy(name="pwd")
		private WebElement pwtbx;
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement lgbtn;
		
		//initialisation
		
		public loginpage(WebDriver d) {
			PageFactory.initElements(d,this);
		}

		//utilisation
		public WebElement getUntbx() {
			return untbx;
		}

		public WebElement getPwtbx() {
			return pwtbx;
		}

		public WebElement getLgbtn() {
			return lgbtn;
		}
		
}
