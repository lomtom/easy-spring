package com.lomtom.easy_spring.beans.factory.support;

import com.lomtom.easy_spring.beans.factory.config.BeanDefinition;

/**
 * @author lomtom
 * @date 2021/7/2 10:41
 **/
public interface BeanDefinitionRegistry {
    /**
     *
     * @param name
     * @param beanDefinition
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
