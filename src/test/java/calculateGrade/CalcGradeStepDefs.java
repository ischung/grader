package calculateGrade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalcGradeStepDefs {
	Scores scores;
	
	@Given("^the student with id \"(.*?)\" has mid exam score (\\d+) and final exam score (\\d+)  and homework  score (\\d+)$")
	public void addScore(String sid, int m, int f, int h) {
		scores = new Scores(new SimpleScoreStrategy());
	    Score score = new Score(m, f, h);
	    scores.addScore(sid, score);
	}
	
	@When("^the professor gives the students grades$")
	public void theProfessorGivesTheStudentsGrades()  {
		 scores.setGrade();
	}

	@Then("^the grade of the student with id \"(.*?)\"  should be \"(.*?)\"$")
	public void theGradeOfTheStudentWithIdShouldBe(String sid, Grade g) {
		assertThat(scores.getGrade(sid),equalTo(g));
	}
}



