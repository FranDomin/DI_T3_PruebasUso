
package appUsoSelector;

import controlDeslizamiento.ControlDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class APPUsoSelectorController implements Initializable 
{
    @FXML
    private ControlDeslizamiento deslizamientoSuperior;
    @FXML
    private ControlDeslizamiento deslizamientoInferior;
    @FXML
    private Label lblTexto;


    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");
        lista.add("Seis");
        lista.add("Siete");
        lista.add("Ocho");
        lista.add("Nueve");
        
        deslizamientoSuperior.setItems(lista);
        deslizamientoInferior.setItems(lista);
    }

    @FXML
    private void accionSup(ActionEvent event) 
    {
        lblTexto.setText("Deslizador Superior Pulsado.");
    }

    @FXML
    private void accionInf(ActionEvent event) 
    {
        lblTexto.setText("Deslizador Inferior Pulsado.");
    }
}
