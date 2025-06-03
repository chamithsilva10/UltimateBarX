package com.zackratos.ultimatebarx.sample

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatDelegate

/**
 * Application class for UltimateBarX sample.
 * 
 * @Author zackratos
 * @Date 2021/8/23 7:58 PM
 * @Email zhangwenchao@soulapp.cn
 */
class App : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var _context: Context? = null
        
        val context: Context
            get() = _context ?: throw IllegalStateException("Application context not initialized!")
