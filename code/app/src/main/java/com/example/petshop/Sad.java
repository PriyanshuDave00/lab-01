package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {

    // Default constructor
    public Sad() {
        super();
    }

    // Constructor with date
    public Sad(Date date) {
        super(date);
    }
    
    @Override
    public String getMood(){
        return "Sad";
    }
}
