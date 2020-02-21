/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.BLL;

import attendance.automation.be.Student;
import attendance.automation.dal.MockData;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.ObservableList;

/**
 *
 * @author Charlotte
 */
public class BLLManager {
    
    private Student st;
    private final MockData md;
   
    public BLLManager(){
     md = new MockData();
   
   }
    
   public List<Student> getStudentList(){
       
       List<Student> studlist = new ArrayList();
       studlist.addAll(md.studentList());
       return studlist;
   
   } 
   
   public ObservableList<Student> getTeacherStudentList()
   {
       return md.teacherStudentList();
   }
    
   public ObservableList getTeacherClassList()
   {
       return md.teacherClassList();
   }
}
