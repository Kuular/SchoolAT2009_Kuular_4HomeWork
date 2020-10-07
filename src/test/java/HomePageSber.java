import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class HomePageSber {

    public HomePageSber sber() {
        open("https://www.sberbank-ast.ru/");
        return page(HomePageSber.class);
    }

    public ElementsCollection collectResults() {
                return $$(By.xpath("//*[@class='master_open_menu']//li//span"));
    }

    public void clickMenuButton(String nameButton){
        collectResults().findBy(exactText(nameButton)).click();
    }
}

