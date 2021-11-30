
package appUsoTextoBoton;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class APPUsoTextoBoton extends Application 
{   
    @Override
    public void start(Stage primaryStage) throws IOException
    {        
        Parent root = FXMLLoader.load(getClass().getResource("AppUsoTextoBoton.fxml")); 
        
        Scene scene = new Scene(root, 400, 300);
        
        primaryStage.setTitle("4.6.2 - CampoTextoBoton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
