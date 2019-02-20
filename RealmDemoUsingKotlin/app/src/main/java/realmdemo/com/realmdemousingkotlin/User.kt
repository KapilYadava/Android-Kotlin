package realmdemo.com.realmdemousingkotlin


import io.realm.RealmModel
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class  User : RealmObject(){

    @PrimaryKey
    var id: Long = 0
    var name:String = ""
    var city:String = ""


}