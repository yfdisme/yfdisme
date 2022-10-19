package com.yfd.Utils;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

public class YfdBeanUtils {
    /**
     * @param source
     * @param cl
     * @return
     */
    public static <V> V copyProperties(Object source, Class<V> cl) {
        V o = null;
        try {
            o = cl.newInstance();
            BeanUtils.copyProperties(source, o);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }


    public static <O, V> List<V> copyBeanList(List<O> sourceList, Class<V> clazz) {
        return sourceList.stream().map(item -> {
               return copyProperties(item,clazz);
        }).collect(Collectors.toList());
    }

}
