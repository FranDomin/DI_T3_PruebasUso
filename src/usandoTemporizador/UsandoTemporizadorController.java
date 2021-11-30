
package usandoTemporizador;

import controlTemporizador.ControlTemporizador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class UsandoTemporizadorController implements Initializable 
{

    @FXML
    private TextField fieldNumerico;
    @FXML
    private Button btnEmpezar;
    @FXML
    private ControlTemporizador controlTemporizador;

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    

    @FXML
    private void comenzarTemporizador(ActionEvent event) 
    {
        IntegerProperty tiempo = new SimpleIntegerProperty(Integer.parseInt(fieldNumerico.getText()));
        controlTemporizador.iniciarTemporizador(tiempo);
    } 
    
}
