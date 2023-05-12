package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.calculator.feaure.EMI_Calculator;
import com.example.calculator.feaure.GeneralCalculator;
import com.example.calculator.feaure.SI_Calculator;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    public ArrayList<String> activitylist;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        activitylist = new ArrayList<>();
        activitylist.add("GeneralCalculator");
        activitylist.add("EMI Calculator");
        activitylist.add("SI Calculator");

        Class<?>[] activities = {GeneralCalculator.class, EMI_Calculator.class, SI_Calculator.class};

        recyclerView = findViewById(R.id.recycle);
        recAdapter adapter = new recAdapter(activitylist,activities,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);


    }
}