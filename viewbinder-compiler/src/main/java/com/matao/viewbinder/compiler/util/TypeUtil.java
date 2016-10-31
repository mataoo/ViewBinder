package com.matao.viewbinder.compiler.util;

import com.squareup.javapoet.ClassName;

/**
 * Created by matao on 2016-10-31 14:26
 */

public class TypeUtil {

    public static final ClassName ANDROID_VIEW = ClassName.get("android.view", "View");
    public static final ClassName ANDROID_ON_CLICK_LISTENER = ClassName.get("android.view", "View", "OnClickListener");
    public static final ClassName BINDER = ClassName.get("com.matao.viewbinder.api", "Binder");
    public static final ClassName PROVIDER = ClassName.get("com.matao.viewbinder.api.provider", "Provider");

}
