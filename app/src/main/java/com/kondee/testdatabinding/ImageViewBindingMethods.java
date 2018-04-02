package com.kondee.testdatabinding;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ImageViewBindingMethods {
    @BindingAdapter("app:imageUrl")
    public static void setImageUrl(ImageView view, String imageUrl) {
        RequestOptions requestOptions = new RequestOptions();
        Glide.with(view)
                .load(imageUrl)
                .apply(requestOptions)
                .into(view);
    }
}
