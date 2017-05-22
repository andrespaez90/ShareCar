package sharecar.dev.com.sharecar.ui.itemsview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import sharecar.dev.com.sharecar.R;
import sharecar.dev.com.sharecar.databinding.ViewCreatePublishBinding;
import sharecar.dev.com.sharecar.interfaces.GenericItemView;

public class ItemCreatePublishView extends FrameLayout implements GenericItemView<Object> {

    private ViewCreatePublishBinding binding;

    public ItemCreatePublishView(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.view_create_publish, this, true);
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    @Override
    public void bind(Object item) {

    }

    @Override
    public Object getData() {
        return null;
    }
}
