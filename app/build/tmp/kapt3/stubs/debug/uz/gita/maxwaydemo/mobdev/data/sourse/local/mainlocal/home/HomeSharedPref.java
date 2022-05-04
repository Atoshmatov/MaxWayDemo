package uz.gita.maxwaydemo.mobdev.data.sourse.local.mainlocal.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Luz/gita/maxwaydemo/mobdev/data/sourse/local/mainlocal/home/HomeSharedPref;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "pref", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getState", "", "saveState", "", "isLogged", "app_debug"})
@javax.inject.Singleton()
public final class HomeSharedPref {
    private final android.content.SharedPreferences pref = null;
    
    @javax.inject.Inject()
    public HomeSharedPref(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    public final void saveState(boolean isLogged) {
    }
    
    public final boolean getState() {
        return false;
    }
}