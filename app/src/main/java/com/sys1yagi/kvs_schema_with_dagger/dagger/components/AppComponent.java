package com.sys1yagi.kvs_schema_with_dagger.dagger.components;

import com.sys1yagi.kvs_schema_with_dagger.activities.MainActivity;
import com.sys1yagi.kvs_schema_with_dagger.dagger.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MainActivity target);
}
