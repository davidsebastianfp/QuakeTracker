package com.sebferna.android.core.regions.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&J\b\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/sebferna/android/core/regions/api/RegionsController;", "", "changePreferredRegionResource", "", "resource", "", "getPreferredRegionRectangleOrDefault", "", "", "", "getPreferredRegionResource", "regions_debug"})
public abstract interface RegionsController {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Map<java.lang.String, java.lang.Float> getPreferredRegionRectangleOrDefault();
    
    public abstract int getPreferredRegionResource();
    
    public abstract void changePreferredRegionResource(int resource);
}