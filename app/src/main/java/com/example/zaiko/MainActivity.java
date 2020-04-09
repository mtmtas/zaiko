package com.example.zaiko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private EditText editText1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=new Button(this);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener((OnClickListener) this);

        button2=new Button(this);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener((OnClickListener) this);

        button3=new Button(this);
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener((OnClickListener) this);

        button4=new Button(this);
        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener((OnClickListener) this);

        button5=new Button(this);
        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener((OnClickListener) this);

        final EditText editText1=(EditText)findViewById(R.id.editText1);





    }
}
