package sharecar.dev.com.sharecar.interfaces;


import sharecar.dev.com.sharecar.factories.GenericAdapterFactory;

public class GenericItemAbstract implements GenericItem<Object> {

    private Object data;
    private int type = GenericAdapterFactory.TYPE_ITEM;

    public GenericItemAbstract(Object data) {
        this.data = data;
    }

    public GenericItemAbstract(Object data, int type) {
        this.data = data;
        this.type = type;
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public int getType() {
        return type;
    }
}
