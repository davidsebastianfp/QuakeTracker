// Generated by Dagger (https://dagger.dev).
package com.sebferna.android.core.regions.di;

import android.content.Context;
import com.sebferna.android.core.regions.api.RegionsController;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegionsModule_BindRegionsControllerFactory implements Factory<RegionsController> {
  private final Provider<Context> contextProvider;

  public RegionsModule_BindRegionsControllerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public RegionsController get() {
    return bindRegionsController(contextProvider.get());
  }

  public static RegionsModule_BindRegionsControllerFactory create(
      Provider<Context> contextProvider) {
    return new RegionsModule_BindRegionsControllerFactory(contextProvider);
  }

  public static RegionsController bindRegionsController(Context context) {
    return Preconditions.checkNotNullFromProvides(RegionsModule.INSTANCE.bindRegionsController(context));
  }
}