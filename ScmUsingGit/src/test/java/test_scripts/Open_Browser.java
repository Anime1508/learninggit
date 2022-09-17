package test_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Open_Browser {
	@BeforeClass
	public void open_browser() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\MAVEN\\ScmUsingGit\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
	}
	
	@Test
	public void select() {
		
	}

}
