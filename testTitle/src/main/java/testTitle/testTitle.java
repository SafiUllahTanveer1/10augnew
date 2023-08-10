package testTitle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		//options.addarguments("--remote-allow-origins-");
		ChromeDriver driver=new ChromeDriver(options);
		String baseUrl ="https://omayo.blogspot.in/";
		String expectedTitle = "omayo (QAfox.com)";
		driver.get(baseUrl);
		String actualTitle= driver.getTitle();
		System.out.print(actualTitle);
		if (actualTitle.equals(expectedTitle))
		{
			System.out.print("Test Passed");
		}
		else
		{
			System.out.print("Test failed");
		}
		driver.close();
		

	}

}
