package com.sys1yagi.kvs_schema_with_dagger.preferences;

import com.rejasupotaro.android.kvs.PrefSchema;
import com.rejasupotaro.android.kvs.annotations.Key;
import com.rejasupotaro.android.kvs.annotations.Table;

import android.content.Context;

@Table("guide")
public abstract class GuidePreferenceSchema extends PrefSchema {

    @Key("should_show_guide")
    boolean shouldShowGuide;

    public static GuidePreference create(Context context) {
        return new GuidePreference(context);
    }
}
