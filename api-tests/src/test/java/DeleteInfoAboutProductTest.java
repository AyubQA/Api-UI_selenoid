import org.junit.jupiter.api.Test;


public class DeleteInfoAboutProductTest {

    @Test
    public void deleteInfoAboutProductTest() {
        FolderApi.deleteProduct(Urls.RandomIdProducts, 201);
    }

    @Test
    public void deleteInfoAboutProductWithHugeIdTest() {
        FolderApi.deleteProduct(Urls.products + "/999999", 404);
    }

    @Test
    public void deleteInfoAboutProductWithInvalidIdTest() {
        FolderApi.deleteProduct(Urls.products + "/abc", 404);
    }

    @Test
    public void deleteInfoAboutProductNoIdTest() {
        FolderApi.deleteProduct(Urls.products, 404);
    }
}
