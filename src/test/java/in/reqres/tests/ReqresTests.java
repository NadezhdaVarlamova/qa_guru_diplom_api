package in.reqres.tests;

import in.reqres.models.User;
import in.reqres.spec.Spec;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReqresTests extends TestBase {

    @Test
    @DisplayName("Удаление пользователя")
    void delete() {
        given()
                .spec(Spec.request)
                .when()
                .delete("/users/2")
                .then()
                .spec(Spec.response204);
    }

    @Test
    @DisplayName("Обновление пользователя")
    void update() {
        User user = new User();
        user.setFirstName("nadya");
        user.setJob("qa");

        User response = given()
                .spec(Spec.request)
                .body(user)
                .when()
                .put("/users/2")
                .then()
                .spec(Spec.response200)
                .extract().as(User.class);
        assertEquals(response.getJob(), user.getJob());
        assertEquals(response.getFirstName(), user.getFirstName());
    }

    @Test
    @DisplayName("Успешная регистрация пользователя")
    void registerSuccessful() {
        User user = new User();
        user.setEmail("eve.holt@reqres.in");
        user.setPassword("pistol");

        User response = given()
                .spec(Spec.request)
                .body(user)
                .when()
                .post("/register")
                .then()
                .spec(Spec.response200)
                .extract().as(User.class);
        assertEquals(response.getId(), "4");
        assertEquals(response.getToken(), "QpwL5tke4Pnpja7X4");
    }

    @Test
    @DisplayName("Пользователь не найден")
    void notFound() {
        given()
                .spec(Spec.request)
                .when()
                .get("/unknown/23")
                .then()
                .spec(Spec.response404);
    }

    @Test
    @DisplayName("Неуспешная регистрация пользователя")
    void registerUnsuccessful() {
        User user = new User();
        user.setEmail("sydney@fife");

        User response = given()
                .spec(Spec.request)
                .body(user)
                .when()
                .post("/register")
                .then()
                .spec(Spec.response400)
                .extract().as(User.class);
        assertEquals(response.getError(), "Missing password");

    }
}
