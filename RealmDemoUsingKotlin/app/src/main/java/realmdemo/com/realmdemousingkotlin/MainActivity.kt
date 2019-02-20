package realmdemo.com.realmdemousingkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.realm.Realm
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = User()
        user.name = "Kapil"
        user.id = Random().nextLong()
        val realm = Realm.getDefaultInstance()
        realm.beginTransaction()
        realm.copyToRealmOrUpdate(user)
        realm.commitTransaction()

        val result= realm.where(User::class.java).equalTo("name", "Kapil").findAll();
        Toast.makeText(this, result.size.toString(), Toast.LENGTH_LONG).show();

    }
}
