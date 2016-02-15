package calculateGrade;

public class Score {

	private int m;
	private int f;
	private int h;
	
	private Grade g;
	
	public Score(int m, int f, int h){

		this.m = m;
		this.f = f;
		this.h = h;
	}

	public int getMiddle() {
		return this.m;
	}
	
	public int getFinal() {
		return this.f;
	}

	public int getHW() {
		return this.h;
	}
	
	public Grade setGrade() {
		return this.g;
	}
	
	public void setGrade(Grade g) {
		this.g = g;
	}

}
