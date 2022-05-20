package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

      private static final Logger log = LogManager.getLogger(HomePage.class.getName());

      public HomePage(){
            PageFactory.initElements(driver,this);
      }

      @CacheLookup
      @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
      WebElement buySell;

      @CacheLookup
      @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
      WebElement searchCar;

      @CacheLookup
      @FindBy(linkText = "Used")
      WebElement used;

      public void clkOnUsed(){
            clickOnElement(used);
            log.info("Click on used link : " + used.toString());
      }

      public void clkSearchCar(){
            clickOnElement(searchCar);
            log.info("Click on search car : " + searchCar.toString());

      }

      public void clkBuySell(){
            mouseHoverToElement(buySell);
            log.info("Hover mouse over Buy and Sell :" + buySell.toString());
      }

}
