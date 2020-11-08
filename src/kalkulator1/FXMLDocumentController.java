/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author irwnd
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btSatu;
    @FXML
    private Button btDua;
    @FXML
    private Button btTiga;
    @FXML
    private Button brPlus;
    @FXML
    private Button btEmpat;
    @FXML
    private Button btLima;
    @FXML
    private Button brBintang;
    @FXML
    private Button brMin;
    @FXML
    private Button btNol;
    @FXML
    private Button brEnter;
    @FXML
    private Button brClear;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClicked(ActionEvent event) {
    }
    
}
