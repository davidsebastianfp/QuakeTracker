package com.sebferna.android.feature.home.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JQ\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/sebferna/android/feature/home/data/HomeRepository;", "", "service", "Lcom/sebferna/android/feature/home/data/HomeService;", "(Lcom/sebferna/android/feature/home/data/HomeService;)V", "getEarthQuakesFromSource", "Lcom/sebferna/android/feature/home/data/model/NetworkEarthQuake;", "starTime", "", "endTime", "minMagnitude", "", "minLongitude", "", "minLatitude", "maxLongitude", "maxLatitude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;FFFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "home_debug"})
public final class HomeRepository {
    private final com.sebferna.android.feature.home.data.HomeService service = null;
    
    @javax.inject.Inject
    public HomeRepository(@org.jetbrains.annotations.NotNull
    com.sebferna.android.feature.home.data.HomeService service) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getEarthQuakesFromSource(@org.jetbrains.annotations.NotNull
    java.lang.String starTime, @org.jetbrains.annotations.Nullable
    java.lang.String endTime, @org.jetbrains.annotations.Nullable
    java.lang.Integer minMagnitude, float minLongitude, float minLatitude, float maxLongitude, float maxLatitude, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sebferna.android.feature.home.data.model.NetworkEarthQuake> continuation) {
        return null;
    }
}