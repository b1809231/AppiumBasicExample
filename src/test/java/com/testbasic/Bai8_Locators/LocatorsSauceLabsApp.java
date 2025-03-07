package com.testbasic.Bai8_Locators;

import com.testbasic.common.BaseTest;
import com.testbasic.drivers.DriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsSauceLabsApp extends BaseTest {
    @Test
    public void testDemoLocators(){
        WebElement headerPage1= DriverManager.getDriver().findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/productTV"));
        System.out.println(headerPage1.getText());

        WebElement headerPage2= DriverManager.getDriver().findElement(AppiumBy.accessibilityId("title"));  //giá trị accessibilityId chỉ có trên app
        System.out.println(headerPage2.getText());

        WebElement productName1= DriverManager.getDriver().findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
        System.out.println(productName1.getText());

    }
}
