package com.matao.viewbinder.api;

import com.matao.viewbinder.api.provider.Provider;

/**
 * Created by matao on 2016-10-31 14:35
 */

public interface Binder<T> {

    /**
     * @param host     注解 View 变量所在的类
     * @param source   查找 View 的地方，Activity & View 自身就可以查找，Fragment 需要在自己的 itemView 中查找
     * @param provider 是一个接口，定义了不同对象（比如 Activity、View 等）如何去查找目标 View
     */
    void inject(T host, Object source, Provider provider);
}