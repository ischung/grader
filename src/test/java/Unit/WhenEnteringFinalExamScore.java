package Unit;

import calculateGrade.InvalidScore;
import calculateGrade.Score;
import calculateGrade.ScoreBuilder;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class WhenEnteringFinalExamScore {
	
	@Test(expected=InvalidScore.class)
	public void should_throw_exception_for_negative_final_exam_score() throws InvalidScore {
		Score score = new ScoreBuilder().withMidExamScore(-1).build();
	}
	@Test(expected=InvalidScore.class)
	public void shoueld_throw_exception_for_final_exam_score_gt_upper_bound() throws InvalidScore {
		Score score = new ScoreBuilder().withMidExamScore(36).build();
	}

}
