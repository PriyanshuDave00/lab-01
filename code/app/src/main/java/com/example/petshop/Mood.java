package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    protected Date date;

    // Constructor that sets date to default (current date)
    public Mood() {
        this.date = new Date();
    }

    // Constructor that takes a date as an argument
    public Mood(Date date) {
        this.date = date;
    }

    // Getter
    public Date getDate() {
        return date;
    }

    // Setter
    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();
}
