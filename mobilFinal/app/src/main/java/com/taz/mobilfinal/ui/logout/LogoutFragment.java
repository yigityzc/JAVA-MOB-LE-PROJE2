package com.taz.mobilfinal.ui.logout;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.taz.mobilfinal.Login;
import com.taz.mobilfinal.MainActivity;
import com.taz.mobilfinal.OpenView;
import com.taz.mobilfinal.R;
import com.taz.mobilfinal.databinding.FragmentAboutBinding;
import com.taz.mobilfinal.databinding.FragmentLogoutBinding;


public class LogoutFragment extends Fragment {
    private FragmentLogoutBinding binding;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLogoutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button btnlogout = binding.logout;
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getActivity(), OpenView.class));
                getActivity().finish();
            }
        });

        return  root;
    }
    @Override
    public  void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }
}