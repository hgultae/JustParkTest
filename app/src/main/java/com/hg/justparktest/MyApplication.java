package com.hg.justparktest;

import android.app.Application;

import com.hg.justparktest.dagger.components.APIComponent;
import com.hg.justparktest.dagger.components.DaggerAPIComponent;
import com.hg.justparktest.dagger.components.DaggerNetComponent;
import com.hg.justparktest.dagger.components.NetComponent;
import com.hg.justparktest.dagger.modules.APIModule;
import com.hg.justparktest.dagger.modules.AppModule;
import com.hg.justparktest.dagger.modules.NetModule;
import com.hg.justparktest.utils.Constants;

/**
 * Created by Hurman on 17/07/2016.
 */
public class MyApplication extends Application {

    private NetComponent mNetComponent;
    private APIComponent mAPIComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // specify the full namespace of the component
        // Dagger_xxxx (where xxxx = component name)
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule(Constants.BASE_URL))
                .build();

        mAPIComponent = DaggerAPIComponent.builder()
                .netComponent(mNetComponent)
                .aPIModule(new APIModule())
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

    public APIComponent getAPIComponent() {
        return mAPIComponent;
    }

}
