package com.sys1yagi.kvs_schema_with_dagger.activities;

import com.sys1yagi.kvs_schema_with_dagger.Application;
import com.sys1yagi.kvs_schema_with_dagger.R;
import com.sys1yagi.kvs_schema_with_dagger.preferences.GuidePreferenceProvider;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    static GuidePreferenceProvider guidePreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Application.getAppComponent().inject(this);
        setContentView(R.layout.activity_main);

        TextView title = (TextView) findViewById(R.id.title);
        title.setText("should show guide : " + guidePreference.get().getShouldShowGuide());

        guidePreference.get().putShouldShowGuide(true);
    }
}
