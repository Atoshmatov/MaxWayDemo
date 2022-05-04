package uz.gita.maxwaydemo.mobdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.core.content.ContextCompat
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.splash_color)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.splash_color)
    }
}