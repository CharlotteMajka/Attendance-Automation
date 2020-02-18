/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.dal;

import attendance.automation.be.Student;
import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Charlotte
 */
public class MockData {
    
    
 
    
        
     public ObservableList studentList()
    {
        ObservableList<Student> studentList = FXCollections.observableArrayList();
        Student mads = new Student("Mads Jensen", 5, "mads", "jensen");
        //Student Gurli = new Student("Gurli Hansen", 6, "gurli", "hansen");

        
        studentList.add(mads);
        //studentList.add(Gurli);
        
        
        return studentList;
    }
   

     
}
