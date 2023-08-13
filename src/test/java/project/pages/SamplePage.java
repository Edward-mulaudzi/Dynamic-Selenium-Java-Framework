package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utils.BaseClass;

import static project.utils.PageObjectsRepository.reusableMethods;

public class SamplePage extends BaseClass {
    public SamplePage (){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//div[30]//div[3]//button[1]")
    private static WebElement product1;
    @FindBy(xpath = "//img[@alt='Cart']")
    private static WebElement cart;
    @FindBy(xpath = "//button[normalize-space()='PROCEED TO CHECKOUT']")
    private static WebElement proceedCheckout;
    @FindBy (xpath = "//button[normalize-space()='Place Order']")
    private static WebElement palceOrder;
    @FindBy (xpath = "//input[@type='checkbox']")
    private static WebElement termsConditions;
    @FindBy (xpath = "//button[normalize-space()='Proceed']")
    private static WebElement proceedPlaceOrder;

    public void selectFirstProduct(){
        reusableMethods.clickElement( product1,"product 1");
    }
    public void checkout(){
        reusableMethods.clickElement( cart,"Cart Button");
        reusableMethods.clickElement( proceedCheckout,"Proceed Checkout Button");
        reusableMethods.clickElement( palceOrder,"Place Order");
        reusableMethods.clickElement( termsConditions,"Terms & Conditions Check Button");
        reusableMethods.clickElement( proceedPlaceOrder,"Proceed Place Order Button");
    }

}
