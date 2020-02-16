package com.example.labandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private static String val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

          /*  getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new MyFragment())
                    .commit();

           */

        final EditText editText = (EditText) findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    val = "Yes";
                } else {
                    val = "No";
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                TextView textView2 = (TextView) findViewById(R.id.textView2);

                textView.setText(editText.getText());
                textView2.setText(val);
            }
        });

       /* editText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(s);
            }
        });

        */

    }

    /*
     public void onClick(View v) {
         // по id определеяем кнопку, вызвавшую этот обработчик
         switch (v.getId()) {
             case R.id.toggleButton:
                 // кнопка ОК
                 break;
             case R.id.toggleButton:
                 // кнопка Cancel
                 break;
         }
     }

     */
}
