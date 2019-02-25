package myapp.com.myapp

import android.app.Application
import android.os.SystemClock

class MyApplication: Application(){

    override fun onCreate() {
        super.onCreate()
        SystemClock.sleep(3000)
    }
}