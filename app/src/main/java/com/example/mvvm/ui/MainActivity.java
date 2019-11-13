package com.example.mvvm.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvvm.R;
import com.example.mvvm.databinding.ActivityMainBinding;
import com.example.mvvm.ui.ViewModelMoive;

public class MainActivity extends AppCompatActivity  {

//    TextView getdata;
//    Button butGetData;
    ViewModelMoive viewModelMoive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this , R.layout.activity_main);
//        setContentView(R.layout.activity_main);
//        getdata = findViewById(R.id.textview);
//        butGetData = findViewById(R.id.button);
//        butGetData.setOnClickListener(this);
        viewModelMoive = ViewModelProviders.of(this).get(ViewModelMoive.class);
        binding.setViewModel(viewModelMoive);
        binding.setLifecycleOwner(this);
//        viewModelMoive.mutableLiveData.observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
////                getdata.setText(s);
//                binding.textview.setText(s);
//            }
//        });
      /*  binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelMoive.getMovieName();
            }
        });*/
    }


   /* @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            viewModelMoive.getMovieName();
        }
    }*/


}
