package calculateGrade;

public class SimpleScoreStrategy implements ScoreStrategy {

	public Grade computeGrade(Score score) {
		int total = score.getMiddle()+score.getFinal()+score.getHW();
		if (total>=90) return Grade.A;
		else if (total>=80) return Grade.B;
		else if (total>=70) return Grade.C;
		else return Grade.F;
	}
}
