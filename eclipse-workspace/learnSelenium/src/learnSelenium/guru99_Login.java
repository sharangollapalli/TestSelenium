package learnSelenium;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\d896482\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String guruURL = "http://demo.guru99.com/V4/index.php";
		driver.get(guruURL);
		driver.manage().window().maximize();
		
		login(driver);
		newCustomer(driver);
		custRegistrationMessage(driver);
		/*
		driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]")).sendKeys("mngr204994");
		driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]")).sendKeys("UdEgYhY");
		driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)")).click();
		driver.findElement(By.cssSelector("body > div:nth-child(9) > div > ul > li:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]")).sendKeys("Brian Lara");
		//if (driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)")).isSelected());
		//{
			driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("12/12/1975");
			driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea")).sendKeys("10 Glenhuntly Road, Carnegie, 3163");
			driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]")).sendKeys("Melbourne");
			driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]")).sendKeys("Victoria");
			driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]")).sendKeys("3000");
			driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]")).sendKeys("0400000010");
			driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]")).sendKeys("selenium@testemail.com");
			driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]")).sendKeys("testselenium");
			driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)")).click();
		//} else {
			//driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)")).click();
		//
		 * }
		 */
	}
	public static void login(WebDriver driver) {
		
		driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]")).sendKeys("mngr204994");
		driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]")).sendKeys("mngr204994");
		driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]")).sendKeys("UdEgYhY");
		driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)")).click();
		driver.findElement(By.cssSelector("body > div:nth-child(9) > div > ul > li:nth-child(2) > a")).click();
	}
	public static void newCustomer(WebDriver driver) {

		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]")).sendKeys("Brian Lara");
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("12/12/1975");
		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea")).sendKeys("10 Glenhuntly");
		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]")).sendKeys("Melbourne");
		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]")).sendKeys("Victoria");
		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]")).sendKeys("517501");
		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]")).sendKeys("0400000010");
		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]")).sendKeys("selenium1@testemail.com");
		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]")).sendKeys("seltest");
		driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)")).click();
		
	}
	public static void custRegistrationMessage(WebDriver driver) {
		String successMessage = "Customer Registered Successfully!!!";
		String regMessage = driver.findElement(By.cssSelector("#customer > tbody > tr:nth-child(1) > td > p")).getText();
		if (regMessage.contentEquals(successMessage)) {
			String CustId = driver.findElement(By.cssSelector("#customer > tbody > tr:nth-child(4) > td:nth-child(2)")).getText();
			System.out.println(CustId);
			driver.findElement(By.cssSelector("#customer > tbody > tr:nth-child(14) > td > a")).click();
		}
	}

}
