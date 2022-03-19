package com.is1427.is1427_g4_prm391_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputArea;
    Button btnSearch, btnNextDay;
    TextView txtDisplayCity, txtDisplayCountry, txtDisplayTemp, txtDisplayStatus, txtDisplayHumidity, txtDisplayCloud, txtDisplayWind, txtDisplayToday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindingView();
    }

    private void bindingView() {
        inputArea = findViewById(R.id.inputArea);
        btnSearch=findViewById(R.id.btnSearch);
        btnNextDay=findViewById(R.id.btnNextDay);
        txtDisplayCity=findViewById(R.id.txtDisplayCity);
        txtDisplayCountry=findViewById(R.id.txtDisplayCountry);
        txtDisplayTemp=findViewById(R.id.txtDisplayTemp);
        txtDisplayStatus=findViewById(R.id.txtDisplayStatus);
        txtDisplayHumidity=findViewById(R.id.txtDisplayHumidity);
        txtDisplayCloud=findViewById(R.id.txtDisplayCloud);
        txtDisplayWind=findViewById(R.id.txtDisplayWind);
        txtDisplayToday=findViewById(R.id.txtDisplayToday);
    }
}