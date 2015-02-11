package pageObjects;


import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;



public class Mail_Page {

    private static WebElement element = null;

    public static WebElement btn_Mail(WebDriver driver){

        //element = driver.findElement(By.className("b-toolbar__btn js-shortcut"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("return document.getElementsByClassName('b-toolbar__btn js-shortcut')[0].click();");

        return element;
    }

    public static WebElement body_Mail(WebDriver driver){

       // element = driver.findElement(By.id("tinymce"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        
        js.executeScript("document.getElementsByClassName('mceContentBody')[0].sendKeys(dfgdfg);");

        return element;

    }

    public static WebElement to_Mail(WebDriver driver){

        element = driver.findElement(By.tagName("To"));


        return element;

    }

    public static WebElement title_Mail(WebDriver driver){

        element = driver.findElement(By.name("q_subj"));

        return element;

    }

    public static WebElement btn_Send(WebDriver driver){

        element = driver.findElement(By.className("b-toolbar__btn__text"));

        return element;

    }



}
