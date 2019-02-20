package realmdemo.com.realmdemousingkotlin


import io.realm.RealmObject
import io.realm.annotations.RealmClass

@RealmClass
open class  User : RealmObject(){

    var name:String = ""
    var city:String = ""


}