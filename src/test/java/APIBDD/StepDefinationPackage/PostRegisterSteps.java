package APIBDD.StepDefinationPackage;

import APIBDD.BaseClassPackage.BaseClass;
import APIBDD.PageObjectPackage.GetUsers;
import APIBDD.PageObjectPackage.PostRegister;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PostRegisterSteps extends BaseClass {

    PostRegister postRegister = new PostRegister();
    GetUsers getUsers = new GetUsers();

    @Given("^user is on the reqres homepage$")
    public void user_is_on_the_reqres_homepage() throws Throwable {
        requestSpecification = given().baseUri(getUsers.GetBaseUri()).contentType(ContentType.JSON)
        .body(postRegister.PostRegPayload());
    }

    @When("^user is able to register successful$")
    public void user_is_able_to_register_successful() throws Throwable {
        response = requestSpecification.post(postRegister.PostRegResource());
    }

    @Then("^user should be able to see message register successful$")
    public void user_should_be_able_to_see_message_register_successful() throws Throwable {
        response.then().log().all().assertThat().statusCode(200).and().contentType(ContentType.JSON)
        .and().body("token", is("QpwL5tke4Pnpja7X4"));
    }

}
