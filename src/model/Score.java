package model;


public class Score {
	private String nameUser;
	private int score;

	
	public Score(String nameUser, int score) {
		this.nameUser = nameUser;
		this.score = score;
		
	}

	public String getNameUser() {
		return nameUser;
	}

	public int getScore() {
		return score;
	}

}
