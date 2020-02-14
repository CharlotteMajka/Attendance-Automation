/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.student;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.chart.PieChart;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Charlotte
 */
public class StudentChartViewController implements Initializable {

    @FXML
    private AnchorPane studentChartRootpane;
    @FXML
    private PieChart pieChart;
    @FXML
    private BarChart<?, ?> barChart;
    @FXML
    private HBox hBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        setPieChartData();
        setBarData();
        
        
    }    

    @FXML
    private void handelBackToMainView(ActionEvent event) {
    }
    
    
    public void setPieChartData(){
        ObservableList<PieChart.Data> pieChartData =   FXCollections.observableArrayList(
        new PieChart.Data("Presence", 48),
        new PieChart.Data("Absent", 52));  
        
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Overview");
        
 
        
        pieChart.getData().addAll(pieChartData);
    
    }
    
    public void setBarData(){
     
  String monday = "Monday";
  String tuesday = "Tuesday";
  String wednesday = "Wednesday";
  String thursday = "Thursday";
  String friday = "Friday";
   barChart.setTitle("Week overview");
        
      XYChart.Series presence = new XYChart.Series<>();
      XYChart.Series absent = new XYChart.Series<>();
    
      presence.setName("Presence");
      presence.getData().add(new XYChart.Data(monday, 5));
      presence.getData().add(new XYChart.Data(tuesday, 4));
      presence.getData().add(new XYChart.Data(wednesday, 8));
      presence.getData().add(new XYChart.Data(thursday, 3));
      presence.getData().add(new XYChart.Data(friday, 2));
      
      absent.setName("Absent");
      absent.getData().add(new XYChart.Data(monday, 3));
      absent.getData().add(new XYChart.Data(tuesday, 2));
      absent.getData().add(new XYChart.Data(wednesday, 1));
      absent.getData().add(new XYChart.Data(thursday, 0));
      absent.getData().add(new XYChart.Data(friday, 10));
      
      
      
      barChart.getData().addAll(presence, absent);
     

      
    
    }
    
    
}
