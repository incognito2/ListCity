package com.example.simpleparadox.listycity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
        textView = findViewById(R.id.cityname);
        button = findViewById(R.id.backbutton);
        Bundle extra = getIntent().getExtras();
        if(extra!= null){
            textView.setText(extra.getString("cityname"));
        }

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ShowActivity.this.finish();
            }
        });
    }

}