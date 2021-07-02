package com.lomtom.easy_spring.beans.factory.support;

import com.lomtom.easy_spring.beans.BeansException;
import com.lomtom.easy_spring.beans.factory.config.BeanDefinition;

/**
 * @author: LOMTOM
 * @date: 2021/7/2
 * @time: 7:59
 */

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}