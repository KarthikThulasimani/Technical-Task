//Write code for handling multiple windows
package org.codoid.test;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Multiple Windows Handling\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		WebElement iphone12 = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[1]"));
		iphone12.click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		 for (String eachId: allWindow) {
			 if (!eachId.equals(parentId)) {
				 driver.switchTo().window(eachId);
			    
				}
				
			}			 
	     }
	}
