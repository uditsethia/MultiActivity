package com.example.multi.multiactivity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Second extends AppCompatActivity {
    private Button btn;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = (Button) findViewById(R.id.button2);
        txt = (TextView)findViewById(R.id.textView);
        Bundle ext;
        ext = getIntent().getExtras();
        if(ext!=null){
            txt.setText(ext.getString("third") + " and " + ext.getString("second"));
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second.this,FirstActivity.class);
                intent.putExtra("one","yes we got it");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }


}
