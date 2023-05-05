package com.sebferna.android.core.regions.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/sebferna/android/core/regions/impl/SharedPreferencesController;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getPreferredRegion", "", "()Ljava/lang/Integer;", "setPreferredRegion", "", "region", "Companion", "regions_debug"})
public final class SharedPreferencesController {
    private android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull
    public static final com.sebferna.android.core.regions.impl.SharedPreferencesController.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREFERENCES_KEY = "com.sebferna.android.quaketracker.SharedPreferencesKey";
    public static final int DEFAULT_INT_VALUE = -1;
    private static final java.lang.String PREFERRED_REGION_KEY = "prefered_region";
    
    @javax.inject.Inject
    public SharedPreferencesController(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context appContext) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPreferredRegion() {
        return null;
    }
    
    public final void setPreferredRegion(int region) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/sebferna/android/core/regions/impl/SharedPreferencesController$Companion;", "", "()V", "DEFAULT_INT_VALUE", "", "PREFERENCES_KEY", "", "PREFERRED_REGION_KEY", "regions_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}