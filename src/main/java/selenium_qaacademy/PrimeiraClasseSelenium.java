package selenium_qaacademy;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasseSelenium {
	
	@Test
	public void testelogin() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.br/");
		
	}
	

}
