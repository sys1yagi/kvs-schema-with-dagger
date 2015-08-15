package com.sys1yagi.kvs_schema_with_dagger.dagger.modules;

import com.sys1yagi.kvs_schema_with_dagger.preferences.GuidePreferenceProvider;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public GuidePreferenceProvider provideGuidePreference() {
        return new GuidePreferenceProvider(context);
    }
}
