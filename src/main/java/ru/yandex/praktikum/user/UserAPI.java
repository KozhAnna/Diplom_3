package ru.yandex.praktikum.user;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import ru.yandex.praktikum.page_object.MainPage;

import static io.restassured.RestAssured.given;

public class UserAPI {

    @Step("Отправка запроса на создаение пользователя")
    public Response create(User user) {
        return given()
                .baseUri(MainPage.MAIN_URL)
                .header("Content-type", "application/json")
                .body(user)
                .when()
                .post("api/auth/register");
    }

    public Response login(UserCredentials user) {
        return given()
                .baseUri(MainPage.MAIN_URL)
                .header("Content-type", "application/json")
                .body(user)
                .when()
                .post("api/auth/login");
    }

    public void delete(String token){
        given()
                .baseUri(MainPage.MAIN_URL)
                .contentType("application/json")
                .header("Authorization", token)
                .body(UserCredentials.from(UserCredentials.user))
                .delete("api/auth/user");
    }

}
