package com.example.kiit.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;
    CheckBox    c1;
    CheckBox    c2;
    CheckBox    c3;
    CheckBox    c4;
    Switch      s1;
    Switch      s2;
    Switch      s3;
    Switch      s4;
    Button      b1;
    Integer   count=0;
    String      s;
    TextView    r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);
        b1=findViewById(R.id.over);
        r=findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked()){count++;}
                if (c1.isChecked()){count++;}
                if (s2.isChecked()){count++;}
                if (r3.isChecked()) {count++;}
                if (c3.isChecked()){count++;}
                if (s3.isChecked()) {count++;}
                s=Integer.toString(count);
                r.setText(s);
                s=Integer.toString(count);

                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("count",s);
                startActivity(i);

            }
        });

    }
}
