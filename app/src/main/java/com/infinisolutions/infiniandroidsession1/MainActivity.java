package com.infinisolutions.infiniandroidsession1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextAge;
    Button btnFutureAge;
    TextView txtFutureAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);

        btnFutureAge = findViewById(R.id.btnFutureAge);
        txtFutureAge = findViewById(R.id.txtFutureAge);

        btnFutureAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                try {
                    txtFutureAge.setTextColor(Color.BLACK);
                    int age = Integer.parseInt(editTextAge.getText().toString());
                    txtFutureAge.setText(String.format("Hello %s, you are %d years old in 5 years. Have a great life.", name, age+5));
                }catch (NumberFormatException e){
                    txtFutureAge.setTextColor(Color.RED);
                    txtFutureAge.setText("Please provide your age.");
                }

            }
        });
    }
}