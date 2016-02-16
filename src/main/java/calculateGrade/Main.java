package calculateGrade;

public class Main {

	public static void main(String[] args) {
		    Scores scores = new Scores(new SimpleScoreStrategy());
	    Score score = new Score(35, 30, 25);
	    String sid = "1234";
	    scores.addScore(sid, score);
	    Grade g = scores.getGrade(sid);
		System.out.println(sid+":: "+g);
	}

}
