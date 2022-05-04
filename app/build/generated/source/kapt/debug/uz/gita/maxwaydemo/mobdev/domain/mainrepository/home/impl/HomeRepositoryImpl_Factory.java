// Generated by Dagger (https://dagger.dev).
package uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.impl;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeRepositoryImpl_Factory implements Factory<HomeRepositoryImpl> {
  private final Provider<FirebaseFirestore> storeProvider;

  public HomeRepositoryImpl_Factory(Provider<FirebaseFirestore> storeProvider) {
    this.storeProvider = storeProvider;
  }

  @Override
  public HomeRepositoryImpl get() {
    return newInstance(storeProvider.get());
  }

  public static HomeRepositoryImpl_Factory create(Provider<FirebaseFirestore> storeProvider) {
    return new HomeRepositoryImpl_Factory(storeProvider);
  }

  public static HomeRepositoryImpl newInstance(FirebaseFirestore store) {
    return new HomeRepositoryImpl(store);
  }
}