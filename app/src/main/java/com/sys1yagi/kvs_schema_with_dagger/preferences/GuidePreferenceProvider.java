package com.sys1yagi.kvs_schema_with_dagger.preferences;

import android.content.Context;

public class GuidePreferenceProvider {

    GuidePreference guidePreference;

    public GuidePreferenceProvider(Context context) {
        this.guidePreference = GuidePreferenceSchema.create(context);
    }

    public GuidePreference get() {
        return guidePreference;
    }
}
