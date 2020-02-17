/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui;

import attendance.automation.gui.teacher.TeacherMainViewController;
import attendance.automation.gui.student.StudentMainViewController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author zilot
 */
public class SignInViewController implements Initializable
{
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button signInButton;
    @FXML
    private Label label;
    
    private String userStudent;
    private String passStudent;
    private String userTeacher;
    private String passTeacher;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        userStudent = "mads";
        passStudent = "jensen";
        
        userTeacher = "jeppe";
        passTeacher = "baby";
    }    

    /**
     * handels the sign in function, checks if the person signing in is a teacher
     * or a student. If it the person does not exist, it gives an alert to the user
     * @param event
     * @throws IOException 
     */
    @FXML
    private void handleSignIn(ActionEvent event) throws IOException
    {
      String user = username.getText();
      String pass = password.getText();
      Stage signInView = (Stage) ((Node) event.getSource()).getScene().getWindow();
      
      if(user.equals(userStudent) && pass.equals(passStudent))
      {
          FXMLLoader fxmlLoader = new FXMLLoader();
          
          Parent root;
          root = (Parent) fxmlLoader.load(getClass().getResource("/attendance/automation/gui/student/StudentMainView.fxml").openStream());
          StudentMainViewController cont = (StudentMainViewController) fxmlLoader.getController();
          Stage stage = new Stage();
          stage.setTitle("Attendance - Student");
          stage.setScene(new Scene(root));
          stage.show();
          signInView.hide();
      }
      else if(user.equals(userTeacher) && pass.equals(passTeacher))
      {
          FXMLLoader fxmlLoader = new FXMLLoader();
          
          Parent root = (Parent) fxmlLoader.load(getClass().getResource("/attendance/automation/gui/teacher/TeacherMainView.fxml").openStream());
          TeacherMainViewController cont = (TeacherMainViewController) fxmlLoader.getController();
          Stage stage = new Stage();
          stage.setTitle("Attendance - Teacher");
          stage.setScene(new Scene(root));
          stage.show();
          signInView.hide();
      }
      else
      {
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Oops");
                alert.setHeaderText("Oops, something went wrong");
                alert.setContentText("Wrong username or password, please try again");
                alert.showAndWait();
      }
        
    }
    
}
