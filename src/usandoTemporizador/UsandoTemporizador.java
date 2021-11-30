
package usandoTemporizador;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class UsandoTemporizador extends Application 
{
    
    @Override
    public void start(Stage primaryStage) throws IOException
    {   
        Parent root = FXMLLoader.load(getClass().getResource("UsandoTemporizador.fxml"));
        
        Scene scene = new Scene(root, 600, 400);
        
        primaryStage.setTitle("Temporizador");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
