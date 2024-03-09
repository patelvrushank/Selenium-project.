package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.accuweather.com/en/");

        WebElement element =driver.findElement(By.xpath("/html/body/div/div[6]/div[1]/div[1]/div[1]/div/a[9]/span[2]"));
        System.out.println(element.getText());
        //driver.close();

    }

}