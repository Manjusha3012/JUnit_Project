package various_Elements;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Locators {



		WebDriver driver;

		@Before
		public void launchBrowser1() {
			// create object and set property
			System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
					
			
			driver = new ChromeDriver();

			// set url
			driver.get("https://objectspy.space/");

			// set maximize
			driver.manage().window().maximize();

			// delete cookies
			driver.manage().deleteAllCookies();

			// define wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Before Test");
		
		}

		@Test
		public void learnElementLocators1() throws InterruptedException {

			driver.findElement(By.name("firstname")).sendKeys("Selenium");

			// upload file if you have input Tag
			// If we do not have input tag other than that we have use Robot class

			driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\Manjusha Jaiswal\\Downloads\\Reservation.pdf");

			System.out.println("Test done");
			
		//	driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//	Thread.sleep(6000);
			
		//	driver.navigate().back();

		//	driver.findElement(By.partialLinkText("TF-API")).click();

		//	driver.findElement(By.partialLinkText("Product")).click();

			driver.findElement(By.cssSelector("input#sex-0")).click();

			driver.findElement(By.cssSelector("input[value='3']")).click();

			driver.findElement(By.cssSelector("input[value='3']")).click();

		//	driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Selenium is fun");

			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selenium is fun");

			driver.findElement(By.xpath("//input[@name='tool'and @ value='Selenium Webdriver' and @id ='tool-2']")).click();
					

		//	driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();

			driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]")).click();
            
			
			
		}

		@After
		public void tearDown1() {
			System.out.println("After Test");
			driver.close();
			driver.quit();
	
		}
		
		
		
		

	}


