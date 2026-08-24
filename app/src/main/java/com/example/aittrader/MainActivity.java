package com.example.aittrader;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);

        TextView title = new TextView(this);
        title.setText("AI TRADER ASSISTANT");
        title.setTextSize(24);
        title.setGravity(Gravity.CENTER);
        
        TextView status = new TextView(this);
        status.setText("Status: READY (Cloud Build Pipeline)");
        status.setTextSize(16);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 32, 0, 0);

        layout.addView(title);
        layout.addView(status);

        setContentView(layout);
    }
}
