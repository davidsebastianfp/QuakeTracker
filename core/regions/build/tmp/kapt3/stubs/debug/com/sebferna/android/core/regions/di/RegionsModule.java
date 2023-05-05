package com.sebferna.android.core.regions.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/sebferna/android/core/regions/di/RegionsModule;", "", "()V", "bindRegionsController", "Lcom/sebferna/android/core/regions/api/RegionsController;", "context", "Landroid/content/Context;", "provideSharedPreferencesController", "Lcom/sebferna/android/core/regions/impl/SharedPreferencesController;", "regions_debug"})
@dagger.Module
public final class RegionsModule {
    @org.jetbrains.annotations.NotNull
    public static final com.sebferna.android.core.regions.di.RegionsModule INSTANCE = null;
    
    private RegionsModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.sebferna.android.core.regions.impl.SharedPreferencesController provideSharedPreferencesController(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.sebferna.android.core.regions.api.RegionsController bindRegionsController(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}