package threads;

import model.PacMan;
import userInterface.pacManController;

public class PacManThread extends Thread{

	private PacMan pacMan;
	private boolean moving;
	private pacManController pacManC;

	public PacManThread (pacManController pacManC, PacMan pacMan) {

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

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	public pacManController getPacManC() {
		return pacManC;
	}

}


