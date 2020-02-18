/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.student;

import attendance.automation.be.Student;
import attendance.automation.gui.SignInViewController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author zilot
 */
public class StudentMainViewController implements Initializable
{

    @FXML
    private Button btLogout;
    @FXML
    private Button btCalenderView;
    @FXML
    private ToggleGroup precent;
    @FXML
    private RadioButton rbHeretoday;
    @FXML
    private RadioButton rbNotHeretoday;
    @FXML
    private Button submitprecense;
    @FXML
    private AnchorPane studentRootPane;
    @FXML
    private Button btPiecharView;
    @FXML
    private Label lbWelcome ;

   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        Student mads = new Student("Gurli Hansen", 5, "mads", "jensen");
        setName(mads);
    }    
    
    public void setName(Student stud){
       StringProperty name = stud.getName();
       
       
        lbWelcome.textProperty().bind(name);
              
    }
    
   
    
    @FXML
    private void HandleLogout(ActionEvent event) throws IOException {
            
            Window window = studentRootPane.getScene().getWindow();
            
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

    @FXML
    private void handelCalenderview(ActionEvent event)  {
            
       try
        {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/attendance/automation/gui/student/StudentCalenderView.fxml"));
                
            studentRootPane.getChildren().setAll(pane);
  
        } catch (IOException ex)
        {
            System.out.println(ex);
        }
     
     
        
    }

      @FXML
    private void handelPieChart (ActionEvent event)  {
            
       try
        {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/attendance/automation/gui/student/StudentChartView.fxml"));
                
            studentRootPane.getChildren().setAll(pane);
  
        } catch (IOException ex)
        {
            System.out.println(ex);
        }
     
     
        
    }
    
    @FXML
    private void handelSubmit(ActionEvent event) {
    }
    

}
