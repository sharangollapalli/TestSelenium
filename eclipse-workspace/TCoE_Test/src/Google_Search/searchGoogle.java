package Google_Search;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
public class searchGoogle {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\d896482\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://widefeas-uat.ebpm.cloud.corp.telstra.com/prweb/SSO/Nzun5MJBi16FpHtSR51uh0o2JhDGnj1csO6t_wuCgzQ%5B*/!STANDARD?pyActivity=Embed-PortalLayout.RedirectAndRun&ThreadName=OpenPortal&Location=pyActivity%3DData-Portal.ShowSelectedPortal%26portal%3DWideFeasCaseWorker%26Name%3D%20WideFeasCaseWorker%26pzSkinName%3D%26developer%3Dfalse%26ThreadName%3DOpenPortal%26launchPortal%3Dtrue&bPurgeTargetThread=true&target=popup&pzHarnessID=HID109FDCFEE7A481D39A4BF17B3C99D9B6";
        String expectedTitle = "";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        driver.manage().window().maximize();
        
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
                       
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        //driver.close();
        //driver.findElement(By.name("q")).sendKeys("Learn Selenium");
        driver.findElement(By.className("pzbtn-img")).click();
        driver.findElement(By.xpath("//*[@id=\"/contextMenu/ID1561446451296000\"]")).click();
    }

}

