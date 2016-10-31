package com.matao.viewbinder.api;

import com.matao.viewbinder.api.provider.Provider;

/**
 * Created by matao on 2016-10-31 14:35
 */

public interface Binder<T> {

    /**
     * @param host
     * @param source
     * @param provider
     */
    void inject(T host, Object source, Provider provider);
}
