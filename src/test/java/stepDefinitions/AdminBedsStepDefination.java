package stepDefinitions;

import appPages.AdminModule;
import appPages.Beds;
import drivers.DriverManager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminBedsStepDefination {

    Beds beds = new Beds(DriverManager.getDriver());
    @Then("user select the location of the ward {string}")
    public void user_select_the_location_of_the_ward(String string) {
        beds.wardtype();
    }
    @Then("user select the {string}")
    public void user_select_the(String string) {
        beds.wordroom();
    }
    @Then("user select the bed {string} and bed {string} and click on the save button")
    public void user_select_the_bed_and_bed_and_click_on_the_save_button(String string, String string2) {
        beds.bedallocation();
    }
    @Then("user should able to see the bed allocation")
    public void user_should_able_to_see_the_bed_allocation() {
        .
    }

}
