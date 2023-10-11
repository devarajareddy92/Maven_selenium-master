package MAVEN.MAven;

import org.openqa.selenium.chrome.ChromeDriver; 

public class Geek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty( 
	            "webdriver.chrome.driver", 
	            "C:\\Users\\DeepanshuS\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
	  
        ChromeDriver driver = new ChromeDriver(); 
  
        // Maximize the browser 
        // using maximize() method 
        driver.manage().window().maximize(); 
	  
        // Launching website 
        driver.get("https://www.geeksforgeeks.org/");
        System.out.println("Printed successfully");

	}

}
