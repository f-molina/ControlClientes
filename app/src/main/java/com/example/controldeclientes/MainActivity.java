package com.example.controldeclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tView1;
    TextView tView2;
    Button contador;
    Button contador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tView1 = (TextView)findViewById(R.id.cont1);
        contador = (Button)findViewById(R.id.btn1);
        tView2 = (TextView)findViewById(R.id.cont2);
        contador2 = (Button)findViewById(R.id.btn2);

        contador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int t = Integer.parseInt(tView1.getText().toString());
                tView1.setText(String.valueOf(t+1));
            }
        });

        contador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int t = Integer.parseInt(tView2.getText().toString());
                tView2.setText(String.valueOf(t+1));
            }
        });

    }
}
