package com.kondee.testdatabinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

//    private ActivitySecondBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        initInstance();
    }

    private void initInstance() {

    }
}
