package ConfigurationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ConfigReader;

public class ChromeTest {
	ConfigReader config;
	@BeforeTest
	public void setup()
	{
		config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getchromepath());
		System.out.println("============SetupReady=============");
	}
	@Test
	public void test1()
	{
		System.out.println("============TestStarted=============");
		WebDriver driver=new ChromeDriver();
		driver.get(config.getappURl());
		driver.quit();
		System.out.println("============TestClosed=============");
		
	}

}
