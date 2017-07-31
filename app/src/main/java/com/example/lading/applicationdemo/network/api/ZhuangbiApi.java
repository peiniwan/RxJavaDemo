// (c)2016 Flipboard Inc, All Rights Reserved.

package com.example.lading.applicationdemo.network.api;


import com.example.lading.applicationdemo.model.ZhuangbiImage;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ZhuangbiApi {
    @GET("search")
    Observable<List<ZhuangbiImage>> search(@Query("q") String query);
}
