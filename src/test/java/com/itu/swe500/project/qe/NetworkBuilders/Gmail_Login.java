package com.itu.swe500.project.qe.NetworkBuilders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {
/**

	* @param args
 * @throws InterruptedException 

	*/
	
	       public static void main(String[] args) throws InterruptedException {
	
	              
	
	// objects and variables instantiation
	
	    	   System.setProperty("webdriver.chrome.driver", "/Library/chromedriver");
	           WebDriver driver = new ChromeDriver();
	
	              String appUrl = "http://localhost/itunetworkbuilders-ui";
	
	              
	Thread.sleep(15000);
	// launch the Chrome browser and open the application url
	
	              driver.get(appUrl);
	
	              
	
	// maximize the browser window
	
	              driver.manage().window().maximize();
	
	              
	
	// declare and initialize the variable to store the expected title of the webpage.
	
	              String expectedTitle = "Network Builders";
	
	              

	// fetch the title of the web page and save it into a string variable
	
	              String actualTitle = driver.getTitle();
	              System.out.println(actualTitle);
	              
	
	// compare the expected title of the page with the actual title of the page and print the result
	
	              if (expectedTitle.equals(actualTitle))
	
	              {
	
	                     System.out.println("Verification Successful - The correct title is displayed on the web page.");
	
	              }
	
	             else
	
	              {
	
	                     System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
	
	              }
	
	 
	
	// enter a valid username in the email textbox
	
	              WebElement username = driver.findElement(By.name("username"));
	
	              username.clear();
	
	              username.sendKeys("admin");
	
//	              WebElement NextButton = driver.findElement(By.id("next"));
//	          	
//	              NextButton.click();
	
	// enter a valid password in the password textbox
	              Thread.sleep(1500);
	              
	              WebElement password = driver.findElement(By.name("password"));
	
	              password.clear();
	
	              password.sendKeys("admin");
	
	              
	
	// click on the Sign in button
	
	              WebElement SignInButton = driver.findElement(By.id("btn-login"));
	
	              SignInButton.click();
	
	              Thread.sleep(15000);
	
	
	              
	              WebElement logout = driver.findElement(By.partialLinkText("Log Out"));
	              logout.click();
	              
	              WebElement RegisterButton = driver.findElement(By.id("btn-login"));
	              RegisterButton.click();
	              
	              Thread.sleep(15000);
	              
	// close the web browser
	              driver.close();
	
	              System.out.println("Test script executed successfully.");
	
	              
	
	// terminate the program
	
	              System.exit(0);
	
	       }
	

}
