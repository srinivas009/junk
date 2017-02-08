package autmationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fourth {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.0.1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.msn.co.in");
		driver.wait(10000);
		driver.close();
	}

}

