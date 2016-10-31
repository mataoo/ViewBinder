package com.matao.viewbinder.api.provider;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/**
 * Created by matao on 2016-10-31 14:32
 */

public class ActivityProvider implements Provider {

    @Override
    public Context getContext(Object source) {
        return ((Activity) source);
    }

    @Override
    public View findView(Object source, int id) {
        return ((Activity) source).findViewById(id);
    }
}
