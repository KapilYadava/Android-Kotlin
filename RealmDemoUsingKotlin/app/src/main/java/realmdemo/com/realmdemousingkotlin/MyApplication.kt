package realmdemo.com.realmdemousingkotlin

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val realmConfiguration= RealmConfiguration.Builder().schemaVersion(1).name("user").build()
        Realm.setDefaultConfiguration(realmConfiguration)
    }

}