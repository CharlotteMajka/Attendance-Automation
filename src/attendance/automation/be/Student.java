/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.be;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Charlotte
 */
public class Student {
    
    private StringProperty name;
    private IntegerProperty id;
    private IntegerProperty absenceProcent;
    private StringProperty dayMostAbsent;
    public StringProperty username;
    public StringProperty password;
    
    public Student(String name, int id, String username, String password)
    {
        this.id = new SimpleIntegerProperty();
        this.name = new SimpleStringProperty(name);
        this.username = new SimpleStringProperty();
        this.password = new SimpleStringProperty();
        
    }

    public Student(String name, int absenceProcent, String dayMostAbsent)
    {
      
    }
    public StringProperty getUsername(){
        return username;
    }
    
    public void setUsername(StringProperty username){
        this.username = username;
    }
    public StringProperty getPassword(){
        return password;
    }
    
    public void setpassword(StringProperty password){
        this.password = password;
    }
    
    public IntegerProperty getAbsenceProcent()
    {
        return absenceProcent;
    }

    public void setAbsenceProcent(IntegerProperty absenceProcent)
    {
        this.absenceProcent = absenceProcent;
    }

    public StringProperty getDayMostAbsent()
    {
        return dayMostAbsent;
    }

    public void setDayMostAbsent(StringProperty dayMostAbsent)
    {
        this.dayMostAbsent = dayMostAbsent;
    }
    
    public StringProperty getName() {
        return name;
    }

    public void setName(StringProperty name) {
        this.name = name;
    }

    public IntegerProperty getId() {
        return id;
    }

    public void setId(IntegerProperty id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + '}';
    }
    
    
    
}
