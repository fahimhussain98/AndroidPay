package com.hussain.payonclick;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.hussain.payonclick.Acitivity.login;
import com.hussain.payonclick.fragment.histroy;
import com.hussain.payonclick.fragment.homeFragment;
import com.hussain.payonclick.fragment.report;
import com.hussain.payonclick.fragment.wallet;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    DrawerLayout drawerLayout;
    BottomNavigationView bottomNavigationView;

    @SuppressLint({"MissingInflatedId", "NonConstantResourceId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        fab = findViewById(R.id.fab);
        drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new homeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }

        replaceFragment(new homeFragment());

        bottomNavigationView.setBackground(null);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.home) {
                replaceFragment(new homeFragment());
            } else if (itemId == R.id.wallet) {
                replaceFragment(new wallet());
            } else if (itemId == R.id.report) {
                replaceFragment(new report());
            } else if (itemId == R.id.service) {
                replaceFragment(new histroy());
            }

            return true;
        });


       // fab.setOnClickListener(view -> showBottomDialog());

        //check user exitance
       // checkuserexitence();
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

    private void showBottomDialog() {
         Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetlayout);

        LinearLayout videoLayout = dialog.findViewById(R.id.layoutVideo);
        LinearLayout shortsLayout = dialog.findViewById(R.id.layoutShorts);
        LinearLayout liveLayout = dialog.findViewById(R.id.layoutLive);
        ImageView cancelButton = dialog.findViewById(R.id.cancelButton);

        videoLayout.setOnClickListener(v -> {
            dialog.dismiss();
            Toast.makeText(MainActivity.this, "Upload a Video is clicked", Toast.LENGTH_SHORT).show();
        });

        shortsLayout.setOnClickListener(v -> {
            dialog.dismiss();
            Toast.makeText(MainActivity.this, "Create a short is Clicked", Toast.LENGTH_SHORT).show();
        });

        liveLayout.setOnClickListener(v -> {
            dialog.dismiss();
            Toast.makeText(MainActivity.this, "Go live is Clicked", Toast.LENGTH_SHORT).show();
        });

        cancelButton.setOnClickListener(view -> dialog.dismiss());

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }

    //here is the mothde for the user already is alvailable or not
//    public void checkuserexitence(){
//        SharedPreferences sp = getSharedPreferences("credentials",MODE_PRIVATE);
//        if (sp.contains("userId"))
//            Toast.makeText(MainActivity.this, "user already availble hai", Toast.LENGTH_SHORT).show();
//
//        else
//            startActivity(new Intent(getApplicationContext(), login.class));
//
//    }
}
