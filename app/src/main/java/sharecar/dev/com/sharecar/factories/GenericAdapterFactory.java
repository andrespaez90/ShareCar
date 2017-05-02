package sharecar.dev.com.sharecar.factories;

import android.view.ViewGroup;

import sharecar.dev.com.sharecar.interfaces.GenericItemView;

public abstract class GenericAdapterFactory {

    public static final int TYPE_HEADER = 1001;
    public static final int TYPE_ITEM = 1002;
    public static final int TYPE_FOOTER = 1003;
    public static final int TYPE_CATEGORY = 1004;

    public abstract GenericItemView onCreateViewHolder(ViewGroup parent, int viewType);

}