package shopperstackAP;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class ffapp {
	

	public static void main(String[] args) throws InterruptedException {
	String phonenumber = RandomStringUtils.randomNumeric(5);//To genrate random phone number
	String ddh="99887"+phonenumber;
	System.out.println(ddh);
	System.out.println(phonenumber);
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();//to maximize browser window
		driver.get("https://ffreedom.com/");//to navigate to the url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		boolean isdisplayed = driver.findElement(By.xpath("//img[@title='ffreedom app']")).isDisplayed();//to verify it as navigated to the url
		System.out.println(isdisplayed);
		WebElement ffreedom_app = driver.findElement(By.xpath("//div[text()='Download ffreedom app']")); //to scroll to the Enter phone number textfield
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",ffreedom_app );
		WebElement phoneNumberTextField = driver.findElement(By.xpath("//input[@placeholder='Enter phone number']"));//xpath of phonenumber textfield
		boolean numbertextfield = phoneNumberTextField.isDisplayed();//to verify phone nuber textfield
		System.out.println(numbertextfield);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(phoneNumberTextField));
	//	phoneNumberTextField.click();
		phoneNumberTextField.sendKeys(ddh);//to send the input 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='get-link']")));
		driver.findElement(By.xpath("//button[@id='get-link']")).click();//to click on get link
		driver.findElement(By.xpath("//b[contains(text(),'We have sent an sms with app download link')]")).isDisplayed();//final validation 
		Thread.sleep(2000);
		driver.quit();
	}

}
