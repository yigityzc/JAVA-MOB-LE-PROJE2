package com.taz.mobilfinal.ui.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import  android.widget.Button;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.taz.mobilfinal.R;
import com.taz.mobilfinal.databinding.FragmentAboutBinding;


public class AboutFragment extends Fragment {
    private FragmentAboutBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAboutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button btnmail = binding.mail;
        btnmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_SEND);
                i1.setType("text/plain");
                i1.putExtra(Intent.EXTRA_EMAIL, new String[] {"ygtiletisim@gmail.com"});
                if (i1.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(i1);
                }
            }
        });

        Button btnlinkdln = binding.linkdn;
        btnlinkdln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url1 = "https://www.linkedin.com/in/nyle-undefined-5600152b0/";
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse(url1));
                startActivity(i2);
            }
        });
        Button btngithub = binding.github;
        btngithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url2 ="https://github.com/yigityzc";
                Intent i3 = new Intent(Intent.ACTION_VIEW);
                i3.setData(Uri.parse(url2));
                startActivity(i3);

            }
        });



        return root;
    }
    @Override
    public  void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }
}