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
    
    public Student(String name, int id)
    {
        this.id = new SimpleIntegerProperty();
        this.name = new SimpleStringProperty();
        
    }

    public Student(String name, int absenceProcent, String dayMostAbsent)
    {
        this.name = new SimpleStringProperty();
        this.absenceProcent = new SimpleIntegerProperty();
        this.dayMostAbsent = new SimpleStringProperty();
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
    
}
