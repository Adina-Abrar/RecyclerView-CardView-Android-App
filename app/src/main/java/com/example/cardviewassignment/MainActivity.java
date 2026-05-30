package com.example.cardviewassignment;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<CustomModel> customModelArrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        customModelArrayList.add(new CustomModel(R.drawable.python,     "Python",     "Python Programming"));
        customModelArrayList.add(new CustomModel(R.drawable.java,       "Java",       "Java Programming"));
        customModelArrayList.add(new CustomModel(R.drawable.kotlin,     "Kotlin",     "Kotlin Programming"));
        customModelArrayList.add(new CustomModel(R.drawable.javascript, "Javascript", "Javascript Programming"));
        customModelArrayList.add(new CustomModel(R.drawable.php,        "PHP",        "PHP Programming"));
        customModelArrayList.add(new CustomModel(R.drawable.cpp,        "CPP",        "CPP Programming"));
        customModelArrayList.add(new CustomModel(R.drawable.swift,      "Swift",      "Swift Programming"));
        customModelArrayList.add(new CustomModel(R.drawable.rubby,       "Ruby",       "Ruby Programming"));
        CustomAdapter customAdapter = new CustomAdapter(this,customModelArrayList);
        recyclerView.setAdapter(customAdapter);

    }
}