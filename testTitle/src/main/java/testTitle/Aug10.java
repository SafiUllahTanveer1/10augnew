package testTitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aug10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeOptions options =new ChromeOptions();
				//options.addarguments("--remote-allow-origins-");
				ChromeDriver driver=new ChromeDriver(options);
				String baseUrl ="https://omayo.blogspot.in/";
				String expectedTitle = "omayo (QAfox.com)";
				driver.get(baseUrl);
				WebElement input_text_field = driver.findElement(By.xpath("//textarea[@id='ta1']"));
				input_text_field.clear();
				String user_input_text_field="Safi";
				input_text_field.sendKeys(user_input_text_field);
				String gettext=input_text_field.getAttribute("value");
			
				if (gettext.equals(user_input_text_field))
				{
					System.out.print("test passed");
				}
				else
				{
					System.out.print("test failed");
				}
				WebElement second_input_text_field = driver.findElement(By.xpath("//div[@id='HTML11']//div[@class='widget-content']//textarea"));
				second_input_text_field.clear();
				second_input_text_field.sendKeys(user_input_text_field);
				String gettext2=second_input_text_field.getAttribute("value");
				
				if (gettext2.equals(user_input_text_field))
				{
					System.out.print("test passed");
				}
				else
				{
					System.out.print("test failed");
				}
				WebElement table = driver.findElement(By.xpath("//table[contains(@id,'table')]/thead"));
				
				

	}

}
