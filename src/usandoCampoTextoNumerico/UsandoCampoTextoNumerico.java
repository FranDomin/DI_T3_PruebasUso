
package usandoCampoTextoNumerico;

import campoTextoNumerico.CampoTextoNumerico;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UsandoCampoTextoNumerico extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        
        CampoTextoNumerico ctn = new CampoTextoNumerico(); 
        HBox root = new HBox();        
        Scene scene = new Scene(root, 300, 250);
        
        root.getChildren().add(ctn);
        
        stage.setTitle("CampoTextoNumerico");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
