package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tab1 {
	public static WebDriver driver;
	tab1 t;
	@When("^Larry seraches below products in the search box:$")
	public void larry_seraches_below_products_in_the_search_box(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Then("^product should be added in the cart if available$")
	public void product_should_be_added_in_the_cart_if_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
