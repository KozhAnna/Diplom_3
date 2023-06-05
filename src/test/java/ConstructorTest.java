import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.page_object.MainPage;

public class ConstructorTest extends BrowserTest {

    MainPage objMainPage;

    @Before
    public void createUser() {
        objMainPage = new MainPage(driver);
    }

    @Test
    @DisplayName("Переход к секции Булки")
    public void openSectionBunsTest() {
        objMainPage.openMainPage();
        objMainPage.clickConstructorButton();
        objMainPage.clickSectionFilling();
        objMainPage.clickSectionBuns();
        objMainPage.isSectionBunsVisible();
    }

    @Test
    @DisplayName("Переход к секции Соусы")
    public void openSectionSauceTest() {
        objMainPage.openMainPage();
        objMainPage.clickConstructorButton();
        objMainPage.clickSectionSauce();
        objMainPage.isSectionSauceVisible();
    }

    @Test
    @DisplayName("Переход к секции Начинки")
    public void openSectionFillingTest() {
        objMainPage.openMainPage();
        objMainPage.clickConstructorButton();
        objMainPage.clickSectionFilling();
        objMainPage.isSectionFillingVisible();
    }

}
