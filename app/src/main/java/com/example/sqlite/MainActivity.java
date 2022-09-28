package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbHandler handler = new DbHandler(this, "empdb",null,1);
        handler.addEmployee(new Employee(4, "VarunDK", 33.3));
        handler.getEmployee(1);
        handler.getEmployee(4);
        handler.close();
    }
}