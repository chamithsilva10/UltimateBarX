package com.zackratos.ultimatebarx.sample

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @Author   : zackratos
 * @Date     : 2021/8/23 7:58 下午
 * @email    : zhangwenchao@soulapp.cn
 * @Describe :
 */
class App: Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }

}

 private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channels = listOf(
                NotificationChannel(
                    "default_channel",
                    getString(R.string.default_channel_name),
                    NotificationManager.IMPORTANCE_DEFAULT
                ).apply {
                    description = getString(R.string.default_channel_description)
                }
            )
            
            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannels(channels)
        }
    }
