/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.automation.gui.model;

import java.util.Calendar;

/**
 *
 * @author Charlotte
 */
public class CalendarModel {
    
    
    Calendar calendar = Calendar.getInstance();
    
    public int getCurrentMonth(){
        
        return calendar.get(Calendar.MONTH);
        
    }
    
    
    public int getCurrentWeek(){
        
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }
    
    
    public int getYear(){
    return calendar.get(Calendar.YEAR);
    
    }
}
