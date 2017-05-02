package sharecar.dev.com.sharecar.di.modules;


import android.app.Application;
import android.content.Context;


import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import sharecar.dev.com.sharecar.managers.preferences.PrefsManager;

@Module
public class AppModule {

    private final Application app;

    public AppModule(Application app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Context appContext() {
        return app;
    }

    @Provides
    @Singleton
    public PrefsManager preferenceManager(Context context) {
        PrefsManager.init(context);
        return PrefsManager.getInstance();
    }

    @Provides
    @Singleton
    public FirebaseDatabase getFirebaseDatabase() {
        return FirebaseDatabase.getInstance();
    }

}
