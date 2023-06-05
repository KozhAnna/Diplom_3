import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.service.WebDriverContainer;

public class BrowserTest {

    protected WebDriver driver;

    @Before
    public void setup() { driver = WebDriverContainer.init(); }

    @After
    public void teardown() { driver.quit(); }
}
