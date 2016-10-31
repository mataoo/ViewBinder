package com.matao.viewbinder.api.provider;

import android.content.Context;
import android.view.View;

/**
 * Created by matao on 2016-10-31 14:32
 */

public class ViewProvider implements Provider {

    @Override
    public Context getContext(Object source) {
        return ((View) source).getContext();
    }

    @Override
    public View findView(Object source, int id) {
        return ((View) source).findViewById(id);
    }
}
