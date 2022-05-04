package uz.gita.maxwaydemo.mobdev.data.sourse.local.mainlocal.home

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeSharedPref @Inject constructor(@ApplicationContext context: Context) {
    private val pref = context.getSharedPreferences("DATA", Context.MODE_PRIVATE)

    fun saveState(isLogged: Boolean) {
        pref.edit().putBoolean("is_logged", isLogged).apply()
    }

    fun getState(): Boolean {
        return pref.getBoolean("is_logged", false)
    }
}