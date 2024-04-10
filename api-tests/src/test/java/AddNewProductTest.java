import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class AddNewProductTest {

    @Test
    @DisplayName("Add new product")
    public void addNewProductTest() {
        FolderApi.addProduct(RandomData.randomProduct, 201);
    }

    @Test
    @DisplayName("Add new product.Invalid JSON")
    public void addNewProductWithInvalidBodyTest() {
        FolderApi.addProduct(RandomData.invalidJsonProduct, 405);
    }
}
