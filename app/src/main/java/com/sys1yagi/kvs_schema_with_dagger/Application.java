package com.sys1yagi.kvs_schema_with_dagger;

import com.sys1yagi.kvs_schema_with_dagger.dagger.components.AppComponent;
import com.sys1yagi.kvs_schema_with_dagger.dagger.components.DaggerAppComponent;
import com.sys1yagi.kvs_schema_with_dagger.dagger.modules.AppModule;

public class Application extends android.app.Application {

    static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

    }
}
