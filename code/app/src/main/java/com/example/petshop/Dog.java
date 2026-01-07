package com.example.petshop;

class Dog extends Pet implements Pettable{
    public Dog(String name) {
        super(name);
    }
    // In Cat class
    @Override
    public String speak() {
        return "bark"; // Cats meow
    }
    @Override
    public Void pet() {
        return null;
    }
}