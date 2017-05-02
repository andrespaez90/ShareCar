package sharecar.dev.com.sharecar.di.component;


import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Singleton;

import dagger.Component;
import sharecar.dev.com.sharecar.di.modules.AppModule;
import sharecar.dev.com.sharecar.di.scope.ActivityScope;
import sharecar.dev.com.sharecar.managers.preferences.PrefsManager;

@Singleton
@ActivityScope
@Component(modules = {AppModule.class})
public interface AppComponent {

    PrefsManager preferenceManager();

    FirebaseDatabase firebaseDatabase();

}
