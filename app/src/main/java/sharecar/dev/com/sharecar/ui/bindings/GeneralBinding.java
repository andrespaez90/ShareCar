package sharecar.dev.com.sharecar.ui.bindings;

import android.databinding.BindingAdapter;
import android.support.annotation.StringRes;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GeneralBinding {

    @BindingAdapter("load_image")
    public static void loadImage(ImageView imageView, String urlPhoto) {
        Glide.with(imageView.getContext()).load(urlPhoto).into(imageView);
    }

    @BindingAdapter({"format", "text"})
    public static void setTextWithFormat(TextView textView, @StringRes int resource, String text) {
        textView.setText(textView.getContext().getString(resource, text));
    }

}
