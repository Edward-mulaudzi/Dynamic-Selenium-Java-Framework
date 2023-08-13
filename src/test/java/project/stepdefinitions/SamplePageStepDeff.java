package project.stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.utils.BaseClass;

public class SamplePageStepDeff extends BaseClass {

    public Scenario scenario;
    @When("Select a product")
    public void select_a_product() {
        samplePage.selectFirstProduct();
    }
    @When("Check Out")
    public void check_out() {
        samplePage.checkout();
    }
    @Then("Product is successfully ordered and success message is shown")
    public void product_is_successfully_ordered_and_success_message_is_shown() {
        try{

        }catch (Exception e){
            System.out.println("");
        }
    }
}
