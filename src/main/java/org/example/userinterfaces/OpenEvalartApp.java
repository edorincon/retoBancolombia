package org.example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://tasks.evalartapp.com/automatization/")
public class OpenEvalartApp extends PageObject {

    @Override
    public WebDriver getDriver() {
        return super.getDriver();
    }
}
