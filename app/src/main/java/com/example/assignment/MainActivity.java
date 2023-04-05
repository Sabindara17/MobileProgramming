package com.example.assignment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String s="Sabindra";

    TextView email;

    EditText edittext1;

    EditText edittext2;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.textView);
        edittext1 = findViewById(R.id.editTextTextPersonName2);
        edittext2 = findViewById(R.id.editTextTextPersonName3);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(MainActivity.this,edittext1.getText(), Toast.LENGTH_LONG).show();
                 Log.d("SS", "onClick: "+edittext1.getText());
                Log.d("dd", "onClick: "+edittext2.getText());
               email.setText(edittext1.getText());
                btn = findViewById(R.id.button);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, Home.class);
                        i.putExtra("key", "THIS IS THE VALUE FROM ACTIVITY");
                        startActivity(i);
                    }
                });

            }
        });


    }


        @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d("s","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("s","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("s","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("s","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("s","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("s","onDestroy");
    }
}