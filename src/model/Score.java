package model;


public class Score {
	private String nameUser;
	private int score;
	public final static String PATH_FILE= "C:/users/linas/pacMan.txt";
	public final static String EXPORT_FILE= "C:/users/linas/PacMan.txt";
	
	public Score(String nameUser, int score) {
		this.nameUser = nameUser;
		this.score = score;
		
	}

}
