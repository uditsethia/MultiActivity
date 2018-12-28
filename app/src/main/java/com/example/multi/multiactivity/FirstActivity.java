package com.example.multi.multiactivity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private final int Result = 2;
    private Button goto2ndButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        goto2ndButton = (Button) findViewById(R.id.button);
        goto2ndButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,Second.class);
                intent.putExtra("first","this is a string");
                intent.putExtra("second","this is a number");
                intent.putExtra("third","this is a char");
                startActivityForResult(intent,Result);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == Result){
            if(resultCode == RESULT_OK){
                Toast.makeText(FirstActivity.this,data.getStringExtra("one"),Toast.LENGTH_SHORT).show();
            }
        }
    }
}
