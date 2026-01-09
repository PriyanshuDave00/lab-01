package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {

    // Default constructor
    public Happy() {
        super();
    }

    // Constructor with date
    public Happy(Date date) {
        super(date);
    }

    @Override
    public String getMood(){
        return "Happy";
    }
}
