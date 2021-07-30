package com.gfc.javaproject;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("","onDetach");
    }

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);
        Log.e("","onAttach");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("","onDestroyView");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("","onViewCreated");

    }
}