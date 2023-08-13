package project.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ReusableMethods extends BaseClass {
    public static void clickElement(WebElement element, String name){
        try{
            element.click();
        }catch (Exception e){
            System.out.println("Failed to click "+name);
            throw new AssertionError("Step failed due to an exception: " + e.getMessage());
        }
    }

    public static void scrollElementIntoView(WebElement element,String name){
        try{
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        }catch (Exception e){
            System.out.println("Failed to Scroll "+name+ " element into view");
            throw new AssertionError("Step failed due to an exception: " + e.getMessage());
        }
    }
}
