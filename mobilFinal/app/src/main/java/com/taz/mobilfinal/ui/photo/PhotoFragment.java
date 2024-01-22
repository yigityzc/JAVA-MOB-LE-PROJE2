package com.taz.mobilfinal.ui.photo;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.taz.mobilfinal.R;
import com.taz.mobilfinal.databinding.FragmentPhotoBinding;

import javax.xml.transform.Result;


public class PhotoFragment extends Fragment {
    private FragmentPhotoBinding binding;
    private int ResultImage = 1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPhotoBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        Button btnselect = binding.select;
        btnselect.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, ResultImage);
            }
        }));
        return root;
    }





    @Override
    public void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }
}


