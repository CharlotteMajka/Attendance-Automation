/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.dal;

import attendance.automation.be.Student;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Charlotte
 */
public class MockData {
    
    
 
    
        
     public List<Student> studentList()
    {
        
        Student mads = new Student("Mads Jensen", 5, "mads", "jensen");
        Student gurli = new Student("Gurli Hansen", 6, "gurli", "hansen");
        Student hans = new Student("Hans Jørgensen", 6, "gurli", "hansen");
        Student hilda = new Student("Hilda Kristensen", 6, "gurli", "hansen");
        Student huggo = new Student("Huggo Collins ", 6, "gurli", "hansen");
        Student pia = new Student("Pia Møller", 6, "gurli", "hansen");
        Student lone = new Student("Lone Thomsen", 6, "gurli", "hansen");
        Student rikke = new Student("Rikke Blicher", 6, "gurli", "hansen");
        Student simba = new Student("Simba Åsted", 6, "gurli", "hansen");
        
        ArrayList<Student> studentList = new ArrayList();
        
        studentList.add(mads);
        studentList.add(gurli);
        studentList.add(hans);
        studentList.add(hilda);
        studentList.add(huggo);
        studentList.add(pia);
        studentList.add(lone);
        studentList.add(lone);
        studentList.add(rikke);
        studentList.add(simba);
        
        
        return studentList;
    }

     
}
