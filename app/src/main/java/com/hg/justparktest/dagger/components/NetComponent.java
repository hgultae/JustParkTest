package com.hg.justparktest.dagger.components;

import com.hg.justparktest.dagger.modules.AppModule;
import com.hg.justparktest.dagger.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Hurman on 17/07/2016.
 */
@Singleton
@Component(modules = {NetModule.class, AppModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
