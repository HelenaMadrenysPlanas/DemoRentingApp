package com.example.m8uf1t10helenamadrenys.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.m8uf1t10helenamadrenys.R;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}