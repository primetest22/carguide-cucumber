package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUsedCarPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public NewUsedCarPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement make;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findCar;

    public void clkOnFindMyNextCarBtn(){
          clickOnElement(findCar);
    }

    public void selectPrice(String text){
        selectByVisibleTextFromDropDown(price,text);
    }

    public void selectLocation(String text){
        selectByVisibleTextFromDropDown(location,text);
    }

    public void selectModel(String text){
        selectByVisibleTextFromDropDown(model,text);
    }

    public void selectMake(String text){
        selectByVisibleTextFromDropDown(make,text);
    }

}
