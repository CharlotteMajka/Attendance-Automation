/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.model;

import attendance.automation.be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Christina
 */
public class teacherModel
{
    public ObservableList classList()
    {
        ObservableList<String> teacherClassList = FXCollections.observableArrayList();
        teacherClassList.add("CSe2019A");
        
        return teacherClassList;
    }
    
    public ObservableList studentList()
    {
        ObservableList<Student> studentList = FXCollections.observableArrayList();
        Student a = new Student("Mads Jensen", 16, "Tuesday");
        Student b = new Student("Sascha Mikkelsen", 28, "Thursday");
        Student c = new Student("Karl Jensen", 25, "Monday");
        Student d = new Student("Pernille Carlsen", 78, "Friday");
        Student e = new Student("Anders Davidsen", 12, "Monday");
        Student f = new Student("Rebecca Friis", 54, "Wednesday");
        
        studentList.add(a);
        studentList.add(b);
        studentList.add(c);
        studentList.add(d);
        studentList.add(e);
        studentList.add(f);
        
        return studentList;
    }
}
