/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.model;

import attendance.automation.BLL.BLLManager;
import attendance.automation.be.Student;
import attendance.automation.dal.MockData;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.chart.XYChart;

/**
 *
 * @author Charlotte
 */
public class StudentModel {
    
        private final  String monday = "Monday";
        private final  String tuesday = "Tuesday";
        private final  String wednesday = "Wednesday";
        private final  String thursday = "Thursday";
        private final  String friday = "Friday";
       // private final List<Student> listofStudents;
        private final BLLManager bll;
        private String username;
        private String password;
        private ObservableList<PieChart.Data> pieChartData;
        
        
       public StudentModel(){
        bll = new BLLManager();
       } 
        
    
       
    public ObservableList<PieChart.Data> setPiechartData(){
        
       pieChartData =   FXCollections.observableArrayList(
        new PieChart.Data("Presence", 48),
        new PieChart.Data("Absent", 52));  
        

        
        return pieChartData;
        
    }
    


//updates existing Data-Object if name matches
public void addData()
{
    
   for(Data d : pieChartData)
    {
        if(d.getName().equals("Absent"))
        {
            d.setPieValue(60);
            return;
        }
    }
    
}
 
    
    public XYChart.Series setPresence(){

        XYChart.Series presence = new XYChart.Series<>();

        presence.setName("Presence");
        presence.getData().add(new XYChart.Data(monday, 5));
        presence.getData().add(new XYChart.Data(tuesday, 4));
        presence.getData().add(new XYChart.Data(wednesday, 8));
        presence.getData().add(new XYChart.Data(thursday, 3));
        presence.getData().add(new XYChart.Data(friday, 2));

    
        
        return presence;
    }
    
     public XYChart.Series setAbsent(){
    
        XYChart.Series absent = new XYChart.Series<>();

        absent.setName("Absent");
        absent.getData().add(new XYChart.Data(monday, 3));
        absent.getData().add(new XYChart.Data(tuesday, 2));
        absent.getData().add(new XYChart.Data(wednesday, 1));
        absent.getData().add(new XYChart.Data(thursday, 0));
        absent.getData().add(new XYChart.Data(friday, 10));
        
        return absent;
    }

    public String getUsername()
    {
        return bll.getUsernameStudent();
    }

    public String getPassword()
    {
        return bll.getPasswordStudent();
    }

    
}
