package pageObjects;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class LogIn_Page {

    private static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver){

        element = driver.findElement(By.id("ph_login"));

        return element;

    }

    public static WebElement txtbx_Password(WebDriver driver){

        element = driver.findElement(By.id("ph_password"));

        return element;

    }

    public static WebElement btn_LogIn(WebDriver driver){


        element = driver.findElement(By.className("x-ph__button__input"));

        return element;

    }


    public static WebElement btn_ReportCategory(WebDriver driver) throws Exception{


        element = driver.findElement(By.id("PH_logoutLink"));

        // This will return the Element in case of no Exception

        return element;

    }

}