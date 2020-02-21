/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.model;

import attendance.automation.be.Student;
import attendance.automation.dal.MockData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Christina
 */
public class teacherModel
{
    private String username;
    private String password;
    private MockData md;
    
    public teacherModel()
    {
        username = "jeppe";
        password = "baby";
        md = new MockData();
    }
    
    public ObservableList classList()
    {
        ObservableList<String> teacherClassList = FXCollections.observableArrayList();
        teacherClassList.add("CSe2019A");
        
        return teacherClassList;
    }
    
    public ObservableList<Student> studentList()
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

    public String getUsername()
    {
        return md.getUsernameTeacher();
    }


    public String getPassword()
    {
        return md.getPasswordTeacher();
    }

    
}
