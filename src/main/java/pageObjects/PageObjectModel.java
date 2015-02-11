package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


// Import package pageObject.*

import pageObjects.Home_Page;

import pageObjects.LogIn_Page;

import pageObjects.Mail_Page;

public class PageObjectModel {

    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.mail.ru");

        // Use page Object library now

        Home_Page.lnk_MyAccount(driver).click();

        LogIn_Page.txtbx_UserName(driver).sendKeys("markus_6");

        LogIn_Page.txtbx_Password(driver).sendKeys("akiv08apap");

        LogIn_Page.btn_LogIn(driver).click();


        if(LogIn_Page.btn_ReportCategory(driver).isDisplayed() == true){
           // System.out.println(" Login Successfully, now it is the time to Log Off buddy.");



            Mail_Page.btn_Mail(driver).click();

            //driver.get("https://e.mail.ru/compose/?1423656580353");
            Mail_Page.body_Mail(driver).sendKeys("Some Text");
            Mail_Page.to_Mail(driver).sendKeys("alex");

            Mail_Page.title_Mail(driver).sendKeys("hello");






            Mail_Page.btn_Send(driver).click();

            Home_Page.lnk_LogOut(driver).click();
        }
        else {
            System.out.println("It's not good! Not valid login and/or password");
        }

        driver.quit();

    }

}