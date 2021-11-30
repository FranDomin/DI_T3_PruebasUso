
package appUsoTextoBoton;

import campoTextoBoton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class AppUsoTextoBotonController implements Initializable 
{

    @FXML
    private CampoTextoBoton campoSuperior;
    @FXML
    private CampoTextoBoton campoInferior;
    @FXML
    private Label lblTexto;


    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        campoSuperior.setTextoBoton("Guardar");
        campoInferior.setTextoBoton("Guardar");
    }  

    @FXML
    private void onActionSup(ActionEvent event) 
    {
        lblTexto.setText("Texto del campo Superior: " + campoSuperior.getText());
    }

    @FXML
    private void onActionInf(ActionEvent event) 
    {
        lblTexto.setText("Texto del campo Inferior: " + campoInferior.getText());
    }
    
    
    
}
