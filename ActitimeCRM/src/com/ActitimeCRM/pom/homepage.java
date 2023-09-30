package com.ActitimeCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	//deceleration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasktab;

	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportstab;
	
	@FindBy(xpath = "//div[.='Users']" )
	private WebElement usertab;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutlink;
	
	//initialisation
	
	public homepage(WebDriver d) 
	{
		PageFactory.initElements(d,this);
	}
	
	//utilisation

	public WebElement getTasktab() {
		return tasktab;
	}

	public WebElement getReportstab() {
		return reportstab;
	}

	public WebElement getUsertab() {
		return usertab;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	
	
}
