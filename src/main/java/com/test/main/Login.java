package com.test.main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login 
{
	//private final Logger logge=Logger.getLogger(Login.class.getName());
  @Test
public void SetUp()
{
	System.setProperty("webdriver.gecko.driver", "E:\\Neon3project\\main\\geckodriver.exe");
	//logge.info("Browser lunch");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	String title = driver.getTitle();
     System.out.println(title);	
}
}
