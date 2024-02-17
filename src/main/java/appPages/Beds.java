package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Beds {

    public WebDriver driver;

    public Beds(WebDriver driver){
        this.driver=driver;
    }

    public By Beds = By.xpath("//a[@text()='Beds']");
    public By GeneralWard = By.xpath(("//span[@text()='General Ward']"));
    public By GeneralWardRoom1 = By.xpath(("//span[@text()='General Ward Room 1']"));
    public By Addbed = By.xpath(("//span[@text()='Add Bed']"));
    public By BedNumber = By.id("bed-number-field");
    public By BedType = By.id("bed-type");
    public By Savebutton = By.name("submit");
public void wardtype(){driver.findElement(GeneralWard);
}
public void wordroom(){driver.findElement(GeneralWardRoom1);
}
public void addbed(){driver.findElement(Addbed);}
    public void bedallocation(){
    driver.findElement(BedNumber);
    driver.findElement(BedType);
    driver.findElement(Savebutton).click();.
    }



}
