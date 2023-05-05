package com.sebferna.android.feature.home.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/sebferna/android/feature/home/presentation/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "getEarthQuakesUseCase", "Lcom/sebferna/android/feature/home/domain/GetEarthQuakesUseCase;", "dateFormatter", "Lcom/sebferna/android/core/commons/DateFormatter;", "regionsController", "Lcom/sebferna/android/core/regions/api/RegionsController;", "(Lcom/sebferna/android/feature/home/domain/GetEarthQuakesUseCase;Lcom/sebferna/android/core/commons/DateFormatter;Lcom/sebferna/android/core/regions/api/RegionsController;)V", "_earthQuakes", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sebferna/android/feature/home/domain/model/HomeEarthQuake;", "earthQuake", "Landroidx/lifecycle/LiveData;", "getEarthQuake", "()Landroidx/lifecycle/LiveData;", "preferredRectangle", "", "", "", "getPreferredRectangle", "()Ljava/util/Map;", "preferredRectangle$delegate", "Lkotlin/Lazy;", "getNearbyEarthQuakes", "", "home_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.sebferna.android.feature.home.domain.GetEarthQuakesUseCase getEarthQuakesUseCase = null;
    private final com.sebferna.android.core.commons.DateFormatter dateFormatter = null;
    private final com.sebferna.android.core.regions.api.RegionsController regionsController = null;
    private final androidx.lifecycle.MutableLiveData<com.sebferna.android.feature.home.domain.model.HomeEarthQuake> _earthQuakes = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.sebferna.android.feature.home.domain.model.HomeEarthQuake> earthQuake = null;
    private final kotlin.Lazy preferredRectangle$delegate = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.sebferna.android.feature.home.domain.GetEarthQuakesUseCase getEarthQuakesUseCase, @org.jetbrains.annotations.NotNull
    com.sebferna.android.core.commons.DateFormatter dateFormatter, @org.jetbrains.annotations.NotNull
    com.sebferna.android.core.regions.api.RegionsController regionsController) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.sebferna.android.feature.home.domain.model.HomeEarthQuake> getEarthQuake() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.Float> getPreferredRectangle() {
        return null;
    }
    
    private final void getNearbyEarthQuakes() {
    }
}