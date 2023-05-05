// Generated by Dagger (https://dagger.dev).
package com.sebferna.android.core.regions.di;

import android.content.Context;
import com.sebferna.android.core.regions.impl.SharedPreferencesController;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RegionsModule_ProvideSharedPreferencesControllerFactory implements Factory<SharedPreferencesController> {
  private final Provider<Context> contextProvider;

  public RegionsModule_ProvideSharedPreferencesControllerFactory(
      Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferencesController get() {
    return provideSharedPreferencesController(contextProvider.get());
  }

  public static RegionsModule_ProvideSharedPreferencesControllerFactory create(
      Provider<Context> contextProvider) {
    return new RegionsModule_ProvideSharedPreferencesControllerFactory(contextProvider);
  }

  public static SharedPreferencesController provideSharedPreferencesController(Context context) {
    return Preconditions.checkNotNullFromProvides(RegionsModule.INSTANCE.provideSharedPreferencesController(context));
  }
}