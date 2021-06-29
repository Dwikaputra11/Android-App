package com.example.itc_onlineshop.ui.shop_item;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShopItemViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShopItemViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Shop item fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}