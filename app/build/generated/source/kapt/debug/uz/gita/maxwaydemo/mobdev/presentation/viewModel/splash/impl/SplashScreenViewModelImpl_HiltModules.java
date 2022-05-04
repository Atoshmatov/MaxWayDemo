package uz.gita.maxwaydemo.mobdev.presentation.viewModel.splash.impl;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import java.lang.String;

@OriginatingElement(
    topLevelClass = SplashScreenViewModelImpl.class
)
public final class SplashScreenViewModelImpl_HiltModules {
  private SplashScreenViewModelImpl_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @StringKey("uz.gita.maxwaydemo.mobdev.presentation.viewModel.splash.impl.SplashScreenViewModelImpl")
    @HiltViewModelMap
    public abstract ViewModel binds(SplashScreenViewModelImpl vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoSet
    @HiltViewModelMap.KeySet
    public static String provide() {
      return "uz.gita.maxwaydemo.mobdev.presentation.viewModel.splash.impl.SplashScreenViewModelImpl";
    }
  }
}
