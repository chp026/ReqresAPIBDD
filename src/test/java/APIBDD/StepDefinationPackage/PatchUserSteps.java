package APIBDD.StepDefinationPackage;

import APIBDD.BaseClassPackage.BaseClass;
import APIBDD.PageObjectPackage.GetUsers;
import APIBDD.PageObjectPackage.PatchUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PatchUserSteps extends BaseClass {
    GetUsers getUsers = new GetUsers();
    PatchUser patchUser = new PatchUser();

    @Given("^user is on the reqres base uri to update user detail$")
    public void user_is_on_the_reqres_base_uri_to_update_user_detail() throws Throwable {
        requestSpecification = given().baseUri(getUsers.GetBaseUri()).contentType(ContentType.JSON).body(patchUser.patchUer());
    }

    @When("^user should get the new user details$")
    public void user_should_get_the_new_user_details() throws Throwable {
        response = requestSpecification.patch(patchUser.PatchResource());
    }

    @Then("^user should be able to see the updated user information$")
    public void user_should_be_able_to_see_the_updated_user_information() throws Throwable {
        response.then().log().all().assertThat().statusCode(200).and().contentType(ContentType.JSON)
        .and().body("job",is("zion resident"));
    }

}
