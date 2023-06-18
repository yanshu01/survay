package com.example.Survay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void nextButoon(View view){
        setContentView(R.layout.secondndquestions);
    }
    public void secondlayout(View view){
        setContentView(R.layout.thirdquestions);

    }
    public void thirdlayout(View view){
        setContentView(R.layout.fourth);
    }
    public void fourthlayout(View view){
        setContentView(R.layout.finalq);
    }
    public void welcomescreen(View view){
        setContentView(R.layout.welcomr);
    }
    public void homeScreen(View view){
        setContentView(R.layout.activity_main);
    }
    public void firstPrevious(View view){
        setContentView(R.layout.activity_main);
    }
    public void secondPrevious(View view){
        setContentView(R.layout.secondndquestions);
    }
    public void thirdPrevious(View view){
        setContentView(R.layout.thirdquestions);
    }
    public void fourthPrevious (View view){
        setContentView(R.layout.fourth);
    }

    }

