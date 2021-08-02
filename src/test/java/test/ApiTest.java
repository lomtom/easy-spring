package test;

import com.lomtom.easy_spring.beans.BeansException;
import com.lomtom.easy_spring.beans.factory.config.BeanDefinition;
import com.lomtom.easy_spring.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.bean.UserService;

/**
 * @author: LOMTOM
 * @date: 2021/7/2
 * @time: 8:06
 */

public class ApiTest {
    @Test
    public void test_BeanFactory() throws BeansException, InstantiationException, IllegalAccessException {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
        System.out.println(userService == userService_singleton);
    }
}
