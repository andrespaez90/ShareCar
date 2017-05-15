package sharecar.dev.com.sharecar.ui.bindings;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GeneralBinding {

    @BindingAdapter("load_image")
    public static void loadImage(ImageView imageView, String urlPhoto) {
        Glide.with(imageView.getContext()).load(urlPhoto).into(imageView);
    }

}
