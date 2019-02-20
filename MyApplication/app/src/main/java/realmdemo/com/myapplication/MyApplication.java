package realmdemo.com.myapplication;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmCollection;
import io.realm.RealmConfiguration;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration configuration= new RealmConfiguration.Builder().name("realm.database").build();
        Realm.setDefaultConfiguration(configuration);
    }
}

