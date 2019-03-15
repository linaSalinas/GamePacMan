package model;

public class PacMan {
	
	public final static String LEFT = "izquierda";
	public final static String RIGTH = "derecha";
	public final static String UP = "arriba";
	public final static String DOWN = "abajo";
	
	public final static int ANGLE = 45;
	public final static int LENGTH = 270;
	
	public final static double INCREASE = 12.0;
	
	private int x;
	private int y;
	private String direction;
	private int velocity;
	private int radius;
	private int waitTime;
	private boolean stoped;
	private int rebounce;
	private double windowW;
	private double windowH;
	
	public PacMan(int x, int y, String direction, int velocity, int radius, int waitTime, boolean stoped, int rebounce, double windowW, double windowH) {
			
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.velocity = velocity;
		this.radius = radius;
		this.waitTime = waitTime;
		this.stoped = stoped;
		this.rebounce = rebounce;
		this.windowW = windowW;
		this.windowH = windowH;
	}



	public void movePacMan() {
		
		if(x >= windowW) {
			direction = "izquierda";
		}
		if(x <= 0) {
			direction = "derecha";
		}
		if(y <= 0) {
			direction = "abajo";
		}
		if(y>= windowH) {
			direction ="arriba";
		}
		if(direction.equals("izquierda")) {
			x= (int) (x - INCREASE);
		}
		else if (direction.equals("derecha")){
			x = (int) (x + INCREASE);
		}
		else if(direction.equals("arriba")) {
			y = (int) (y - INCREASE);
		}else {
			y = (int) (y + INCREASE);
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getDirection() {
		return direction;
	}

	public int getVelocity() {
		return velocity;
	}

	public int getRadius() {
		return radius;
	}

	public int getWaitTime() {
		return waitTime;
	}

	public boolean isStoped() {
		return stoped;
	}

	public int getRebounce() {
		return rebounce;
	}

	public double getWindowW() {
		return windowW;
	}


	public double getWindowH() {
		return windowH;
	}



}
