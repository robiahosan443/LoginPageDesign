package com.example.loginpagedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1,editText2;
    private Button button;
    private TextView textView;
    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1= findViewById(R.id.emailedittextId);
        editText2=findViewById(R.id.passwordedittextId);
        button=findViewById(R.id.btnId);
        textView=findViewById(R.id.textViewId);

        button.setOnClickListener(this);
        textView.setText("number of attepmt remain:3");
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String Email = editText1.getText().toString();
        String Pwd = editText2.getText().toString();

        if (Email.equals("ahosan hamid")&& Pwd.equals("1234")){

            Intent intent = new Intent(this,second.class);
            startActivity(intent);


        }else {
            counter--;
            textView.setText("number of attempt:"+counter);
            if (counter==0){
                button.setEnabled(false);
            }
        }

    }
}