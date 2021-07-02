package com.lomtom.easy_spring.beans.factory.config;

/**
 * @Author: LOMTOM
 * @Date: 2021/7/2
 * @Time: 7:38
 */

public class BeanDefinition {

    Class bean;

    public BeanDefinition(Class bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return bean;
    }
}
