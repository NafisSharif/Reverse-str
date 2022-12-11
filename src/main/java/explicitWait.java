package Codes;




import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;


//Напишите программу на Java, чтобы продемонстрировать явную проверку условий ожидания.

public class explicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        ChromeOptions cOptions = new ChromeOptions();

        cOptions.addArguments("--disable-arguments");

        WebDriver curentDriver = new ChromeDriver();

        curentDriver.manage().window().maximize();

        curentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        curentDriver.navigate().to("https://www.google.com.ua");

        WebElement curentElement = curentDriver.findElement(By.name("q"));

        curentElement.sendKeys("Testing");

        curentElement.submit();

        WebDriverWait waitWD = new WebDriverWait(curentDriver, 20);



        WebElement secondElement = waitWD.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Тестирование программного обеспечения - Википедия")));

        secondElement.click();
    }
}
