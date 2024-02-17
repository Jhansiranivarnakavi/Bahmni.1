package stepDefinitions;

import appPages.AdminModule;
import appPages.CSVExport;
import drivers.DriverManager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.File;

public class AdminCSVExportStepDefination {

    CSVExport csvExport = new CSVExport(DriverManager.getDriver());

    @Then("User select the consept name as {string}")
    public void user_select_the_consept_name_as(String concept) throws InterruptedException {
        csvExport.conceptText(concept);

    }

    @Then("User click on the {string}")
    public void user_click_on_the(String Exportbutton) throws InterruptedException {
        csvExport.Export(Exportbutton);
    }

    @Then("check under download folder if file is present or not")
    public void check_under_download_folder_if_file_is_present_or_not() {
        csvExport.isFileDownloaded("D:\\Users","Drug Routes");
    }
}




