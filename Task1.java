package SeleniumHW_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Anna");
        driver.findElement(By.id("customer.lastName")).sendKeys("Lee");
        driver.findElement(By.id("customer.address.street")).sendKeys("11604 Fairfax Cir");
        driver.findElement(By.id("customer.address.city")).sendKeys("Fairfax");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22030");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("456789098");
        driver.findElement(By.id("customer.ssn")).sendKeys("899-544-5668");
        driver.findElement(By.id("customer.username")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("customer.password")).sendKeys("0987654321");
        driver.findElement(By.id("repeatedPassword")).sendKeys("0987654321");
        Thread.sleep(3000);
        driver.quit();



    }
}
