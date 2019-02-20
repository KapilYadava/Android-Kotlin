package realmdemo.com.realmdemousingkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = User()
        user.name = "Kapil"
        val realm = Realm.getDefaultInstance()
        realm.beginTransaction()
        realm.copyToRealmOrUpdate(user)
        realm.commitTransaction()

    }
}
