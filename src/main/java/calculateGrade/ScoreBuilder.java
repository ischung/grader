package calculateGrade;

public class ScoreBuilder {

	private int mScore = 0;
	private int fScore = 0;
	private int hScore = 0;
	
	public ScoreBuilder() {}

	public ScoreBuilder withMidExamScore(int mScore) throws InvalidScore {
		if (isValidMidScore(mScore))	{
			this.mScore = mScore;
			return this;
		} else
				throw new InvalidScore();		
	}

	private boolean isValidMidScore(int mScore) {
		if (mScore<0||mScore>35 ) return false;
		return true;
	}
	
	public ScoreBuilder withFinalExamScore(int fScore) throws InvalidScore {
		if (isValidFinalScore(fScore))	{
			this.fScore = fScore;
			return this;
		} else
				throw new InvalidScore();
	}
	
	private boolean isValidFinalScore(int fScore) {
		if (fScore<0||fScore>35 ) return false;
		return true;
	}
	
	public ScoreBuilder withHomeWorkScore(int hScore) {
		this.hScore = hScore;
		return this;
	}
	public Score build() {
		return new Score(this.mScore, this.fScore, this.hScore);
	}

}
