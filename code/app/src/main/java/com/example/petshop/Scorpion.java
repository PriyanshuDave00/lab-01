package com.example.petshop;

class Scorpion extends Pet{
    public Scorpion(String name) {
        super(name);
    }
    // In Cat class
    @Override
    public String speak() {
        return "hiss"; // Cats meow
    }
}

