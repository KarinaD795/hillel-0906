package homeworksSelenium.hw35;

import org.testng.Assert;
import org.testng.annotations.Test;

import static homeworksSelenium.hw35.SpecificationForTest.*;
import static io.restassured.RestAssured.given;

public class TestUserCreation {
    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void createUserWithNameAndJob(){
        configureSpec(requestSpecification(BASE_URL), responseSpecification(201));

        UserInitData userInitData = new UserInitData("morpheus", "leader");
        UserSuccessResponse userSuccessResponse= given()
                .body(userInitData)
                .when()
                .post("/api/users")
                .then().log().all()
                .extract().as(UserSuccessResponse.class);

        Assert.assertEquals(userSuccessResponse.getName(), "morpheus");
        Assert.assertEquals(userSuccessResponse.getJob(), "leader");
    }
}
