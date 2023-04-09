//4.Write code for handling Frames
package org.codoid.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FramesHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Frames Handling\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("__ccpaLocator");
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@src='https://2743f1e075a6bbc099cfb5cda8416608.safeframe.googlesyndication.com/safeframe/1-0-40/html/container.html'])[1]"));
	    driver.switchTo().frame(iframe);
	    WebElement image = driver.findElement(By.xpath("//img[@src='https://demo.guru99.com/images/java-logo.png']"));
	    image.click();
	}

}
