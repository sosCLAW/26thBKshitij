package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://skpatro.github.io/demo/iframes/");
		Thread.sleep(2000);
		
		//main page text frame 0
		String text = driver.findElement(By.xpath("  //a[text()='Pavilion']")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.switchTo().frame("Framename1");
		String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		System.out.println(text1);
		
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		String text2 = driver.findElement(By.linkText("Blogger")).getText();
		System.out.println(text2);
		
		Thread.sleep(1000);
        driver.switchTo().frame("Frame2");
        String text3 = driver.findElement(By.linkText("Category3")).getText();
        System.out.println(text3);
		
        
	}

}
