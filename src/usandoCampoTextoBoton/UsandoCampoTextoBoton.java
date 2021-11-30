
package usandoCampoTextoBoton;

import campoTextoBoton.CampoTextoBoton;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UsandoCampoTextoBoton extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        
        CampoTextoBoton ctb = new CampoTextoBoton(); 
        HBox root = new HBox();        
        Scene scene = new Scene(root, 300, 250);
        
        root.getChildren().add(ctb);
        
        stage.setTitle("CampoTextoBoton");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
