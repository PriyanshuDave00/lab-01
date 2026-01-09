package com.example.petshop;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ArrayList<Pet> petList = new ArrayList<Pet>();

        // Can store both Cat and Dog objects
        // since they both inherit from Pet
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();

        pettablePets.add(cat);
        pettablePets.add(dog);
        pettablePets.add(scorpion); // This should produce an error

        Mood mood1 = newHappyMood();
        Mood mood2 = newSadMood(new Data());

        String mood1text = mood1.getMood();
        String mood2text = mood2.getMood();

    }


}
