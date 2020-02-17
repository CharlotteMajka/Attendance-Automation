/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.student;

import attendance.automation.gui.SignInViewController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author Charlotte
 */
public class StudentCalenderViewController implements Initializable {
    @FXML
    private AnchorPane studentCalenderRootpane;
    
  

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handelBackToMainView(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/attendance/automation/gui/student/StudentMainView.fxml"));

        studentCalenderRootpane.getChildren().setAll(pane);
       
        
        }
    
        @FXML
    private void HandleLogout(ActionEvent event) throws IOException {
              Window window = studentCalenderRootpane.getScene().getWindow();
            
            if(window instanceof Stage){
            ((Stage) window).close();
            }
            
            FXMLLoader fxmlLoader = new FXMLLoader();
         
            Parent root = (Parent) fxmlLoader.load(getClass().getResource("/attendance/automation/gui/SignInView.fxml").openStream());
            SignInViewController cont = (SignInViewController) fxmlLoader.getController();
            Stage stage = new Stage();
            
            stage.setTitle("Sign in");
            stage.setScene(new Scene(root));
            stage.show();
        
    }
    
}
