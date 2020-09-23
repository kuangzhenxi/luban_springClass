package com.kzx.luban_spring_v1.util;

import com.kzx.luban_spring_v1.X;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class ZLBeanFactoryProcessor implements BeanFactoryPostProcessor {

    /**
     * 执行时间：扫描完成之后---类---beanDefinition之后
     * 在实例化bean之前执行
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("y");
        beanDefinition.setBeanClass(X.class);
    }
}
