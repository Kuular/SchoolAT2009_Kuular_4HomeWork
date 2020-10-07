import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestSberbank {

    @BeforeEach
    public void beforeTest(){
        Configuration.timeout=8000;
        Configuration.browser="chrome";
        Configuration.startMaximized=true;
    }

    @org.junit.jupiter.api.Test
    public void testSber(){
        HomePageSber homePageSber = open("https://www.sberbank-ast.ru/",HomePageSber.class);
        System.out.println(homePageSber.collectResults());
        homePageSber.clickMenuButton("Продажи");
    }
}
