/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.model;

import attendance.automation.BLL.BLLManager;
import attendance.automation.be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Christina
 */
public class teacherModel
{
    private BLLManager bll;
  
    
    public teacherModel()
    {
        bll = new BLLManager();
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
        return bll.getUsernameTeacher();
    }


    public String getPassword()
    {
        return bll.getPasswordTeacher();
    }

    
}
