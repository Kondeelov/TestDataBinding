package com.kondee.testdatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.kondee.testdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Kondee";
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initInstance();
    }

    private void initInstance() {
        User user = new User();
        user.setFirstName("Kondee");
        user.setLastName("Naja");
        user.setAddress("Nonthaburi");
        user.setEmail("kondee@mail.com");
        user.setImageUrl("http://images.mentalfloss.com/sites/default/files/styles/mf_image_16x9/public/502854-sophie_nightingale__university_of_warwick.jpg?itok=7iGgk1si&resize=1100x619");
        mBinding.setUser(user);

        mBinding.buttonUpdate.setOnClickListener(view -> {
            user.setFirstName(mBinding.editTextUpdate.getText().toString());
            Log.d(TAG, "initInstance: " + user.getFirstName());
        });
    }

}
