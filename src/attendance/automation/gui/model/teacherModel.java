/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.model;

import attendance.automation.BLL.BLLManager;
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
    BLLManager bll = new BLLManager();
    
    
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
        return bll.getTeacherClassList();
    }
    
    public ObservableList<Student> studentList()
    {
        return bll.getTeacherStudentList();
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
