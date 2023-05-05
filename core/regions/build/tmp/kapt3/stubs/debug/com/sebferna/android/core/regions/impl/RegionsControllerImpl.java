package com.sebferna.android.core.regions.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016J\b\u0010\r\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/sebferna/android/core/regions/impl/RegionsControllerImpl;", "Lcom/sebferna/android/core/regions/api/RegionsController;", "sharedPreferencesController", "Lcom/sebferna/android/core/regions/impl/SharedPreferencesController;", "(Lcom/sebferna/android/core/regions/impl/SharedPreferencesController;)V", "changePreferredRegionResource", "", "resource", "", "getPreferredRegionRectangleOrDefault", "", "", "", "getPreferredRegionResource", "regions_debug"})
public final class RegionsControllerImpl implements com.sebferna.android.core.regions.api.RegionsController {
    private final com.sebferna.android.core.regions.impl.SharedPreferencesController sharedPreferencesController = null;
    
    @javax.inject.Inject
    public RegionsControllerImpl(@org.jetbrains.annotations.NotNull
    com.sebferna.android.core.regions.impl.SharedPreferencesController sharedPreferencesController) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Float> getPreferredRegionRectangleOrDefault() {
        return null;
    }
    
    @java.lang.Override
    public int getPreferredRegionResource() {
        return 0;
    }
    
    @java.lang.Override
    public void changePreferredRegionResource(int resource) {
    }
}