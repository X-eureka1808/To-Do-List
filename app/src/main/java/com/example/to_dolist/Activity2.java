package com.example.to_dolist;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        EditText events=findViewById(R.id.Events);
        Button saveButton=findViewById(R.id.button3);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Activity2.this,Activity3.class);
                String Items= events.getText().toString().trim();
                i.putExtra("Value",Items);
                startActivity(i);
                finish();

            }
        });

    }
    public void openActivity3(){
        Intent intent=new Intent(this,Activity3.class);
        startActivity(intent);
    }
}