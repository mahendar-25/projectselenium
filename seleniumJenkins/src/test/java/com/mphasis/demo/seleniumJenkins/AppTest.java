package com.mphasis.demo.seleniumJenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private WebDriver driver;
	private String url;
	private String expectedTitle;
	
	@BeforeEach
	public void before() {
		System.setProperty("webdriver.chrome.driver", "D:////chromedriver////chromedriver.exe");
		driver=new ChromeDriver();
		url="https://www.google.com";
		expectedTitle="Google";
		driver.navigate().to(url);
	}
	@Test
    public void shouldTitleMatch()
    {
    	String actualtitle=driver.getTitle();
        assertEquals(actualtitle, expectedTitle);
    }
    @AfterEach
    public void closeBrowser() {
    	driver.close();
    }
}
