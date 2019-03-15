package threads;

import model.PacMan;
import userInterface.pacManController;

public class pacManThread extends Thread{
	
	private PacMan pacMan;
	private boolean moving;
	private pacManController pacManC;
	
	public pacManThread (PacMan pacMan, pacManController pacManC) {
		this.pacMan = pacMan;
		moving = true;
		this.pacManC = pacManC;
	}
	
	public void run() {
		while(moving) {
			pacMan.movePacMan();
			pacManC.getPacman().setCenterX(pacMan.getX());
			pacManC.getPacman().setCenterY(pacMan.getY());
			try {
				sleep(50);
			}catch(InterruptedException p) {
				p.printStackTrace();
			}
		}
	}

	public PacMan getPacMan() {
		return pacMan;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	
}
