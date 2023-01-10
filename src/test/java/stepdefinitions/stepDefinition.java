package stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.tasks.Cycles;
import org.example.tasks.Login;
import org.example.tasks.OpenUp;


public class stepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("than I want to test the elements")
    public void thanIWantToTestTheElements() {
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.urlApp());
    }

    @When("I perform different actions")
    public void iPerformDifferentActions(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.the(dataTable),
                Cycles.the(dataTable)
        );
    }

    @Then("I expect get the correct result")
    public void iExpectGetTheCorrectResult() {
    }


}
