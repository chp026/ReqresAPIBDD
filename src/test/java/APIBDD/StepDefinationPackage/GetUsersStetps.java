package APIBDD.StepDefinationPackage;

import APIBDD.BaseClassPackage.BaseClass;
import APIBDD.PageObjectPackage.GetUsers;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class GetUsersStetps extends BaseClass {
    GetUsers getUsers = new GetUsers();

    @Given("^user is on the reqres base uri$")
    public void user_is_on_the_reqres_base_uri() throws Throwable {
        requestSpecification = given().baseUri(getUsers.GetBaseUri());
    }

    @When("^user selects GET method and selects resource and query parameter$")
    public void user_selects_GET_method_and_selects_resource_and_query_parameter() throws Throwable {
        response = requestSpecification.when().get(getUsers.GetResource());
    }

    @Then("^user should be able to get the correct status code and body with JSON containt type$")
    public void user_should_be_able_to_get_the_correct_status_code_and_body_with_JSON_containt_type() throws Throwable {
        response.then().log().all().assertThat().statusCode(200).and().contentType(ContentType.JSON)
        .and().body("data.id",hasItems(7,8,9,10,11,12));
    }

}
