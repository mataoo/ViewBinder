package com.matao.viewbinder.api.provider;

import android.content.Context;
import android.view.View;

/**
 * Created by matao on 2016-10-31 13:59
 */

public interface Provider {
    
    Context getContext(Object source);

    View findView(Object source, int id);
}
