package com.sebferna.android.feature.home.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001Jq\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/sebferna/android/feature/home/data/HomeService;", "", "getEarthQuakes", "Lcom/sebferna/android/feature/home/data/model/NetworkEarthQuake;", "format", "", "startTime", "endTime", "minMagnitude", "", "minLatitude", "", "minLongitude", "maxLatitude", "maxLongitude", "orderBy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;FFFFLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "home_debug"})
public abstract interface HomeService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "query")
    public abstract java.lang.Object getEarthQuakes(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "format")
    java.lang.String format, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "starttime")
    java.lang.String startTime, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "endtime")
    java.lang.String endTime, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "minmagnitude")
    java.lang.Integer minMagnitude, @retrofit2.http.Query(value = "minlatitude")
    float minLatitude, @retrofit2.http.Query(value = "minlongitude")
    float minLongitude, @retrofit2.http.Query(value = "maxlatitude")
    float maxLatitude, @retrofit2.http.Query(value = "maxlongitude")
    float maxLongitude, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "orderby")
    java.lang.String orderBy, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sebferna.android.feature.home.data.model.NetworkEarthQuake> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}