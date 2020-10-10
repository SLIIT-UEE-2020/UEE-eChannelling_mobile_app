package com.example.echanneling_all_members_integration;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.echanneling_all_members_integration.ChannelingCenterSelectFragment;
import com.example.echanneling_all_members_integration.ViewAddedAppointments;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        Button btn_addDoctorAppointment = (Button) v.findViewById(R.id.btn_add_doctor_appointment);
        Button btn_viewAddedAppointments = (Button) v.findViewById(R.id.btn_view_appointments);
        Button btn_drug_delivery = (Button) v.findViewById(R.id.btn_drug_delivery);
        Button btn_online_doctor_applintment = (Button) v.findViewById(R.id.btn_online_doctor_applintment);

        btn_addDoctorAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new ChannelingCenterSelectFragment()).commit();
            }
        });
        btn_viewAddedAppointments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new ViewAddedAppointments()).commit();
            }
        });


        return v;
    }
}
