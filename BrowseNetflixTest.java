package com.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowseNetflixTest {//TestNG Test file
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	
	  WebDriver driver;

	  @BeforeMethod
	  public void setUp() {
	    driver = new ChromeDriver();
	  }

	  @Test
	  public void navigateToNetflixBrowsePage() {
	    driver.get("https://www.netflix.com/");
	    driver.findElement(By.linkText("Browse")).click();
	    Assert.assertEquals(driver.getCurrentUrl(), "https://www.netflix.com/browse");
	  }

	  @AfterMethod
	  public void tearDown() {
	    driver.quit();
	  }
	}


}
