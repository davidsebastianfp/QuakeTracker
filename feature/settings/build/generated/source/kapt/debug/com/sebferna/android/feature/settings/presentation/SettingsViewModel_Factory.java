// Generated by Dagger (https://dagger.dev).
package com.sebferna.android.feature.settings.presentation;

import com.sebferna.android.core.regions.api.RegionsController;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<RegionsController> regionsControllerProvider;

  public SettingsViewModel_Factory(Provider<RegionsController> regionsControllerProvider) {
    this.regionsControllerProvider = regionsControllerProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(regionsControllerProvider.get());
  }

  public static SettingsViewModel_Factory create(
      Provider<RegionsController> regionsControllerProvider) {
    return new SettingsViewModel_Factory(regionsControllerProvider);
  }

  public static SettingsViewModel newInstance(RegionsController regionsController) {
    return new SettingsViewModel(regionsController);
  }
}