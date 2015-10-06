package com.itu.swe500.project.qe.NetworkBuilders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestScript {

	public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "/Library/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://newtours.demoaut.com";
//        Thread.sleep(15000);
        String expectedTitle = "Welcome: Mercury Tours";
//        Thread.sleep(15000);
        String actualTitle = "";
//        Thread.sleep(15000);
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        Thread.sleep(15000);
        // get the actual value of the title
        actualTitle = driver.getTitle();
        Thread.sleep(15000);
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        //close Chrome
        driver.close();
        
        // exit the program explicitly
        System.exit(0);
    }
 
}
