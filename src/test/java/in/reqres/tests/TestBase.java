package in.reqres.tests;

import in.reqres.helpers.CustomAllureListener;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void setUp() {
        RestAssured.filters(CustomAllureListener.withCustomTemplates());
    }
}
