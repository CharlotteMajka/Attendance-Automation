/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.teacher;

import attendance.automation.gui.model.teacherModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author zilot
 */
public class TeacherMainViewController implements Initializable
{

    @FXML
    private ListView<?> classListView;
    @FXML
    private Button nextButton;
    private teacherModel tm;
    @FXML
    private Label welcomeMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        tm = new teacherModel();
        populateList();
        welcomeMessage.setText("Welcome Jeppe!");
        welcomeMessage.setAlignment(Pos.CENTER);
    }    

    @FXML
    private void handleNext(ActionEvent event) throws IOException
    {
        if(classListView.getSelectionModel().getSelectedItem() != null)
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendance/automation/gui/teacher/TeacherClassView.fxml"));
            Parent root = loader.load();
            TeacherClassViewController TCVController = loader.getController();
        
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        
            Stage oldStage = (Stage) nextButton.getScene().getWindow();
            oldStage.close();
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Oops");
                alert.setHeaderText("Oops, something went wrong");
                alert.setContentText("Please select a class to continue");
                alert.showAndWait();
        }
    }
    
    public void populateList()
    {
        classListView.setItems(tm.classList());
    }
}
