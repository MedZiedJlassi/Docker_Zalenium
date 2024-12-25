package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ExecuteTestZaleniumFirefox2 {

	@Test
	public void test1() throws MalformedURLException, InterruptedException {
		System.out.println("Thread which is running " +Thread.currentThread());
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"),cap);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
//		driver.quit();
	}
}
