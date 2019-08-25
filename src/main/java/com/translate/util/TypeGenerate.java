package com.translate.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KingsWong on 2019/8/25.
 */
public class TypeGenerate {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static List<TypeGenerate> generate(Object object) {
        ArrayList<TypeGenerate> typeGenerates = new ArrayList<>();
        Class klass = object.getClass();
        Field[] fieldList = klass.getDeclaredFields();
        for(Field field : fieldList){
            TypeGenerate typeGenerate = new TypeGenerate();
            typeGenerate.setType(field.getType().getTypeName());
            typeGenerate.setName(field.getName());
            typeGenerates.add(typeGenerate);
        }
        return typeGenerates;
    }
}
