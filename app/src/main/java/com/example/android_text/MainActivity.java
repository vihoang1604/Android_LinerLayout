package com.example.android_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text[]= new TextView[20];
        LinearLayout main =findViewById(R.id.text);
        for(int i=0; i<text.length;i++){
            LinearLayout linearLayout=new LinearLayout(MainActivity.this);
            linearLayout.setOrientation(linearLayout.HORIZONTAL);

            text[i]  = new TextView(MainActivity.this);
            text[i].setText("TextList"+i);
            linearLayout.addView(text[i]);


            Button button = new Button(MainActivity.this);
            linearLayout.addView(button);
            button.setText("+");
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams)
                    button.getLayoutParams();
            params.weight = 1.0f;
            button.setLayoutParams(params);
            main.addView(linearLayout);
        }
    }
}
