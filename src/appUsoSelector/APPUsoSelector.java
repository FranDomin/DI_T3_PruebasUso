
package appUsoSelector;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class APPUsoSelector extends Application 
{

   
    
    @Override
    public void start(Stage primaryStage) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("UsandoAPPUsoSelectorFXML.fxml")); 
           
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Selector Deslizamiento");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
