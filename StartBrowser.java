package Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class StartBrowser {
	
	private static AndroidDriver driver;

	@Test
	public void test() throws MalformedURLException {
		
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");
		capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Custom Phone -4.3");
		capabilities.setCapability(MobileCapabilityType.VERSION, "6.0");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver = new AndroidDriver(url, capabilities);
		driver.get("http://www.facebook.com");
		System.out.println("Title " + driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("mukesh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("mukesh_selenium");
		driver.findElement(By.id("u_0_5")).click();
		driver.quit();
	}
	

}
