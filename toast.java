package com.lk.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends Activity implements View.OnClickListener {

    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.edittext);
        b1 = findViewById(R.id.submitbtn);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context:this,e1.getText().toString(),Toast.LENGTH_LONG).show();
    }
}