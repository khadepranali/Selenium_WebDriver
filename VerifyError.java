package com.yantraQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyError
{
    public  static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();

        driver.get("http://gmail.com");

        driver.findElement(By.xpath("//div[contains(text(),'Use another account')]")).click();


       // driver.findElement(By.xpath("//button//span[contains(text(),'Next')]")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Forgot email?')]")).click();

       driver.findElement(By.xpath("//a[contains(text(),'Learn more')]")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
    }
}
