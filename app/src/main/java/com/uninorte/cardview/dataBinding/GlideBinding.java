package com.uninorte.cardview.dataBinding;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.uninorte.cardview.R;

public class GlideBinding {
    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView view,String imageURl) {
        RequestOptions options = new RequestOptions().
                placeholder(R.drawable.ic_launcher_background).
                error(R.drawable.ic_launcher_background);

        Glide.with(view.getContext()).setDefaultRequestOptions(options).load(imageURl).into(view);
    }
}
