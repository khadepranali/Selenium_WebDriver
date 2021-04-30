package com.dropQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ListDrop
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");

        Select sel1=new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));

        List<WebElement> monthList=sel1.getOptions();

        int total= monthList.size();

        System.out.println("the total month are:"+total);

        for(WebElement ele:monthList)
        {
            String month=ele.getText();
            System.out.println("the year is:"+month);
        }
    }
}
