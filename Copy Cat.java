package wishkarma;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLogin 
{
	public String baseurl = "https://genesisprefab.com/";
	public WebDriver driver;
	@BeforeTest
	public void SetBaseURL() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Libs\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		Thread.sleep(4000);
		Screenshot("A");
		
	}
	@Test(priority = 0)
		public void VerifyHomePageTitle() throws InterruptedException
		{
			String expectedTitle = "GENESIS PREFAB INFRASTRUCTURES";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.findElement(By.className("x-el x-el-input px_-bc-rgb255__255__255 px_-border-color-rgb218__218__218 px_-c-rgb71__71__71 px_-fs-12 px_-fw-400 px_-border-width-1px px_-w-100P px_-ff-Quicksand__sans-serif px_-border-radius-4px px_-pt-23px px_-pb-8px px_-pl-10px px_-pr-10px px_-border-style-solid px___placeholder-c-rgba71__71__71__0p7 px__focus-outline-none px__focus_PL_label-fs-12px px__focus_PL_label-top-8px px__focus_PL_label-c-rgb121__109__102 px___-webkit-input-placeholder-c-rgba71__71__71__0p7 px__-ms-input-placeholder-c-rgba71__71__71__0p7 _mdpx_-fs-14 _lgpx_-fs-14 x-d-ux x-d-aid")).click();
			driver.findElement(By.className("x-el x-el-input px_-bc-rgb255__255__255 px_-border-color-rgb218__218__218 px_-c-rgb71__71__71 px_-fs-12 px_-fw-400 px_-border-width-1px px_-w-100P px_-ff-Quicksand__sans-serif px_-border-radius-4px px_-pt-23px px_-pb-8px px_-pl-10px px_-pr-10px px_-border-style-solid px___placeholder-c-rgba71__71__71__0p7 px__focus-outline-none px__focus_PL_label-fs-12px px__focus_PL_label-top-8px px__focus_PL_label-c-rgb121__109__102 px___-webkit-input-placeholder-c-rgba71__71__71__0p7 px__-ms-input-placeholder-c-rgba71__71__71__0p7 _mdpx_-fs-14 _lgpx_-fs-14 x-d-ux x-d-aid")).sendKeys("Ravi Shastri");
		}
		
/*	@Test(priority=1)
	public void ComposeMail(){
		WebElement CM=driver.findElement(By.xpath("//*[text()='COMPOSE'] "));
		CM.click();
		
		
		
	}
	@Test(priority=2, dependsOnMethods = {"VerifyHomePageTitle","ComposeMail"})
	public void SendMail(){
		driver.findElement(By.xpath("//*[@id=':mf']")).sendKeys("ravishastrimonsterindia@gmail.com");
	}
	
		@AfterTest
		public void endsession()
		{
			//driver.quit();
		}*/
		
		public void Screenshot(String string) throws IOException
		{
			File screenshotFile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("F:\\screenshots.png"));
			
		
		}
		}
		

