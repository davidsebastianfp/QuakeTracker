// Generated by Dagger (https://dagger.dev).
package com.sebferna.android.core.regions.impl;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPreferencesController_Factory implements Factory<SharedPreferencesController> {
  private final Provider<Context> appContextProvider;

  public SharedPreferencesController_Factory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public SharedPreferencesController get() {
    return newInstance(appContextProvider.get());
  }

  public static SharedPreferencesController_Factory create(Provider<Context> appContextProvider) {
    return new SharedPreferencesController_Factory(appContextProvider);
  }

  public static SharedPreferencesController newInstance(Context appContext) {
    return new SharedPreferencesController(appContext);
  }
}
