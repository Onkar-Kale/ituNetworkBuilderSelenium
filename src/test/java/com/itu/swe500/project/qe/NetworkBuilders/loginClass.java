package com.itu.swe500.project.qe.NetworkBuilders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginClass {
public String baseURL = "http://localhost/itunetworkbuilders-ui";
public WebDriver driver = new ChromeDriver(); 
public String expectedTitle = null;
public String actualTitle = null;

@BeforeTest
public void launchBrowser(){
	driver.get(baseURL);
}
@BeforeMethod
public void verifyLogins(){
	expectedTitle="Network Builders";
	actualTitle=driver.getTitle();
	Assert.assertEquals(actualTitle,expectedTitle);
}





}