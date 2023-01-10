package org.example.tasks;


import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.userinterfaces.LoginPage;

import java.util.List;
import java.util.Map;

public class Login implements Task {

    private DataTable dataTable;

    public Login(DataTable dataTable) {

        this.dataTable = dataTable;
    }

    public static Login the(DataTable dataTable) {

        return Tasks.instrumented(Login.class, dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Map<String, String>> data = dataTable.asMaps();

        actor.attemptsTo(
                Enter.theValue(data.get(0).get("strUserName")).into(LoginPage.INPUT_USER),
                Enter.theValue(data.get(0).get("strPassword")).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.SUBMIT)
        );

    }
}
