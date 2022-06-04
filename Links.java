package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Link.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
			System.out.println(AllLinks.size());
			WebElement firstLink = AllLinks.get(0);
			firstLink.click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			List<WebElement> AllLinks1 = driver.findElements(By.tagName("a"));
			System.out.println(AllLinks1.size());
			System.out.println(AllLinks1.get(2).getAttribute("href"));
			
			
			
			
	}

}
