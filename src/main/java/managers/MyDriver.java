package managers;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;

public class MyDriver {
	private WebDriver driver;

	public MyDriver () throws MalformedURLException {
		ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getData("url"));
		driver.manage().window().maximize();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
