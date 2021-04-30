package com.yantraQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify
{
    public  static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();

        driver.get("http://learn-automation.com/");

        String title= driver.getTitle();

        if(title.equalsIgnoreCase("Automation - Selenium Webdriver tutorial Step by Step"))
        {
            System.out.println("TestCase verified");
        }
        else
        {
            System.out.println("TestCase not verified");
        }
    }
}
