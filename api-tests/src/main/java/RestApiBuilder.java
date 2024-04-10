import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class RestApiBuilder {
    private final RequestSpecification spec;

    public RestApiBuilder() {
        spec = given();
    }

    public RestApiBuilder baseUri(String uri) {
        spec.baseUri(uri);
        return this;
    }

    public RestApiBuilder contentType(ContentType type) {
        spec.contentType(type);
        return this;
    }

    public RestApiBuilder body(Object body) {
        spec.body(body);
        return this;
    }

    public RestApiBuilder addHeader(String name, String value) {
        spec.header(name, value);
        return this;
    }

    // Метод для выполнения POST запроса
    public void executePost(String url, int expectedStatusCode) {
        spec.post(url).then().statusCode(expectedStatusCode);
    }

    // Метод для выполнения DELETE запроса
    public void executeDelete(String url, int expectedStatusCode) {
        spec.delete(url).then().statusCode(expectedStatusCode);
    }
}
