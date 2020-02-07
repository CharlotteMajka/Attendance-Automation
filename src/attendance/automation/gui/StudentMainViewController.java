/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author zilot
 */
public class StudentMainViewController implements Initializable
{

    @FXML
    private RadioButton rbPresence1;
    @FXML
    private RadioButton rbAbsent1;
    @FXML
    private Label lbDate1;
    @FXML
    private Label lbClass1;
    @FXML
    private Label lbTeacher1;
    @FXML
    private Label lbDate2;
    @FXML
    private Label lbClass2;
    @FXML
    private Label lbTeacher2;
    @FXML
    private RadioButton rbPresence2;
    @FXML
    private RadioButton rbAbsent2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
