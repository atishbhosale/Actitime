package com.ActitimeCRM.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class taskpage {
	
@FindBy(xpath = "//div[.='Add New']")
private WebElement addnewcust;
 
@FindBy(xpath = "//div[.='+ New Customer']")
private WebElement newcust;

@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement custname;

@FindBy()
}
