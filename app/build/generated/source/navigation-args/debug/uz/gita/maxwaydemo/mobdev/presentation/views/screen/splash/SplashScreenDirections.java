package uz.gita.maxwaydemo.mobdev.presentation.views.screen.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import uz.gita.maxwaydemo.mobdev.R;

public class SplashScreenDirections {
  private SplashScreenDirections() {
  }

  @NonNull
  public static NavDirections actionSplashScreenToMainScreen() {
    return new ActionOnlyNavDirections(R.id.action_splashScreen_to_mainScreen);
  }
}
