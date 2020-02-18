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
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        
    }

    public Student(String name, int absenceProcent, String dayMostAbsent)
    {
        this.name = new SimpleStringProperty(name);
        this.absenceProcent = new SimpleIntegerProperty(absenceProcent);
        this.dayMostAbsent = new SimpleStringProperty(dayMostAbsent);
    }

    public Integer getAbsenceProcent()
    {
        return this.absenceProcent.get();
    }

    public void setAbsenceProcent(Integer absenceProcent)
    {
        this.absenceProcent = new SimpleIntegerProperty(absenceProcent);
    }

    public String getDayMostAbsent()
    {
        return this.dayMostAbsent.get();
    }

    public void setDayMostAbsent(String dayMostAbsent)
    {
        this.dayMostAbsent = new SimpleStringProperty(dayMostAbsent);
    }
    
    public String getName() {
        return this.name.get();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public Integer getId() {
        return this.id.get();
    }

    public void setId(IntegerProperty id) {
        this.id = id;
    }
    
}
