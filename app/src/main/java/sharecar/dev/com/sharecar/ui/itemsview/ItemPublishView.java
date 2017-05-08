package sharecar.dev.com.sharecar.ui.itemsview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import sharecar.dev.com.sharecar.R;
import sharecar.dev.com.sharecar.databinding.ViewPublishBinding;
import sharecar.dev.com.sharecar.interfaces.GenericItemView;
import sharecar.dev.com.sharecar.ui.viewmodels.PublishViewModel;

public class ItemPublishView extends FrameLayout implements GenericItemView<PublishViewModel> {

    private ViewPublishBinding binding;

    private PublishViewModel publishViewModel;

    public ItemPublishView(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.view_publish, this, true);
        setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    @Override
    public void bind(PublishViewModel item) {
        publishViewModel = item;
        binding.setViewModel(publishViewModel);
    }

    @Override
    public PublishViewModel getData() {
        return publishViewModel;
    }
}
