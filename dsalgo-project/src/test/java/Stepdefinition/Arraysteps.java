package Stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Arraypage;

public class Arraysteps extends Arraypage{
@Before
public void setup() throws InterruptedException {
	
     System.out.println("User is setup for array");
     
     }
@After
public void closing() {
	System.out.println("Check the Arrage page");
}

@Given("User is in homepage")
public void user_is_in_homepage() 
{
//	if(driver == null) {

	System.out.println("User is in homepage again");
	getDriver();
	
}

@When("User clicks the Getting Started button in Array Pane")
public void user_the_user_clicks_the_getting_started_button_in_array_pane() throws InterruptedException {
    
	System.out.println("User clicks the Getting Started button in Array Pane");
	
	clickgetstarted();
}
@Then("User be directed to Array Data Structure Page")
public void user_be_directed_to_array_data_structure_page() {
    // Write code here that turns the phrase above into concrete actions
	directoarraypage();
	Assert.assertEquals(string,arr);
}

@When("User select Array item from the drop down menu")
public void user_select_array_item_from_the_drop_down_menu() {
    dropdownarray();
}

@Then("User be directed to Array Data Structure Pages")
public void user_be_directed_to_array_data_structure_pages(){
	directoarraypage();
	Assert.assertEquals(string,arr);     
	
}

}

