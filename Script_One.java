package com.pranaliQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Script_One
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().window().maximize();

        driver.findElement(By.id("firstName")).sendKeys("Pranali");

        driver.findElement(By.id("lastName")).sendKeys("Kekan");

        driver.findElement(By.id("userEmail")).sendKeys("khadepranali24@gmail.com");

        driver.findElement(By.xpath(" //label[contains(text(),'Female')]")).click();

        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8180061739");

        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();

        Select date=new Select(driver.findElement(By.xpath("//select[contains(@class,'react-datepicker')]")));
        date.selectByVisibleText("June");

        Select date1=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
        date1.selectByVisibleText("1999");


        driver.findElement(By.xpath("//div[contains(text(),'24')]")).click();

        driver.findElement(By.xpath("//label[contains(text(),'Music')]")).click();

       // driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();

        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Pranali Samadhan kekan are doing selenium automation testing couse");

        WebElement countryListElement=driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
        Select countryDropDown=new Select(countryListElement);
        countryDropDown.selectByVisibleText("Rajasthan");



    }
}
