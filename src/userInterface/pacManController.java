package userInterface;


import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import model.PacMan;
import threads.pacManThread;

public class pacManController {

    @FXML
    private Pane pane;
    
    private Arc pacman;

    @FXML
    void initialize(){
    
    	PacMan pac= new PacMan(30, 30, PacMan.RIGTH, 5, 30, 100, false, 0, 600, 400);//pane.getWidth(), pane.getHeight());
    		
    	pacman = new Arc(pac.getX(), pac.getY(), pac.getRadius(), pac.getRadius(), PacMan.ANGLE, PacMan.LENGTH); 
    	
    	pacman.setType( ArcType.ROUND ) ;
        pacman.setFill( Color.YELLOW ) ; 
        
    	
    	pane.getChildren().add(pacman);
    	
    	pacManThread pacManT = new pacManThread(pac, this);
    	pacManT.start();

    }
    public Arc getPacman() {
    	return pacman;
    	
    }

}
