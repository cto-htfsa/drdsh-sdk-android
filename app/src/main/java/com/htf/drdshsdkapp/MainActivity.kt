package com.htf.drdshsdkapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import com.htf.drdshsdklibrary.Activities.ChatActivity
import com.htf.drdshsdklibrary.Activities.UserDetailActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val deviceId = Settings.Secure.getString(this.contentResolver, Settings.Secure.ANDROID_ID)
        UserDetailActivity.open(
            currActivity = this,
            appSid = "YOUR_APP_S_ID",
            locale = "en",
            deviceID = deviceId,
            domain = "YOUR_DOMAIN_NAME"
        )
    }
}
