package com.hg.justparktest.dagger.components;

import com.hg.justparktest.dagger.modules.APIModule;
import com.hg.justparktest.dagger.scopes.Scopes;
import com.hg.justparktest.ui.MainActivity;
import com.hg.justparktest.ui.MapsActivity;

import dagger.Component;

/**
 * Created by Hurman on 17/07/2016.
 */
@Scopes
@Component(dependencies = NetComponent.class, modules = APIModule.class)
public interface APIComponent {
    void inject(MainActivity activity);
}
