package com.example.dell5567.knowngrow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment implements View.OnClickListener{


    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        Button btn1 =(Button)v.findViewById(R.id.btn1);
        Button btn2 =(Button)v.findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        return v;
    }
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                Toast.makeText(getActivity(), "button1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(getActivity(), "button2", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
