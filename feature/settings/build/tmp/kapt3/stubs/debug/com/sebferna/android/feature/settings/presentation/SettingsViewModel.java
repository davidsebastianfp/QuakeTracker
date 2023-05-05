package com.sebferna.android.feature.settings.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/sebferna/android/feature/settings/presentation/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "regionsController", "Lcom/sebferna/android/core/regions/api/RegionsController;", "(Lcom/sebferna/android/core/regions/api/RegionsController;)V", "changeRegion", "", "region", "", "getCurrentRegionResource", "settings_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    private final com.sebferna.android.core.regions.api.RegionsController regionsController = null;
    
    @javax.inject.Inject
    public SettingsViewModel(@org.jetbrains.annotations.NotNull
    com.sebferna.android.core.regions.api.RegionsController regionsController) {
        super();
    }
    
    public final void changeRegion(int region) {
    }
    
    public final int getCurrentRegionResource() {
        return 0;
    }
}