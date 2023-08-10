package testTitle;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InpurQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		//options.addarguments("--remote-allow-origins-");
		ChromeDriver driver=new ChromeDriver(options);
		String baseUrl ="https://omayo.blogspot.in/";
		String expectedTitle = "omayo (QAfox.com)";
		driver.get(baseUrl);
		WebElement input_text_field = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		input_text_field.sendKeys("My name is Khan and I am not a terrorist");
		WebElement second_input_text_field = driver.findElement(By.xpath("//div[@id='HTML11']//div[@class='widget-content']//textarea"));
		second_input_text_field.getText();
		String getted_text= second_input_text_field.getText().toString();
		System.out.print(getted_text);
		second_input_text_field.clear();
		second_input_text_field.sendKeys("I'm a soldier born to die");
		WebElement username_text_field = driver.findElement(By.xpath("//div[@class='widget-content']//form[@name='form1']//input[@type='text']"));
		username_text_field.sendKeys("SAFI");
		WebElement password_text_field = driver.findElement(By.xpath("//form[@name='form1']//input[@type='password']"));
		password_text_field.sendKeys("SAFI");
		WebElement Login1= driver.findElement(By.xpath("//form[@name='form1']//button[@value='LogIn']"));
		Login1.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe1");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe2");
		driver.switchTo().defaultContent();
		WebElement login_text_field = driver.findElement(By.xpath("//form[@name='login']//input[@name='userid']"));
		login_text_field.sendKeys("hgjgj");		WebElement pswrd_text_field = driver.findElement(By.xpath("//form[@name='login']//input[@name='pswrd']"));
		pswrd_text_field.sendKeys("dgdfg");
		WebElement Login2= driver.findElement(By.xpath("//form[@name='login']//input[@value='Login']"));
		Login2.click();
		driver.switchTo().alert().accept();
		WebElement Cancel= driver.findElement(By.xpath("//form[@name='login']//input[@value='Cancel']"));
		Cancel.click();
		login_text_field.clear();
		pswrd_text_field.clear();


	

	}

}
