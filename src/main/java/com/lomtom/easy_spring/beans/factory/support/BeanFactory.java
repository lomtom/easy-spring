package com.lomtom.easy_spring.beans.factory.support;

import com.lomtom.easy_spring.beans.BeansException;
import com.lomtom.easy_spring.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: LOMTOM
 * @date: 2021/7/2
 * @time: 7:38
 */

public interface BeanFactory {

    /**
     *
     * @param name
     * @return
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;

    /**
     *
     * @param name
     * @param beanDefinition
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
