package realmdemo.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.UUID;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm realm = null;
        try {
            realm =  Realm.getDefaultInstance();
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    User user = realm.createObject(User.class, UUID.randomUUID().toString());
                    user.setName("Kapil");
                }
            });
        } catch (Exception e){
            realm.close();
        }


        RealmResults<User> users= realm.where(User.class).equalTo("name", "Kapil").findAll();
        Toast.makeText(this, String.valueOf(users.size()), Toast.LENGTH_LONG).show();
        realm.close();
    }
}
