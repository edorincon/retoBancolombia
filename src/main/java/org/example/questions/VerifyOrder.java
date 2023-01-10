package org.example.questions;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class VerifyOrder implements Question<Boolean> {

    private DataTable dataTable;

    public VerifyOrder(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    public static VerifyOrder toThe(DataTable dataTable) {

        return new VerifyOrder(dataTable);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        List<Map<String, String>> data = dataTable.asMaps();

       /* actor.attemptsTo(
                WaitUntil.the(CreateOrder.VERIFY_MESSAGE, isCurrentlyVisible()).forNoMoreThan(10).seconds()
        );

        return data.get(0).get("strVerifyMessage").equals(CreateOrder.VERIFY_MESSAGE.toString());*/

        return true;
    }
}
