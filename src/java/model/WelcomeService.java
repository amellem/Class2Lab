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
    private String name;
    
    public WelcomeService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public String greeting(String name){
        return "Good " + determinePartOfDay() + ", " + name + ". Welcome!";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.time);
        hash = 13 * hash + this.hourOfDay;
        hash = 13 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WelcomeService other = (WelcomeService) obj;
        if (this.hourOfDay != other.hourOfDay) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.time, other.time);
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
