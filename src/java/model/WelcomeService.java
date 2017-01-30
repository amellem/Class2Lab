/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author CloudAerius
 */
public class WelcomeService {
    private final Calendar time = Calendar.getInstance();
    private final int hourOfDay = time.get(Calendar.HOUR_OF_DAY);
    
    public WelcomeService() {
    }
    
    /**
     *
     * @return String for what part of the day it is
     */
    public String determinePartOfDay(){
        
        if (hourOfDay >= 0 && hourOfDay < 12){
            return "Morning";
        } else if (hourOfDay >= 12 && hourOfDay < 17){
            return "Afternoon";
        } else {
            return "Evening";
        }
    }
    
    /**
     * 
     * @param name
     * @return concatenated greeting with the part of the day and the name
     */
    public String doGreeting(String name){
        return "Good " + determinePartOfDay() + ", " + name + ". Welcome!";
    }
  
}
