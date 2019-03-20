package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<PacMan> pacMans;
	private Score[] scores;
	private int level;
	private double windowW;
	private double windowH;

	public Game(int level, double windowW, double windowH) {
		this.level = level;
		scores = new Score[30];
		this.windowW = windowW;
		this.windowH = windowH;
		pacMans = new ArrayList<PacMan>();

	}

	public void loadGameFile(String path, String sep) throws IOException {
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		while(line != null) {
			if(!line.startsWith("#")) {

				String[] parts = line.split("\t");

				int level = Integer.parseInt(parts [0]);
				int x = Integer.parseInt(parts[1]);
				int y = Integer.parseInt(parts [2]);
				String direction = parts[3];
				int velocity = Integer.parseInt(parts[4]);
				int radius = Integer.parseInt(parts [5]);
				int waitTime= Integer.parseInt(parts [6]);
				boolean stoped = Boolean.valueOf(parts [7]);
				int rebounce = Integer.parseInt(parts [8]);

				PacMan p = new PacMan(x, y, direction, velocity,radius,waitTime,stoped,rebounce, windowW, windowH);
				pacMans.add(p);

			}

			br.close();
			fr.close();

		}

	}

	public int getLevel() {
		return level;
	}
	public ArrayList<PacMan> getPacMans(){
		return (ArrayList<PacMan>) pacMans;
	}

}
