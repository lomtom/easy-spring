package com.lomtom.easy_spring.beans.factory.support;

import com.lomtom.easy_spring.beans.BeansException;
import com.lomtom.easy_spring.beans.factory.BeanFactory;
import com.lomtom.easy_spring.beans.factory.config.BeanDefinition;

/**
 * @author: LOMTOM
 * @date: 2021/7/2
 * @time: 7:50
 */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
