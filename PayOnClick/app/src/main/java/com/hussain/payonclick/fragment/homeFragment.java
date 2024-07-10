package com.hussain.payonclick.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.hussain.payonclick.Acitivity.Recharge_sccreen;
import com.hussain.payonclick.R;
import com.hussain.payonclick.home;

public class homeFragment extends Fragment {

    private LinearLayout mubileRecharge,dthlayout;

    public homeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Find the LinearLayout by its ID
        mubileRecharge = view.findViewById(R.id.mubile_recharge);
        dthlayout = view.findViewById(R.id.dth_layout);

        // Set an OnClickListener on the LinearLayout
        mubileRecharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the Recharge_sccreen activity
                Intent intent = new Intent(getActivity(), Recharge_sccreen.class);
                startActivity(intent);
            }
        });

        //
        dthlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the Recharge_sccreen activity
                Intent intent = new Intent(getActivity(), Recharge_sccreen.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
