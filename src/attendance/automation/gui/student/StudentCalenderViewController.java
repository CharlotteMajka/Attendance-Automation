/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.student;

import attendance.automation.gui.SignInViewController;
import attendance.automation.gui.model.CalendarModel;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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
    @FXML
    private RadioButton rbHeretoday;
    @FXML
    private ToggleGroup precent;
    @FXML
    private RadioButton rbNotHeretoday;
    @FXML
    private Button submitprecense;
    @FXML
    private RadioButton rbHeretoday1;
    @FXML
    private ToggleGroup precent1;
    @FXML
    private RadioButton rbNotHeretoday1;
    @FXML
    private Button submitprecense1;
    @FXML
    private RadioButton rbHeretoday2;
    @FXML
    private ToggleGroup precent2;
    @FXML
    private RadioButton rbNotHeretoday2;
    @FXML
    private Button submitprecense2;
    @FXML
    private RadioButton rbHeretoday3;
    @FXML
    private ToggleGroup precent3;
    @FXML
    private RadioButton rbNotHeretoday3;
    @FXML
    private Button submitprecense3;
    @FXML
    private RadioButton rbHeretoday4;
    @FXML
    private ToggleGroup precent4;
    @FXML
    private RadioButton rbNotHeretoday4;
    @FXML
    private Button submitprecense4;
    @FXML
    private Label weekLabel;
    
    private CalendarModel calendarModel;
  

    public StudentCalenderViewController(){
        
    
    
    }
    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        calendarModel = new CalendarModel();
        setWeekLabel();
        
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

    @FXML
    private void handelSubmit(ActionEvent event) {
    }
   
    private void setWeekLabel()
    {
        String label = "Week " + calendarModel.getCurrentWeek()+" of";
        label += " " + calendarModel.getYear();
        weekLabel.setText(label);
    }
}
