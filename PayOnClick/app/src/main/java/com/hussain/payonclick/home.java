package com.hussain.payonclick;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hussain.payonclick.Acitivity.Recharge_sccreen;

public class home extends AppCompatActivity {
    LinearLayout mubileRecharge,dthlayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

// Find the ImageView by its ID
         mubileRecharge = findViewById(R.id.mubile_recharge);
         dthlayout = findViewById(R.id.dth_layout);
         dthlayout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent dthIntent = new Intent(home.this,Recharge_sccreen.class);
                 startActivity(dthIntent);
             }
         });

        // Set an OnClickListener on the ImageView
    }
}