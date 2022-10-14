package com.juaracoding.abdulazisfikri;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PostTestAbdulAzisFikri {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://formy-project.herokuapp.com/form";

        driver.get(url);
        int detik = 1;
        delay(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        firstName.sendKeys("Abdul Azis");
        System.out.println("input first name");
        delay(detik);
        driver.findElement(By.id("last-name")).sendKeys("Fikri");
        System.out.println("input lastname");
        delay(detik);
        driver.findElement(By.id("job-title")).sendKeys("Software Quality Assurance");
        System.out.println("input job title");
        delay(detik);
        WebElement education = driver.findElement(By.id("radio-button-2"));
        js.executeScript("arguments[0].click();", education);
        System.out.println("pilih education College");
        delay(detik);
        WebElement gender = driver.findElement(By.id("checkbox-1"));
        js.executeScript("arguments[0].click();", gender);
        System.out.println("pilih gender Male");
        delay(detik);

        WebElement elementSelect = driver.findElement(By.id("select-menu"));
        Select selectMenu = new Select(elementSelect);
        selectMenu.selectByIndex(2);
        delay(detik);

        WebElement pilihTanggal = driver.findElement(By.id("datepicker"));
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        System.out.println("pilih tanggal : " + pilihTanggal.getText());
        pilihTanggal.sendKeys("10/10/2022");
        System.out.println("10-10-2022");

        delay(detik);
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        System.out.println("submit button clicked");

        delay(3);

        driver.quit();

    }

    static void delay(int detik) {
        //delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}