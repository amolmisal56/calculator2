package Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Amol Data\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver. navigate(). to(" https://www.calculator.net/");
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='×']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='=']")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[normalize-space()='AC']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='=']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[normalize-space()='AC']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='+']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='=']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='AC']")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='8']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='0']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='9']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='8']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		// TODO Auto-generated method stub

	}

}
