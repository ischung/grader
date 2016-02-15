package Unit;

import org.junit.Test;

import calculateGrade.InvalidScore;
import calculateGrade.Score;
import calculateGrade.ScoreBuilder;


public class WhenEnteringMidExamScore {
	@Test(expected=InvalidScore.class)
	public void should_throw_exception_for_negative_mid_exam_score() throws InvalidScore {
			Score score = new ScoreBuilder().withMidExamScore(-1).build();
	}
	
	@Test(expected=InvalidScore.class)
	public void shoueld_throw_exception_for_mid_exam_score_gt_upper_bound() throws InvalidScore {
		Score score = new ScoreBuilder().withMidExamScore(36).build();
	}

}
