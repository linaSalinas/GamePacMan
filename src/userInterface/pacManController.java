package userInterface;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import model.PacMan;
import threads.PacManThread;
import model.Game;

public class pacManController {

    @FXML
    private Pane pane;
    
    private Game game;
    
    private PacMan pacman;
    
    @FXML
    public void loadGameMethod(ActionEvent e) {
    
    	
    }
    
    @FXML
    void loadLevel0(ActionEvent event) throws IOException {
    	try {
	    	game = new Game (0, pane.getPrefWidth(), pane.getPrefHeight());
	    	game.loadGameFile("docs/level0.txt", "\t"); 
	    	loadPacMans();
    	}
    	catch(IOException ioe) {
    		
    	}
    	PacManThread pacManT = new PacManThread(pacman, this);
    	pacManT.setDaemon(true);
    	pacManT.start();

    }

    @FXML
    void loadLevel1(ActionEvent event) {
    	try {
	    	game = new Game (0, pane.getPrefWidth(), pane.getPrefHeight());
	    	game.loadGameFile("docs/level1.txt", "\t"); 
	    	loadPacMans();
    	}
    	catch(IOException ioe) {
    		
    	}
    	PacManThread pacManT = new PacManThread(pacman, this);
    	pacManT.setDaemon(true);
    	pacManT.start();

    }

    @FXML
    void loadLevel2(ActionEvent event) {
    	try {
	    	game = new Game (0, pane.getPrefWidth(), pane.getPrefHeight());
	    	game.loadGameFile("docs/level0.txt", "\t"); 
	    	loadPacMans();
    	}
    	catch(IOException ioe) {
    		
    	}
    	PacManThread pacManT = new PacManThread(pacMans,pacman, this);
    	pacManT.setDaemon(true);
    	pacManT.start();

    }
    
    public void loadPacMans() {
    	for(int i=0;i<game.getPacMans().size();i++) {
    		Arc pacman = new Arc(game.getPacMans().get(i).getX(),game.getPacMans().get(i).getY(),game.getPacMans().get(i).getRadius(),game.getPacMans().get(i).getRadius(),game.getPacMans().get(i).ANGLE,game.getPacMans().get(i).LENGTH);
    		
    		pacman.setType( ArcType.ROUND ) ;
    		pacman.setFill( Color.YELLOW );
    		pane.getChildren().add(pacman);
    	}
    }
    
    
    

}
