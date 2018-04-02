package com.kondee.testdatabinding;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.bumptech.glide.Glide;
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
//            Intent intent = new Intent(this, SecondActivity.class);
//            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//
//            PendingIntent pendingIntent = PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//
//            NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
//                    .setContentTitle("Test")
//                    .setContentText("TestTest")
//                    .setSmallIcon(R.mipmap.ic_launcher)
//                    .setContentIntent(pendingIntent);
//
//            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//            notificationManager.notify(0, builder.build());
//
//            Intent startIntent = new Intent(this, SecondActivity.class);
//            startActivity(startIntent);

        });


    }

}
