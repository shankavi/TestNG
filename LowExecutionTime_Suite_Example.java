package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LowExecutionTime_Suite_Example {

	WebDriver driver; //declare 'WebDriver',start time , end time variable  globally
	long startTime;
	long endTime;
	
	//Aim 3 : minimize the execution Time
	
		//Aim 3
		@BeforeSuite // First activity (suite means collection of test cases)
		public void LaunchBrowser() {
			
			 startTime = System.currentTimeMillis();//currentTimeMillis() get system start time & end time in milisec format
			System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver_ver88\\chromedriver.exe");	//set the crome driver
			
			 driver = new ChromeDriver();//here this driver declaration gives an error
			//(becase WebDriver declare as Local variable) 
			//solution -> that's why we declare 'WebDriver' globally 
			
		}
		
		@Test
		public void OpenGoogle() {
			//add selenium functions here and calculate the each an every methods execution time
					
			driver.get("https://www.google.com");
				
		}
		
		@Test
		public void OpenBing() {
			
			
			driver.get("https://www.bing.com");
			
			
		}
		
		@Test
		public void OpenYahoo() {
				
			driver.get("https://www.yahoo.com");
				
		}
		/*Based on the alphabetical execution
		 * PASSED: OpenBing (1)
		PASSED: OpenGoogle (2)
		ASSED: OpenYahoo (3)

		 * */
		//Aim3
		@AfterSuite//Last activity , calculate the end time and total execution time
		public void CloseBrowser() {
			driver.quit();
			 endTime = System.currentTimeMillis();
			
			long total_time = endTime-startTime; //Aim2
			System.out.println("Google Execution Total Time Taken is : "+total_time);
		}
		
		//Execution time based on internet speed as well
}
