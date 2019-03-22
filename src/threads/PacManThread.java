package threads;

import model.Game;
import model.PacMan;
import userInterface.pacManController;

public class PacManThread extends Thread{
	
	private PacMan pacMan;
	private boolean moving;
	private Game game;
	private pacManController pacManC;
	
	public PacManThread (Game game, pacManController pacManC, PacMan pacMan) {
		this.game = game;
		moving = true;
		this.pacManC = pacManC;
		this.pacMan = pacMan;
	}
	
	public void run() {
		while(moving) {

			pacMan.movePacMan();

			try {
				sleep(50);
			}catch(InterruptedException p) {
				p.printStackTrace();
			}
		}
	}

	public Game getGame() {
		return game;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	
}
