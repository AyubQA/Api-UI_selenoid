import io.restassured.http.ContentType;


public class FolderApi {

    private static final String BASE_URI = "http://9b142cdd34e.vps.myjino.ru:49268/";

    public static void addProduct(Object requestBody, int expectedStatusCode) {
        new RestApiBuilder()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .executePost("/products", expectedStatusCode);
    }

    // Если вам нужны другие операции, например, удаление продукта, добавьте их здесь
    public static void deleteProduct(String productId, int expectedStatusCode) {
        new RestApiBuilder()
                .baseUri(BASE_URI)
                .executeDelete("/products/" + productId, expectedStatusCode);
    }

    public static void executePostRequest(String url, Object requestBody, int expectedStatusCode) {
        new RestApiBuilder()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .executePost(url, expectedStatusCode);
    }
}
