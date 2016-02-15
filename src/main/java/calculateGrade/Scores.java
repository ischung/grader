package calculateGrade;

import java.util.HashMap;
import java.util.Iterator;

public class Scores {
	HashMap<String, Score> scoreMap = new HashMap<String, Score>();
	ScoreStrategy ss;
	
	public Scores(ScoreStrategy ss) {
		this.ss = new SimpleScoreStrategy();
	}
	
	public void addScore(String sid, Score score) {
		scoreMap.put(sid, score);
	}
	
	public void setGrade() {
		Iterator itr = scoreMap.keySet().iterator();
		
		while (itr.hasNext()) {
			String sid = (String)itr.next();
			Score score = scoreMap.get(sid);
			Grade g = ss.computeGrade(score);
			score.setGrade(g);
		}
	}

	public Grade getGrade(String sid) {
		Score score = scoreMap.get(sid);
		Grade g = ss.computeGrade(score);
		return g;	
	}
}
