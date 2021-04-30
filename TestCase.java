package com.yantraQT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase
{
    public static  void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@value='1' or @type='submit']")).click();

        String actual_error=driver.findElement(By.className("_9ay7")).getAttribute("innerHTML");

        System.out.println(actual_error);

        String expected_error="The email address or mobile number you entered isn't connected to an account. <a href=\"/login/identify/\">Find your account and log in.</a>";

        if(actual_error.equalsIgnoreCase(expected_error))
        {
            System.out.println("Error verified");
        }
        else
        {
            System.out.println("Error not verified");
        }
        driver.findElement(By.linkText("Forgotten password?")).click();
    }
}
