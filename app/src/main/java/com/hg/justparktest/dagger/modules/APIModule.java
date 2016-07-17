package com.hg.justparktest.dagger.modules;

import com.hg.justparktest.dagger.scopes.Scopes;
import com.hg.justparktest.webservice.IWebService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Hurman on 17/07/2016.
 */
@Module
public class APIModule {

    @Provides
    @Scopes

    public IWebService providesJustparkInterface(Retrofit retrofit) {
        return retrofit.create(IWebService.class);
    }
}
