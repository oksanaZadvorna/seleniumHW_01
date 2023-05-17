package SeleniumHW_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("12345");
        String title= driver.getTitle();
        System.out.println("Web Orders Login");
        driver.quit();

    }
}
