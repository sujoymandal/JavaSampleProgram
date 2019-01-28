package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/java/executables/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		/*
		 * https://www.quora.com/How-can-I-handle-a-Flipkart-login-window-by-
		 * Selenium-WebDriver Below step is to find password filed. But wait,
		 * here if you find element by class name you can see class name as
		 * “2zrpKA _3v41xv”. This wont work because there is a space between A
		 * and _. Selenium wont allow compound class name. So use xpath for the
		 * same as mentioned below
		 * 
		 */
		driver.findElement(By.className("_2zrpKA")).sendKeys("username");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("password");
		/*
		 * Now click on 'Sign In' button. But here also compound class name
		 * present. You cannot use findByClassName method. But remember one
		 * thing. Maximum all sign in pages are written as forms by UI
		 * developers. If it is form then no need to find element separately for
		 * login button. You can take any element in that form and use .submit()
		 * to submit the form. so i have taken username element again and submit
		 * using that
		 */
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		
		driver.findElement(By.className("_2zrpKA")).submit();

	}

}
