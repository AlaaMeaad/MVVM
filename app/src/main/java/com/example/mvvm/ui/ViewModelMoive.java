package com.example.mvvm.ui;

import com.example.mvvm.pojo.MoiveModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelMoive extends ViewModel {

//    LiveData <String> liveData ;
    MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    public void  getMovieName(){
        String namee = moiveModeldatabase().getName();
        mutableLiveData.setValue(namee);
    }
    private MoiveModel moiveModeldatabase(){
        return new MoiveModel("alaa" , "meaad" , "zamalek" , 1);
    }

}
