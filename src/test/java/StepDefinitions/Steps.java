package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Before
    public void setup(Scenario scenario){
        System.out.println("===========================================================");
        System.out.println("Scenario name::" + scenario.getName());
        System.out.println("Scenario tags::" + scenario.getSourceTagNames());
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }

    @After
    public void teardown(){
        System.out.println("===========================================================");
    }

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("The user is on login page");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Entered valid credentials");
    }
    @When("hits submit")
    public void hits_submit() {
        System.out.println("Clicked on submit");
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("Yeah I am logged in");
    }

    @When("the user enters invalid credentials")
    public void the_user_enters_invalid_credentials() {
        System.out.println("Entered invalid credentials");
    }
    @Then("an invalid credentials error message should be displayed to the user")
    public void an_invalid_credentials_error_message_should_be_displayed_to_the_user() {
        System.out.println("error displayed::: Username or password invalid");
    }
    @Then("login should be unsuccessful")
    public void login_should_be_unsuccessful() {
        System.out.println("User was not logged in");
    }

    @Then("the Company logo should be present in the login form")
    public void the_company_logo_should_be_present_in_the_login_form() {
        System.out.println("The company logo is present in the login form");
    }

    @When("the user clicks on Forgot Username")
    public void the_user_clicks_on_forgot_username() {
        System.out.println("The user clicked on forgot username link::::::::::::::::");
    }

    @Then("the user should be navigated to the first page of forgot username flow")
    public void the_user_should_be_navigated_to_the_first_page_of_forgot_username_flow() {
        System.out.println("The user is on verify email address page of Recover/reset password flow");
    }

    @When("he enters user id as {string}")
    public void he_enters_user_id_as(String string) {
        System.out.println("The user ID is ::" + string);
    }
    @When("he enters password as {string}")
    public void he_enters_password_as(String string) {
        System.out.println("The password is::" + string);
    }
}
