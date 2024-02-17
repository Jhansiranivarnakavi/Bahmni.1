package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;

import static org.testng.reporters.jq.BasePanel.D;

public class CSVExport {

    public WebDriver driver;

    public CSVExport(WebDriver driver) {
        this.driver = driver;
    }

    public By adminModuleBtn = By.xpath("//a[@id='bahmni.admin']");
    public By csvExportBtn = By.xpath("//a[text()='CSV Export']");

    public By ExportBtn = By.xpath("//button[contains(text(),'Export')]");
    public By conceptText = By.xpath("//input[@type='text'][@name='conceptSet']");

    public void clickOnAdminModule() {
        driver.findElement(adminModuleBtn).click();
    }

    public void csvExport() {
        driver.findElement(csvExportBtn).click();
    }

    public void conceptText(String concept) throws InterruptedException {
       // driver.findElement(conceptText).sendKeys(concept);
        Select con= new Select();
        Thread.sleep(3000);
    }

    public void Export(String Exportbutton) throws InterruptedException {
        driver.findElement(ExportBtn).click();

    }


    public boolean isFileDownloaded(String downloadPath, String fileName) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }

}





