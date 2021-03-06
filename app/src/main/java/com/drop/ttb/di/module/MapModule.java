package com.drop.ttb.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.drop.ttb.mvp.contract.MapContract;
import com.drop.ttb.mvp.model.MapModel;


@Module
public class MapModule {
    private MapContract.View view;

    /**
     * 构建MapModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MapModule(MapContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MapContract.View provideMapView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    MapContract.Model provideMapModel(MapModel model) {
        return model;
    }
}