package com.matao.viewbinder.compiler.model;

import com.matao.viewbinder.annotation.OnClick;

import java.util.List;

import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Name;
import javax.lang.model.element.VariableElement;

/**
 * Created by matao on 2016-10-31 14:01
 */

public class OnClickMethod {

    private ExecutableElement mMethodElement;
    private Name mMethodName;
    private int[] mIds;

    public OnClickMethod(Element element) {
        if (element.getKind() != ElementKind.METHOD) {
            throw new IllegalArgumentException(
                    String.format("Only method can be annotated @%s", OnClick.class.getSimpleName()));
        }
        this.mMethodElement = (ExecutableElement) element;
        this.mIds = mMethodElement.getAnnotation(OnClick.class).value();

        if (mIds == null) {
            throw new IllegalArgumentException(String.format("Must set valid ids for @%s", OnClick.class.getSimpleName()));
        } else {
            for (int id : mIds) {
                if (id < 0) {
                    throw new IllegalArgumentException(String.format("Must set valid id for @%s", OnClick.class.getSimpleName()));
                }
            }
        }

        this.mMethodName = mMethodElement.getSimpleName();
        // method params count must equals 0
        List<? extends VariableElement> parameters = mMethodElement.getParameters();
        if (parameters.size() > 0) {
            throw new IllegalArgumentException(
                    String.format("The method annotated with @%s must have no parameters", OnClick.class.getSimpleName()));
        }
    }

    public Name getMethodName() {
        return mMethodName;
    }

    public int[] getIds() {
        return mIds;
    }
}
