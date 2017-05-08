package sharecar.dev.com.sharecar.ui.bindings;

import android.databinding.BindingAdapter;
import android.widget.TextView;

import sharecar.dev.com.sharecar.R;

public class PublishBinding {

    @BindingAdapter({"name", "age"})
    public static void setNameAgeUser(TextView textView, String name, String age) {
        textView.setText(textView.getContext().getString(R.string.publish_name_age_user, name, age));
    }
}
