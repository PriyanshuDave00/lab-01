package com.example.petshop;

import java.util.Date;

class Cat extends Pet implements Pettable{
    public Cat(String name) {
        super(name);
    }
    // In com.example.petshop.Cat class
    public Cat(String name, Date birthDate){
        super(name,birthDate);
    }
    @Override
    public String speak() {
        return "meow"; // Cats meow
    }
    @Override
    public Void pet() {
        return null;
    }

}