package com.lomtom.easy_spring.beans.factory.config;

/**
 * @author: LOMTOM
 * @date: 2021/7/2
 * @time: 7:48
 */

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
