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
        Student hans = new Student("Hans Jørgensen", 7, "hans", "jørgensen");
        Student hilda = new Student("Hilda Kristensen", 8, "hilda", "kristensen");
        Student huggo = new Student("Huggo Collins ", 9, "huggo", "collins");
        Student pia = new Student("Pia Møller", 10, "pia", "møller");
        Student lone = new Student("Lone Thomsen", 11, "lone", "thomsen");
        Student rikke = new Student("Rikke Blicher", 12, "rikke", "blicher");
        Student simba = new Student("Simba Åsted", 13, "simba", "åsted");
        
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

     
     
    public ObservableList<Student> teacherStudentList()
    {
        ObservableList<Student> studentList = FXCollections.observableArrayList(
        new Student("Mads Jensen", 16, "Tuesday"),
        new Student("Sascha Mikkelsen", 28, "Thursday"),
        new Student("Karl Jensen", 25, "Monday"),
        new Student("Pernille Carlsen", 78, "Friday"),
        new Student("Anders Davidsen", 12, "Monday"),
        new Student("Rebecca Friis", 54, "Wednesday"),
        new Student("Margret Grief", 98, "Tuesday")
        );
        
        return studentList;
    }
     
    public ObservableList teacherClassList()
    {
        ObservableList<String> teacherClassList = FXCollections.observableArrayList();
        teacherClassList.add("CSe2019A");
        
        return teacherClassList;
    }
    
}
