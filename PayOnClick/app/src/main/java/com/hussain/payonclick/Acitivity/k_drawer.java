package com.hussain.payonclick.Acitivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hussain.payonclick.R;

public class k_drawer extends AppCompatActivity {

    ImageView drawerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kdrawer);

          drawerDialog=findViewById(R.id.drawer_dialog);

          drawerDialog.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Dialog drawerDialog =  new Dialog(k_drawer.this, R.style.DialogTheme);
                  drawerDialog.setContentView(R.layout.k_drawer_dialog);
                  int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.72);
                  int hight =  (int) (getResources().getDisplayMetrics().heightPixels * 1.0);

                  drawerDialog.getWindow().setLayout(width, hight);

                  drawerDialog.getWindow().setGravity(Gravity.START);
                  drawerDialog.getWindow().setWindowAnimations(R.style.SlidingNavDialog);



                  drawerDialog.show();

              }
          });


    }
}