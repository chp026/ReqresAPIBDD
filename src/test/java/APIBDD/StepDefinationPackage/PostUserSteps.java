package APIBDD.StepDefinationPackage;

import APIBDD.BaseClassPackage.BaseClass;
import APIBDD.PageObjectPackage.GetUsers;
import APIBDD.PageObjectPackage.PostUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PostUserSteps extends BaseClass {
    GetUsers getUsers = new GetUsers();
    PostUser postUser = new PostUser();

    @Given("^user is on the reqres base uri for POST method$")
    public void user_is_on_the_reqres_base_uri_for_POST_method() throws Throwable {
        requestSpecification = given().baseUri(getUsers.GetBaseUri()).contentType(ContentType.JSON)
        .body(postUser.PostPayload());
    }

    @When("^user uses POST resource and query param$")
    public void user_uses_POST_resource_and_query_param() throws Throwable {
        response = requestSpecification
        .post(postUser.PostResource());
    }

    @Then("^user should see status code (\\d+) and correct responce$")
    public void user_should_see_status_code_and_correct_responce(int arg1) throws Throwable {
        response.then().log().all().assertThat().statusCode(201).and().contentType(ContentType.JSON)
        .and().body("job",is("leader"));
    }

}
